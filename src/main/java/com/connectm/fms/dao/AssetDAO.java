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

import com.connectm.fms.idao.IAssetDAO;
import com.connectm.fms.model.Asset;
import com.connectm.fms.model.User;


public class AssetDAO implements IAssetDAO {
	private JdbcTemplate template;

	/**
	 * default constructor
	 */
	public AssetDAO() {
		
		
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
	 * @param newAsset
	 * @return
	 */
	public int createAsset(final Asset asset){
		
		int assetId = 0;
		KeyHolder holder = new GeneratedKeyHolder();
		template.update(new PreparedStatementCreator() {

			public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
				PreparedStatement ps = connection.prepareStatement(INSERT_ASSET_SQL, new String[] { "assetId" });
				
				ps.setString(1, asset.getAssetName());
				ps.setString(2, asset.getAssetMake());
				ps.setString(3, asset.getAssetModel());
				ps.setDate(4, new java.sql.Date(asset.getDateOfInstallation().getTime()));
				ps.setDouble(5, asset.getQuantity());				
		        ps.setDate(6, new java.sql.Date(asset.getWarranty().getTime()));
		        ps.setInt(7, asset.getAction());
		        ps.setInt(8, asset.getCampusLevelId());
		        
				return ps;
			}
		}, holder);
		assetId = holder.getKey().intValue();
		
		return assetId;
	}
	
	/**
	 * @param modifiedAsset
	 */
	public void updateAsset(final Asset modifiedAsset){
		template.update(UPDATE_ASSET_SQL, 
				new Object[]{modifiedAsset.getAssetName(), modifiedAsset.getAssetMake(), modifiedAsset.getAssetModel(),										
						modifiedAsset.getDateOfInstallation(),modifiedAsset.getQuantity(),
						modifiedAsset.getWarranty(),modifiedAsset.getAction(),modifiedAsset.getCampusLevelId()
						
		});
	}
	
	/**
	 * @param modifiedAsset
	 */
	public void deleteAsset(final Asset modifiedAsset){
		template.update(DELETE_ASSET_SQL, new Object[]{modifiedAsset.getAssetId()});
	}
	
	/**
	 * @return list of Asset
	 */
	public List<Asset> listAssets(){
		List<Asset> Assetlist = new ArrayList<Asset>();
		
		Assetlist = template.query(GET_ASSET_SQL, new RowMapper<Asset>(){

			
			public Asset mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Asset asset = new Asset();
				
				asset.setAssetId(rs.getInt("asset_id"));								
				asset.setAssetName(rs.getString("asset_name"));
				asset.setAssetMake(rs.getString("asset_make"));
				asset.setAssetModel(rs.getString("asset_model"));
				asset.setDateOfInstallation(new java.util.Date((rs.getDate("date_of_installation")).getTime()));
				asset.setQuantity(rs.getDouble("quantity"));
				asset.setWarranty(new java.util.Date((rs.getDate("warranty")).getTime()));
				asset.setAction(rs.getInt("action"));
				asset.setAction(rs.getInt("campus_level_id"));				
				
				return asset;
			}
			
		});
		
		return Assetlist;
	}
}
