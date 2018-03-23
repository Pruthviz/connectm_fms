package com.connectm.fms.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.connectm.fms.model.Property;

@Path("/property")
public interface IPropertyService {
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/createProperty")
	public Response createProperty(final Property property);
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/listProperty")
	public Response listProperty();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/updateProperty")
	public Response updateProperty(final Property modifiedProperty);
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/deleteProperty")
	public Response deleteProperty(final Property modifiedProperty);

}
