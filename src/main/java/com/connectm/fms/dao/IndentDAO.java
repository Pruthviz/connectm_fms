package com.connectm.fms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.connectm.fms.idao.IIndentDAO;
import com.connectm.fms.model.Indent;


public class IndentDAO implements IIndentDAO {
	private JdbcTemplate template;

	/**
	 * default constructor
	 */
	public IndentDAO() {
		
		
	}

	/**
	 * set JdbcTemplate
	 * 
	 * @param template
	 */
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	/**
	 * @param newIndent
	 * @return
	 */
	public int createIndent(final Indent indent){
		
		int indentId = 0;
		KeyHolder holder = new GeneratedKeyHolder();
		template.update(new PreparedStatementCreator() {

			public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
				PreparedStatement ps = connection.prepareStatement(INSERT_INDENT_SQL, new String[] { "indentId" });
				
				ps.setString(1, indent.getIndententNumber());
				ps.setString(2, indent.getReceiptNumber());
				ps.setDouble(3, indent.getQuantity());
				ps.setInt(4, indent.getChoiceListValueTypeId());
				ps.setInt(5, indent.getUserRequesterId());				
				ps.setDate(6, new java.sql.Date(indent.getIndentDate().getTime()));
				ps.setInt(7, indent.getCampusLevelSourceId());			
				ps.setInt(8, indent.getLevelEntityDestinationId());
				ps.setString(9, indent.getDescription());
				ps.setInt(10, indent.getChoiceListValueCurrentStatusId());
		        
				return ps;
			}
		}, holder);
		
		indentId = holder.getKey().intValue();
		
		return indentId;
	}
	
	/**
	 * @param modifiedIndent
	 */
	public void updateIndent(final Indent modifiedIndent){
		template.update(UPDATE_INDENT_SQL, 
				new Object[]{modifiedIndent.getIndententNumber(),modifiedIndent.getReceiptNumber(),modifiedIndent.getQuantity(),
						modifiedIndent.getChoiceListValueTypeId(),modifiedIndent.getUserRequesterId(),
						modifiedIndent.getIndentDate(),modifiedIndent.getCampusLevelSourceId(),
						modifiedIndent.getLevelEntityDestinationId(),modifiedIndent.getDescription(),
						modifiedIndent.getChoiceListValueCurrentStatusId()
						
		});
	}
	
	/**
	 * @param modifiedIndent
	 */
	public void deleteIndent(final Indent modifiedIndent){
		template.update(DELETE_INDENT_SQL, new Object[]{modifiedIndent.getIndentId()});
	}
	
	/**
	 * @return list of Indent
	 */
	public List<Indent> listIndent(){
		List<Indent> Indentlist = new ArrayList<Indent>();
		
		Indentlist = template.query(GET_INDENT_SQL, new RowMapper<Indent>(){

			
			public Indent mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Indent indent = new Indent();
				
				indent.setIndentId(rs.getInt("indent_id"));
				indent.setIndententNumber(rs.getString("indentent_number"));
				indent.setReceiptNumber(rs.getString("receipt_number"));
				indent.setQuantity(rs.getDouble("quantity"));
				indent.setChoiceListValueTypeId(rs.getInt("choice_list_value_type_id"));
				indent.setUserRequesterId(rs.getInt("user_requester_id"));
				indent.setIndentDate(new java.util.Date((rs.getDate("indent_date")).getTime()));
				indent.setCampusLevelSourceId(rs.getInt("campus_level_source_id"));
				indent.setLevelEntityDestinationId(rs.getInt("level_enity_destination_id"));
				indent.setDescription(rs.getString("description"));
				indent.setChoiceListValueCurrentStatusId(rs.getInt("choice_list_value_current_status_id"));			
				
				return indent;
			}
			
		});
		
		return Indentlist;
	}
}
