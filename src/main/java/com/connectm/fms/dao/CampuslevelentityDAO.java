
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

import com.connectm.fms.idao.ICampuslevelentityDAO;
import com.connectm.fms.model.Campuslevelentity;



public class CampuslevelentityDAO implements ICampuslevelentityDAO {
	private JdbcTemplate template;

	/**
	 * default constructor
	 */
	public CampuslevelentityDAO() {
		
		
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
	 * @param newCampuslevelentity
	 * @return
	 */
	public int createCampuslevelentity(final Campuslevelentity campuslevelentity){
		
		int levelEntityID = 0;
		KeyHolder holder = new GeneratedKeyHolder();
		template.update(new PreparedStatementCreator() {

			public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
				PreparedStatement ps = connection.prepareStatement(INSERT_CAMPUSLEVELENTITY_SQL, new String[] { "levelEntityID" });
				
				ps.setInt(1, campuslevelentity.getCampusLevelId());
				ps.setString(2, campuslevelentity.getName());
				ps.setDouble(3, campuslevelentity.getMaxCapacity());		
				ps.setString(4, campuslevelentity.getDescription());
				ps.setInt(5, campuslevelentity.getChoiceListValueTypeId());
		        
				return ps;
			}
		}, holder);
		levelEntityID = holder.getKey().intValue();
		
		return levelEntityID;
	}
	
	/**
	 * @param modifiedCampuslevelentity
	 */
	public void updateCampuslevelentity(final Campuslevelentity modifiedcampuslevelentity){
		template.update(UPDATE_CAMPUSLEVELENTITY_SQL, 
				new Object[]{modifiedcampuslevelentity.getCampusLevelId(),modifiedcampuslevelentity.getName(),
						modifiedcampuslevelentity.getMaxCapacity(),modifiedcampuslevelentity.getDescription(),
						modifiedcampuslevelentity.getChoiceListValueTypeId()
						
		});
	}
	
	/**
	 * @param modifiedCampuslevelentity
	 */
	public void deleteCampuslevelentity(final Campuslevelentity modifiedcampuslevelentity){
		template.update(DELETE_CAMPUSLEVELENTITY_SQL, new Object[]{modifiedcampuslevelentity.getLevelEntityID()});
	}
	
	/**
	 * @return list of Campuslevelentity
	 */
	public List<Campuslevelentity> listCampuslevelentity(){
		List<Campuslevelentity> Campuslevelentitylist = new ArrayList<Campuslevelentity>();
		
		Campuslevelentitylist = template.query(GET_CAMPUSLEVELENTITY_SQL, new RowMapper<Campuslevelentity>(){

			
			public Campuslevelentity mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Campuslevelentity campuslevelentity = new Campuslevelentity();
				
				campuslevelentity.setLevelEntityID(rs.getInt("level_entity_id"));
				campuslevelentity.setCampusLevelId(rs.getInt("campus_level_id"));
				campuslevelentity.setName(rs.getString("name"));
				campuslevelentity.setMaxCapacity(rs.getDouble("max_capacity"));
				campuslevelentity.setDescription(rs.getString("description"));
				campuslevelentity.setChoiceListValueTypeId(rs.getInt("choice_list_value_type_id"));						
				
				return campuslevelentity;
			}
			
		});
		
		return Campuslevelentitylist;
	}
}
