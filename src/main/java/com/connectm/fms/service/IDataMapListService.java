package com.connectm.fms.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.connectm.fms.model.DataMapList;

@Path("/datamaplist")
public interface IDataMapListService {
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/createDataMapList")
	public Response createDataMapList(final DataMapList dataMapList);
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/listDataMapList")
	public Response listDataMapList();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/updateDataMapList")
	public Response updateDataMapList(final DataMapList modifiedDataMapList);
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/deleteDataMapList")
	public Response deleteDataMapList(final DataMapList modifiedDataMapList);

}
