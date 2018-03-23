package com.connectm.fms.service.impl;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.connectm.fms.dao.CampuslevelentityDAO;
import com.connectm.fms.model.Campuslevelentity;
import com.connectm.fms.service.ICampusLevelEntityService;


public class CampuslevelentityServiceImpl implements ICampusLevelEntityService{

	@Autowired
	private CampuslevelentityDAO campuslevelentityDAO;
	
	public Response createCampuslevelentity(Campuslevelentity campuslevelentity) {
		campuslevelentityDAO.createCampuslevelentity(campuslevelentity);
		
		return Response.status(Response.Status.OK).build();
	}

	public Response listCampuslevelentity() {
		return Response.ok(campuslevelentityDAO.listCampuslevelentity()).build();
	}

	public Response updateCampuslevelentity(Campuslevelentity modifiedCampuslevelentity) {
		campuslevelentityDAO.updateCampuslevelentity(modifiedCampuslevelentity);
		
		return Response.status(Response.Status.OK).build();
	}

	public Response deleteCampuslevelentity(Campuslevelentity modifiedCampuslevelentity) {
		campuslevelentityDAO.deleteCampuslevelentity(modifiedCampuslevelentity);
		
		return Response.status(Response.Status.OK).build();
	}

}
