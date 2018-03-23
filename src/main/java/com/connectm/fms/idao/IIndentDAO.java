package com.connectm.fms.idao;

public interface IIndentDAO {
	static String INSERT_INDENT_SQL = "insert into indent (indentent_number,receipt_number,quantity,choice_list_value_type_id,user_requester_id,indent_date,campus_level_source_id,level_enity_destination_id,description,choice_list_value_current_status_id) "
			+ "values(?,?,?,?,?,?,?,?,?,?)";
				
	static String UPDATE_INDENT_SQL = "update indent set indentent_number = ?, receipt_number = ? , quantity = ?, choice_list_value_type_id = ?, "
			+ "user_requester_id = ?, indent_date = ? , campus_level_source_id = ? , level_enity_destination_id = ? , description = ? , choice_list_value_current_status_id = ? where indent_id = ?";
	
	static String DELETE_INDENT_SQL = "update indent set is_active = 1 where indent_id = ?";
	
	static String GET_INDENT_SQL = "select indent_id,indentent_number,receipt_number,quantity,choice_list_value_type_id,user_requester_id,indent_date,campus_level_source_id,level_enity_destination_id,description,choice_list_value_current_status_id"
			+ "from indent where is_deleted = 0 order by indent_id";
}
