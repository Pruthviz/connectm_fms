package com.connectm.fms.idao;

public interface IAssetDAO {
	static String INSERT_ASSET_SQL = "insert into asset (asset_name, asset_make,asset_model,date_of_installation,quantity,warranty,action,campus_level_id) "
			+ "values(?,?,?,?,?,?,?,?)";
				
	static String UPDATE_ASSET_SQL = "update asset set asset_name = ?, asset_make = ? , asset_model = ?, date_of_installation = ?, "
			+ "quantity = ?, warranty = ? , action = ? , campus_level_id = ? where asset_id = ?";
	
	static String DELETE_ASSET_SQL = "update asset set is_active = 1 where asset_id = ?";
	
	static String GET_ASSET_SQL = "select asset_id,asset_name, asset_make,asset_model,date_of_installation,quantity,warranty,action,campus_level_id"
			+ "from asset where is_deleted = 0 order by asset_id";
}
