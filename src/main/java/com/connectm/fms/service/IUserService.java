package com.connectm.fms.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.connectm.fms.model.User;

@Path("/user")
public interface IUserService {
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/createUser")
	public Response createUser(final User newUser);
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/listUsers")
	public Response listUsers();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/updateUser")
	public Response updateUser(final User modifiedUser);
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/deleteUser")
	public Response deleteUser(final User modifiedUser);

}
