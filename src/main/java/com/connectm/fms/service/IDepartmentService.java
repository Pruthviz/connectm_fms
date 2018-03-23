package com.connectm.fms.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.connectm.fms.model.Asset;
import com.connectm.fms.model.Department;
import com.connectm.fms.model.User;

public interface IDepartmentService {
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/createDepartment")
	public Response createDepartment(final Department department);
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/listDepartment")
	public Response listDepartment();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/updateDepartment")
	public Response updateDepartment(final Department modifiedDepartment);
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/deleteDepartment")
	public Response deleteDepartment(final Department modifiedDepartment);

}
