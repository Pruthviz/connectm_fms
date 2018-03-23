package com.connectm.fms.service.impl;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.connectm.fms.dao.GatewayDAO;
import com.connectm.fms.model.Gateway;
import com.connectm.fms.service.IGatewayService;
public class GatewayServiceImpl implements IGatewayService{

	@Autowired
	private GatewayDAO gatewayDAO;
	
	public Response createGateway(Gateway newGateway) {
		gatewayDAO.createGateway(newGateway);
		
		return Response.status(Response.Status.OK).build();
	}

	public Response listGateway() {
		return Response.ok(gatewayDAO.listGateway()).build();
	}

	public Response updateGateway(Gateway modifiedGateway) {
		gatewayDAO.updateGateway(modifiedGateway);
		
		return Response.status(Response.Status.OK).build();
	}

	public Response deleteGateway(Gateway modifiedGateway) {
		gatewayDAO.deleteGateway(modifiedGateway);
		
		return Response.status(Response.Status.OK).build();
	}

}
