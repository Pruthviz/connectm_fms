package com.connectm.fms.service.impl;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.connectm.fms.constant.IConstant;
import com.connectm.fms.dao.OrganizationDAO;
import com.connectm.fms.error.DataValidation;
import com.connectm.fms.error.IDataValidation;
import com.connectm.fms.messageservice.EmailDispatcher;
import com.connectm.fms.model.Organization;
import com.connectm.fms.service.IOrganizationService;

public class OrganizationServiceImpl implements IOrganizationService{
	
	@Autowired
	private OrganizationDAO organizationDAO;	
	
	@Autowired
	private EmailDispatcher emailDispatcher;
	
	public Response createOrganization(Organization newOrg) {
		
		DataValidation e = new DataValidation();
		
		if((newOrg.getOrganizationName()==null)||newOrg.getEmailId()==null)
		{						
			e.setStatus(200);
			StringBuffer sb = new StringBuffer();
			if(newOrg.getOrganizationName()==null)
			{
				sb.append(IDataValidation.ORGANIZATION_NAME_MISSING);
				
			}
			if(newOrg.getEmailId()==null)
			{
				sb.append(" ");
				sb.append(IDataValidation.ORGANIZATION_EMAILID_MISSING);
			}
			
			e.setMessage(sb.toString());			
			return Response.ok(e).build();
		}
		else 
		{
			int orgid = organizationDAO.createOrganization(newOrg);	
			
			StringBuffer sb = new StringBuffer();
			sb.append("User Name : "+newOrg.getOrganizationName()+123);
			sb.append("  ");
			sb.append("Password  : "+"Password@123");
			
			newOrg.setOrganizationId(orgid);
			e.setData(newOrg);
			e.setStatus(200);
			e.setMessage(IDataValidation.SUCCESS);
			
			emailDispatcher.sendMail(IConstant.SENDER_EMAIL_ID,newOrg.getEmailId(), IConstant.ORGANIZATION_SUCCESSFULLY_CREATED,sb.toString());
			
			return Response.ok(e).build();
		}
	}

	public Response listOrganizations() 
	{		
		DataValidation e = new DataValidation();
		e.setStatus(200);
		e.setMessage(IDataValidation.SUCCESS);
		e.setData(organizationDAO.listOrganizations());
		return Response.ok(e).build();
	}

	@SuppressWarnings("unused")
	public Response updateOrganization(Organization modifiedOrg) 
	{		
		DataValidation e = new DataValidation();
		
		if(modifiedOrg.getOrganizationId()>0)
		{
			organizationDAO.updateOrganization(modifiedOrg);
			e.setStatus(200);
			e.setMessage(IDataValidation.SUCCESS);
			e.setData(modifiedOrg);
			return Response.ok(e).build();
		}
		else
		{
			e.setStatus(200);
			e.setMessage(IDataValidation.ORGANIZATION_ID_MISSING);			
			e.setData(modifiedOrg);
			return Response.ok(e).build();
		}
	}

	public Response deleteOrganization(Organization modifiedOrg) 
	{
		DataValidation e = new DataValidation();
		
		if(modifiedOrg.getOrganizationId()>0)
		{
			organizationDAO.deleteOrganization(modifiedOrg);
			e.setStatus(200);
			e.setMessage(IDataValidation.SUCCESS);
			e.setData(modifiedOrg);
			return Response.ok(e).build();
		}
		else
		{
			e.setStatus(200);
			e.setMessage(IDataValidation.ORGANIZATION_ID_MISSING);
			e.setData(modifiedOrg);
			return Response.ok(e).build();
		}
	}

	public Response viewOrganization(Organization modifiedOrg) 
	{		
		DataValidation e = new DataValidation();
		
		Organization organization = organizationDAO.viewOrganization(modifiedOrg.getOrganizationId());
		
		if(organization instanceof Organization)
		{	
			e.setData(organization);
			e.setStatus(200);
			e.setMessage(IDataValidation.SUCCESS);
			return Response.ok(e).build();				
		}
		else	
		{	
			e.setStatus(200);
			e.setMessage(IDataValidation.ORGANIZATION_DOESNOT_EXIST);	
			e.setData(modifiedOrg);
			return Response.ok(e).build();
		}
	}

	public Response activateOrganization(Organization modifiedOrg) {
		
		DataValidation e = new DataValidation();
		
		if(modifiedOrg.getOrganizationId()>0)
		{
			organizationDAO.activateOrganization(modifiedOrg);
			e.setStatus(200);
			e.setMessage(IDataValidation.SUCCESS);
			e.setData(modifiedOrg);
			return Response.ok(e).build();
		}
		else	
		{	
			e.setStatus(200);
			e.setMessage(IDataValidation.ORGANIZATION_DOESNOT_EXIST);	
			e.setData(modifiedOrg);
			return Response.ok(e).build();
		}
	}

	public Response deactivateOrganization(Organization modifiedOrg) {
		
		DataValidation e = new DataValidation();
		
		if(modifiedOrg.getOrganizationId()>0)
		{
			organizationDAO.deactivateOrganization(modifiedOrg);
			e.setStatus(200);
			e.setMessage(IDataValidation.SUCCESS);
			e.setData(modifiedOrg);
			return Response.ok(e).build();
		}
		else	
		{	
			e.setStatus(200);
			e.setMessage(IDataValidation.ORGANIZATION_DOESNOT_EXIST);
			e.setData(modifiedOrg);
			return Response.ok(e).build();
		}
	}

}
