package com.connectm.fms.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.connectm.fms.model.Asset;
import com.connectm.fms.model.User;

@Path("/asset")
public interface IAssetService {
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/createAsset")
	public Response createAsset(final Asset asset);
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/listAsset")
	public Response listAsset();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/updateAsset")
	public Response updateAsset(final Asset modifiedAsset);
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/deleteAsset")
	public Response deleteAsset(final Asset modifiedAsset);

}
