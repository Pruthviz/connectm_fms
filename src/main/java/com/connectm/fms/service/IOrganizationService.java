package com.connectm.fms.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.connectm.fms.model.Organization;

@Path("/organization")
public interface IOrganizationService {
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/createOrganization")
	public Response createOrganization(final Organization newOrg);
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/listOrganizations")
	public Response listOrganizations();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/updateOrganization")
	public Response updateOrganization(final Organization modifiedOrg);
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/deleteOrganization")
	public Response deleteOrganization(final Organization modifmodifiedOrg);
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/viewOrganization")
	public Response viewOrganization(final Organization modifiedOrg);
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/activateOrganization")
	public Response activateOrganization(final Organization modifiedOrg);
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/deactivateOrganization")
	public Response deactivateOrganization(final Organization modifiedOrg);

}
