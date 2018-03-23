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

import com.connectm.fms.idao.IPropertyDAO;
import com.connectm.fms.model.Property;


public class PropertyDAO implements IPropertyDAO {
	private JdbcTemplate template;

	/**
	 * default constructor
	 */
	public PropertyDAO() {
		
		
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
	 * @param newProperty
	 * @return
	 */
	public int createProperty(final Property property){
		
		int propertyId = 0;
		KeyHolder holder = new GeneratedKeyHolder();
		template.update(new PreparedStatementCreator() {

			public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
				PreparedStatement ps = connection.prepareStatement(INSERT_PROPERTY_SQL, new String[] { "propertyId" });
				
				ps.setString(1, property.getPropertyName());
				ps.setInt(2, property.getChoiceListValuePropertyTypeId());
				ps.setString(3, property.getPropertyDescription());
				ps.setInt(4, property.getCampusLevelId());
		        
				return ps;
			}
		}, holder);
		propertyId = holder.getKey().intValue();
		
		return propertyId;
	}
	
	/**
	 * @param modifiedProperty
	 */
	public void updateProperty(final Property modifiedProperty){
		template.update(UPDATE_PROPERTY_SQL, 
				new Object[]{modifiedProperty.getPropertyName(),modifiedProperty.getChoiceListValuePropertyTypeId(),
						modifiedProperty.getPropertyDescription(),modifiedProperty.getCampusLevelId()
						
		});
	}
	
	/**
	 * @param modifiedProperty
	 */
	public void deleteProperty(final Property modifiedProperty){
		template.update(DELETE_PROPERTY_SQL, new Object[]{modifiedProperty.getPropertyId()});
	}
	
	/**
	 * @return list of Property
	 */
	public List<Property> listProperty(){
		List<Property> Propertylist = new ArrayList<Property>();
		
		Propertylist = template.query(GET_PROPERTY_SQL, new RowMapper<Property>(){

			
			public Property mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Property property = new Property();
				
				property.setPropertyId(rs.getInt("property_id"));
				property.setPropertyName(rs.getString("property_name"));
				property.setChoiceListValuePropertyTypeId(rs.getInt("choice_list_value_property_type_id"));
				property.setPropertyDescription(rs.getString("property_description"));
				property.setCampusLevelId(rs.getInt("campus_level_id"));				
				
				return property;
			}
			
		});
		
		return Propertylist;
	}
}
