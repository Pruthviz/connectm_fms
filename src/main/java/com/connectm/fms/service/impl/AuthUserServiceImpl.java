package com.connectm.fms.service.impl;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.connectm.fms.constant.IConstant;
import com.connectm.fms.dao.AssetDAO;
import com.connectm.fms.dao.AuthUserDAO;
import com.connectm.fms.dao.UserDAO;
import com.connectm.fms.error.DataValidation;
import com.connectm.fms.error.IDataValidation;
import com.connectm.fms.model.Asset;
import com.connectm.fms.model.AuthUser;
import com.connectm.fms.model.Organization;
import com.connectm.fms.model.User;
import com.connectm.fms.service.IAssetService;
import com.connectm.fms.service.IAuthUserService;

public class AuthUserServiceImpl implements IAuthUserService{

	@Autowired
	private AuthUserDAO authUserDAO;
	
	public Response createAuthUser(AuthUser authUser) 
	{
		DataValidation e = new DataValidation();
		
		if(authUser.getUserName()==null)
		{						
			e.setStatus(200);
			StringBuffer sb = new StringBuffer();
			if(authUser.getUserName()==null)
			{
				sb.append(IDataValidation.AUTHUSER_NAME_MISSING);
				
			}			
			e.setMessage(sb.toString());
			e.setData(authUser);
			return Response.ok(e).build();
		}
		else 
		{
			int authUserId = authUserDAO.createAuthUser(authUser);		
			
			authUser.setAuthUserId(authUserId);
			e.setData(authUser);
			e.setStatus(200);
			e.setMessage(IDataValidation.SUCCESS);	
			
			return Response.ok(e).build();
		}
		
	}

	public Response listAuthUser() {
		
		DataValidation e = new DataValidation();
		e.setStatus(200);
		e.setMessage(IDataValidation.SUCCESS);
		e.setData(authUserDAO.listAuthUser());
		return Response.ok(e).build();
	}

	public Response updateAuthUser(AuthUser modifiedAuthUser) 
	{		
		DataValidation e = new DataValidation();
		
		if(modifiedAuthUser.getAuthUserId()>0)
		{
			authUserDAO.updateAuthUser(modifiedAuthUser);
			e.setStatus(200);
			e.setMessage(IDataValidation.SUCCESS);
			e.setData(modifiedAuthUser);
			return Response.ok(e).build();
		}
		else
		{
			e.setStatus(200);
			e.setMessage(IDataValidation.AUTHUSER_ID_MISSING);			
			e.setData(modifiedAuthUser);
			return Response.ok(e).build();
		}
	}

	public Response deleteAuthUser(AuthUser modifiedAuthUser) {
		
		DataValidation e = new DataValidation();
		
		if(modifiedAuthUser.getAuthUserId()>0)
		{
			authUserDAO.deleteAuthUser(modifiedAuthUser);
			e.setStatus(200);
			e.setMessage(IDataValidation.SUCCESS);
			e.setData(modifiedAuthUser);
			return Response.ok(e).build();
		}
		else
		{
			e.setStatus(200);
			e.setMessage(IDataValidation.AUTHUSER_ID_MISSING);			
			e.setData(modifiedAuthUser);
			return Response.ok(e).build();
		}
	}

	public Response resetPassword(AuthUser modifiedAuthUser) 
	{		
		DataValidation e = new DataValidation();
		
		if(modifiedAuthUser.getAuthUserId()>0)
		{
			authUserDAO.resetPassword(modifiedAuthUser);
			e.setStatus(200);
			e.setMessage(IDataValidation.SUCCESS);
			e.setData(modifiedAuthUser);
			return Response.ok(e).build();
		}
		else
		{
			e.setStatus(200);
			e.setMessage(IDataValidation.AUTHUSER_ID_MISSING);			
			e.setData(modifiedAuthUser);
			return Response.ok(e).build();
		}
	}
	
	public Response lockAuthUser(AuthUser modifiedAuthUser) {
		
		DataValidation e = new DataValidation();
		
		if(modifiedAuthUser.getAuthUserId()>0)
		{
			authUserDAO.lockAuthUser(modifiedAuthUser);
			e.setStatus(200);
			e.setMessage(IDataValidation.SUCCESS);
			e.setData(modifiedAuthUser);
			return Response.ok(e).build();
		}
		else	
		{	
			e.setStatus(200);
			e.setMessage(IDataValidation.AUTHUSER_DOESNOT_EXIST);	
			e.setData(modifiedAuthUser);
			return Response.ok(e).build();
		}
	}

	public Response unlockAuthUser(AuthUser modifiedAuthUser) {
		
		DataValidation e = new DataValidation();
		
		if(modifiedAuthUser.getAuthUserId()>0)
		{
			authUserDAO.unlockAuthUser(modifiedAuthUser);
			e.setStatus(200);
			e.setMessage(IDataValidation.SUCCESS);
			e.setData(modifiedAuthUser);
			return Response.ok(e).build();
		}
		else	
		{	
			e.setStatus(200);
			e.setMessage(IDataValidation.AUTHUSER_DOESNOT_EXIST);
			e.setData(modifiedAuthUser);
			return Response.ok(e).build();
		}
	}

}
