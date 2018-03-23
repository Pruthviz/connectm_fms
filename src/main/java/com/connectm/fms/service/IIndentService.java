package com.connectm.fms.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.connectm.fms.model.Indent;

@Path("/indent")
public interface IIndentService {
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/createIndent")
	public Response createIndent(final Indent indent);
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/listIndent")
	public Response listIndent();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/updateIndent")
	public Response updateIndent(final Indent modifiedIndent);
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/deleteIndent")
	public Response deleteIndent(final Indent modifiedIndent);

}
