package com.connectm.fms.service.impl;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.connectm.fms.dao.PropertyDAO;
import com.connectm.fms.model.Property;
import com.connectm.fms.service.IPropertyService;

public class PropertyServiceImpl implements IPropertyService{

	@Autowired
	private PropertyDAO propertyDAO;
	
	public Response createProperty(Property newProperty) {
		propertyDAO.createProperty(newProperty);
		
		return Response.status(Response.Status.OK).build();
	}

	public Response listProperty() {
		return Response.ok(propertyDAO.listProperty()).build();
	}

	public Response updateProperty(Property modifiedProperty) {
		propertyDAO.updateProperty(modifiedProperty);
		
		return Response.status(Response.Status.OK).build();
	}

	public Response deleteProperty(Property modifiedProperty) {
		propertyDAO.deleteProperty(modifiedProperty);
		
		return Response.status(Response.Status.OK).build();
	}

}
