package com.connectm.fms.service.impl;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.connectm.fms.dao.UserDAO;
import com.connectm.fms.model.User;
import com.connectm.fms.service.IUserService;

public class UserServiceImpl implements IUserService{

	@Autowired
	private UserDAO userDAO;
	
	public Response createUser(User newUser) {
		userDAO.createUser(newUser);
		
		return Response.status(Response.Status.OK).build();
	}

	public Response listUsers() {
		return Response.ok(userDAO.listUsers()).build();
	}

	public Response updateUser(User modifiedUser) {
		userDAO.updateUser(modifiedUser);
		
		return Response.status(Response.Status.OK).build();
	}

	public Response deleteUser(User modifiedUser) {
		userDAO.deleteUser(modifiedUser);
		
		return Response.status(Response.Status.OK).build();
	}

}
