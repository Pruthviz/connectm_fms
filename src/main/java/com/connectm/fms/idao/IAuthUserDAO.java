package com.connectm.fms.idao;

public interface IAuthUserDAO {
	static String INSERT_AUTHUSER_SQL = "insert into auth_user (user_name, password , password_set_date , invalid_attempts) "
			+ "values(?,?,?,?)";
				
	static String UPDATE_AUTHUSER_SQL = "update auth_user set user_name = ?, password = ? , password_set_date = ? , invalid_attempts = ? "
			+ " where auth_user_id = ?";
	
	static String DELETE_AUTHUSER_SQL = "update auth_user set is_deleted = 1 where auth_user_id = ? ";
	
	static String GET_AUTHUSER_SQL = "select auth_user_id ,user_name, password_set_date , invalid_attempts " 
			+ "from auth_user where is_deleted = 0 order by auth_user_id";
	
	static String GET_AUTHUSERBYID_SQL = "select user_name, password , password_set_date , invalid_attempts " 
			+ "from auth_user where auth_user_id = ? ";
	
	static String UPDATE_AUTHUSER_PASSWORD_SQL = "update auth_user set password = ? where auth_user_id = ? ";
	
	static String LOCK_AUTHUSER_SQL = "update auth_user set is_active = 0 where auth_user_id = ? ";
	
	static String UNLOCK_AUTHUSER_SQL = "update auth_user set is_active = 1 where auth_user_id = ? ";
}
