package com.connectm.fms.idao;

public interface IDataMapList {
	static String INSERT_DATAMAPLIST_SQL = "insert into data_map_list (data_tag_name,sensor_id,asset_id,choice_list_value_status_id) "
			+ "values(?,?,?,?)";
				
	static String UPDATE_DATAMAPLIST_SQL = "update data_map_list set data_tag_name = ?, sensor_id = ? , asset_id = ?, "
			+ "choice_list_value_status_id = ? where map_id = ?";
	
	static String DELETE_DATAMAPLIST_SQL = "update data_map_list set is_deleted = 1 where map_id = ?";
	
	static String GET_DATAMAPLIST_SQL = "select map_id,data_tag_name,sensor_id,asset_id,choice_list_value_status_id"
			+ "from data_map_list where is_deleted = 0 order by map_id";
}
