package com.connectm.fms.idao;

public interface IGatewayDAO {
	static String INSERT_GATEWAY_SQL = "insert into gateway (gateway_name,choice_list_value_status_id,port_number,communication_number,choice_list_value_communication_type_id,communication_url,choice_list_value_protocal_type_id,event_url) "
			+ "values(?,?,?,?,?,?,?,?)";
				
	static String UPDATE_GATEWAY_SQL = "update gateway set gateway_name = ?, choice_list_value_status_id = ? , port_number = ?, communication_number = ?, "
			+ "choice_list_value_communication_type_id = ?, communication_url = ? , choice_list_value_protocal_type_id = ? , event_url = ? where gateway_id = ?";
	
	static String DELETE_GATEWAY_SQL = "update gateway set is_active = 1 where gateway_id = ?";
	
	static String GET_GATEWAY_SQL = "select gateway_id,gateway_name,choice_list_value_status_id,port_number,communication_number,choice_list_value_communication_type_id,communication_url,choice_list_value_protocal_type_id,event_url"
			+ "from gateway where is_deleted = 0 order by gateway_id";
}
