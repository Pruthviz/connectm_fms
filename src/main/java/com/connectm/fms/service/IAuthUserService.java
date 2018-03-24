package com.connectm.fms.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.connectm.fms.model.Asset;
import com.connectm.fms.model.AuthUser;
import com.connectm.fms.model.Organization;
import com.connectm.fms.model.User;

@Path("/authuser")
public interface IAuthUserService {
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/createAuthUser")
	public Response createAuthUser(final AuthUser AuthUser);
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/listAuthUsers")
	public Response listAuthUser();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/updateAuthUser")
	public Response updateAuthUser(final AuthUser modifiedAuthUser);
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/deleteAuthUser")
	public Response deleteAuthUser(final AuthUser modifiedAuthUser);
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/resetPassword")
	public Response resetPassword(final AuthUser modifiedAuthUser);
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/lockAuthUser")
	public Response lockAuthUser(final AuthUser modifiedAuthUser);
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/unlockAuthUser")
	public Response unlockAuthUser(final AuthUser modifiedAuthUser);

}
