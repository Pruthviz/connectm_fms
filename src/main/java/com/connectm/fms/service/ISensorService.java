package com.connectm.fms.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.connectm.fms.model.Sensor;

@Path("/sensor")
public interface ISensorService {
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/createSensor")
	public Response createSensor(final Sensor sensor);
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/listSensor")
	public Response listSensor();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/updateSensor")
	public Response updateSensor(final Sensor modifiedSensor);
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/deleteSensor")
	public Response deleteSensor(final Sensor modifiedSensor);

}
