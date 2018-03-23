package com.connectm.fms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.connectm.fms.idao.IDataMapList;
import com.connectm.fms.model.DataMapList;


public class DataMapListDao implements IDataMapList {
	private JdbcTemplate template;

	/**
	 * default constructor
	 */
	public DataMapListDao() {
		
		
	}

	/**
	 * set JdbcTemplate
	 * 
	 * @param template
	 */
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	/**
	 * @param newDataMapList
	 * @return
	 */
	public int createDataMapList(final DataMapList dataMapList){
		
		int mapId = 0;
		KeyHolder holder = new GeneratedKeyHolder();
		template.update(new PreparedStatementCreator() {

			public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
				PreparedStatement ps = connection.prepareStatement(INSERT_DATAMAPLIST_SQL, new String[] { "mapId" });
				
				ps.setString(1, dataMapList.getDataTagName());
		        ps.setInt(2, dataMapList.getSensorId());
		        ps.setInt(3, dataMapList.getAssetId());
		        ps.setInt(4, dataMapList.getChoiceListValueStatusId());
		        
				return ps;
			}
		}, holder);
		mapId = holder.getKey().intValue();
		
		return mapId;
	}
	
	/**
	 * @param modifiedDataMapList
	 */
	public void updateDataMapList(final DataMapList modifiedDataMapList){
		template.update(UPDATE_DATAMAPLIST_SQL, 
				new Object[]{
						modifiedDataMapList.getDataTagName(),modifiedDataMapList.getSensorId(),
						modifiedDataMapList.getAssetId(),modifiedDataMapList.getChoiceListValueStatusId(),
						modifiedDataMapList.getMapId()
						
		});
	}
	
	/**
	 * @param modifiedDataMapList
	 */
	public void deleteDataMapList(final DataMapList modifiedDataMapList){
		template.update(DELETE_DATAMAPLIST_SQL, new Object[]{modifiedDataMapList.getMapId()});
	}
	
	/**
	 * @return list of DataMapList
	 */
	public List<DataMapList> listDataMapList(){
		List<DataMapList> DataMapListlist = new ArrayList<DataMapList>();
		
		DataMapListlist = template.query(GET_DATAMAPLIST_SQL, new RowMapper<DataMapList>(){

			
			public DataMapList mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				DataMapList dataMapList = new DataMapList();
				
				dataMapList.setMapId(rs.getInt("map_id"));
				dataMapList.setDataTagName(rs.getString("data_tag_name"));
				dataMapList.setSensorId(rs.getInt("sensor_id"));
				dataMapList.setAssetId(rs.getInt("asset_id"));
				dataMapList.setChoiceListValueStatusId(rs.getInt("choice_list_value_status_id"));
						
				
				return dataMapList;
			}
			
		});
		
		return DataMapListlist;
	}
}
