package com.connectm.fms.service.impl;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.connectm.fms.dao.AssetDAO;
import com.connectm.fms.dao.UserDAO;
import com.connectm.fms.model.Asset;
import com.connectm.fms.model.User;
import com.connectm.fms.service.IAssetService;

public class AssetServiceImpl implements IAssetService{

	@Autowired
	private AssetDAO assetDAO;
	
	public Response createAsset(Asset newAsset) {
		assetDAO.createAsset(newAsset);
		
		return Response.status(Response.Status.OK).build();
	}

	public Response listAsset() {
		return Response.ok(assetDAO.listAssets()).build();
	}

	public Response updateAsset(Asset modifiedAsset) {
		assetDAO.updateAsset(modifiedAsset);
		
		return Response.status(Response.Status.OK).build();
	}

	public Response deleteAsset(Asset modifiedAsset) {
		assetDAO.deleteAsset(modifiedAsset);
		
		return Response.status(Response.Status.OK).build();
	}

}
