package com.connectm.fms.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.connectm.fms.model.Campuslevelentity;

@Path("/campusLevel")
public interface ICampusLevelEntityService {
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/createCampuslevelentity")
	public Response createCampuslevelentity(final Campuslevelentity campuslevelentity);
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/listCampuslevelentity")
	public Response listCampuslevelentity();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/updateCampuslevelentity")
	public Response updateCampuslevelentity(final Campuslevelentity modifiedCampuslevelentity);
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/deleteCampuslevelentity")
	public Response deleteCampuslevelentity(final Campuslevelentity modifiedCampuslevelentity);

}
