package com.connectm.fms.idao;

public interface IUserDAO {
	static String INSERT_USER_SQL = "insert into user (first_name, last_name, gender,role_id,department_id,email_id,phone_number,date_of_joining,is_active,user_image,auth_user_id,account_locked,default_password_reset,valid_upto,user_superviour_id) "
			+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				
	static String UPDATE_USER_SQL = "update user set first_name = ?, last_name = ? , gender = ?, role_id = ?, department_id = ?, email_id = ?, phone_number = ?,"
			+ "date_of_joining = ?, is_active = ? , user_image = ? , auth_user_id = ? ,account_locked = ?,default_password_reset = ?,valid_upto = ?,user_superviour_id = ? where user_id = ?";
	
	static String DELETE_USER_SQL = "update user set is_deleted = 1 where user_id = ?";
	
	static String GET_USER_SQL = "select user_id,first_name, last_name, gender,role_id,department_id,email_id,phone_number,date_of_joining,is_active,user_image,auth_user_id,account_locked,default_password_reset,valid_upto,user_superviour_id"
			+ " from user where is_deleted = 0 order by user_id";
}
