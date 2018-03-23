package com.connectm.fms.idao;

public interface IPropertyDAO {
	static String INSERT_PROPERTY_SQL = "insert into property (property_name,choice_list_value_property_type_id,property_description,campus_level_id) "
			+ "values(?,?,?,?)";
				
	static String UPDATE_PROPERTY_SQL = "update property set property_name = ?, choice_list_value_property_type_id = ? , property_description = ?,  "
			+ "campus_level_id = ?, where property_id = ?";
	
	static String DELETE_PROPERTY_SQL = "update property set is_active = 1 where property_id = ?";
	
	static String GET_PROPERTY_SQL = "select property_id,property_name,choice_list_value_property_type_id,property_description,campus_level_id"
			+ "from property where is_deleted = 0 order by property_id";
}
