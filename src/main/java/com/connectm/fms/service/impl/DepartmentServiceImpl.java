package com.connectm.fms.service.impl;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.connectm.fms.dao.DepartmentDAO;
import com.connectm.fms.model.Department;
import com.connectm.fms.service.IDepartmentService;

@Path("/department")
public class DepartmentServiceImpl implements IDepartmentService{

	@Autowired
	private DepartmentDAO departmentDAO;
	
	public Response createDepartment(Department department) {
		departmentDAO.createDepartment(department);
		
		return Response.status(Response.Status.OK).build();
	}

	public Response listDepartment() {
		return Response.ok(departmentDAO.listDepartment()).build();
	}

	public Response updateDepartment(Department modifiedDepartment) {
		departmentDAO.updateDepartment(modifiedDepartment);
		
		return Response.status(Response.Status.OK).build();
	}

	public Response deleteDepartment(Department modifiedDepartment) {
		departmentDAO.deleteDepartment(modifiedDepartment);
		
		return Response.status(Response.Status.OK).build();
	}

}
