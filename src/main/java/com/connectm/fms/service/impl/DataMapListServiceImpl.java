package com.connectm.fms.service.impl;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.connectm.fms.dao.AssetDAO;
import com.connectm.fms.dao.DataMapListDao;
import com.connectm.fms.dao.UserDAO;
import com.connectm.fms.model.Asset;
import com.connectm.fms.model.DataMapList;
import com.connectm.fms.model.User;
import com.connectm.fms.service.IAssetService;
import com.connectm.fms.service.IDataMapListService;

public class DataMapListServiceImpl implements IDataMapListService{

	@Autowired
	private DataMapListDao dataMapListDao;
	
	public Response createDataMapList(DataMapList newDataMapList) {
		dataMapListDao.createDataMapList(newDataMapList);
		
		return Response.status(Response.Status.OK).build();
	}

	public Response listDataMapList() {
		return Response.ok(dataMapListDao.listDataMapList()).build();
	}

	public Response updateDataMapList(DataMapList modifiedDataMapList) {
		dataMapListDao.updateDataMapList(modifiedDataMapList);
		
		return Response.status(Response.Status.OK).build();
	}

	public Response deleteDataMapList(DataMapList modifiedDataMapList) {
		dataMapListDao.deleteDataMapList(modifiedDataMapList);
		
		return Response.status(Response.Status.OK).build();
	}

}
