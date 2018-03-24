package com.connectm.fms.idao;

public interface IOrganizationDAO {
	static String INSERT_ORGANIZATION_SQL = "insert into organization (organization_name, choice_list_value_type_id, subscription_date,expairy_date,choice_list_value_subscription_type_id,license_number,email_id) "
			+ "values(?,?,?,?,?,?,?)";
	
	static String INSERT_AUTHUSER_SQL = "insert into auth_user (user_name, password, invalid_attempts) "
			+ "values(?,?,?)";
				
	static String UPDATE_ORGANIZATION_SQL = "update organization set organization_name = ?, choice_list_value_type_id = ?,"
			+ "subscription_date = ?, expairy_date = ? , choice_list_value_subscription_type_id = ? , license_number = ? where organization_id = ?";
	
	static String DELETE_ORGANIZATION_SQL = "update organization set is_deleted = 1, last_modified_user = ? where organization_id = ?";
	
	static String GET_ORGANIZATION_SQL = "select organization_id, organization_name, choice_list_value_type_id, subscription_date , expairy_date ,choice_list_value_subscription_type_id, license_number ,email_id"
			+ " from organization where is_deleted = 0 order by organization_id";
	
	static String GET_ORGANIZATIONBYID_SQL = "select organization_id, organization_name, choice_list_value_type_id, subscription_date , expairy_date ,choice_list_value_subscription_type_id, license_number,email_id"
			+ " from organization where organization_id = ?";
	
	static String ACTIVATE_ORGANIZATION_SQL = "update organization set is_active = 1 where organization_id = ?";
	
	static String DEACTIVATE_ORGANIZATION_SQL = "update organization set is_active = 0 where organization_id = ?";
}