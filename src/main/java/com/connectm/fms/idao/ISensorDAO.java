package com.connectm.fms.idao;

public interface ISensorDAO {
	static String INSERT_SENSOR_SQL = "insert into sensor (sensor_name,sensor_manufacture,manufacturing_date,choice_list_value_sensor_type_id,sensor_model) "
			+ "values(?,?,?,?,?)";
				
	static String UPDATE_SENSOR_SQL = "update sensor set sensor_name = ?, sensor_manufacture = ? , manufacturing_date = ?, choice_list_value_sensor_type_id = ?, "
			+ "sensor_model = ? where sensor_id = ?";
	
	static String DELETE_SENSOR_SQL = "update sensor set is_active = 1 where sensor_id = ?";
	
	static String GET_SENSOR_SQL = "select sensor_id,sensor_name,sensor_manufacture,manufacturing_date,choice_list_value_sensor_type_id,sensor_model"
			+ "from sensor where is_deleted = 0 order by sensor_id";
}
