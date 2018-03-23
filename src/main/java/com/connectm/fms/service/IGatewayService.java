package com.connectm.fms.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.connectm.fms.model.Gateway;

@Path("/gateway")
public interface IGatewayService {
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/createGateway")
	public Response createGateway(final Gateway gateway);
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/listGateway")
	public Response listGateway();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/updateGateway")
	public Response updateGateway(final Gateway modifiedGateway);
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/deleteGateway")
	public Response deleteGateway(final Gateway modifiedGateway);

}
