package com.connectm.fms.idao;

public interface ICampuslevelentityDAO {
	static String INSERT_CAMPUSLEVELENTITY_SQL = "insert into campus_level_entity (campus_level_id,name,max_capacity,description,choice_list_value_type_id) "
			+ "values(?,?,?,?,?)";
				
	static String UPDATE_CAMPUSLEVELENTITY_SQL = "update campus_level_entity set campus_level_id = ?, name = ? , max_capacity = ?, description = ?, "
			+ "choice_list_value_type_id = ? where level_entity_id = ?";
	
	static String DELETE_CAMPUSLEVELENTITY_SQL = "update campus_level_entity set is_active = 1 where level_entity_id = ?";
	
	static String GET_CAMPUSLEVELENTITY_SQL = "select campus_level_id,name,max_capacity,description,choice_list_value_type_id"
			+ "from campus_level_entity where is_deleted = 0 order by level_entity_id";
}
