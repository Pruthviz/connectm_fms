package com.connectm.fms.service.impl;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.connectm.fms.dao.OrganizationDAO;
import com.connectm.fms.error.DataValidation;
import com.connectm.fms.error.IDataValidation;
import com.connectm.fms.model.Organization;
import com.connectm.fms.service.IOrganizationService;


public class OrganizationServiceImpl implements IOrganizationService{
	@Autowired
	private OrganizationDAO organizationDAO;

	public Response createOrganization(Organization newOrg) {
		
		DataValidation e = new DataValidation();
		
		if(newOrg.getOrganizationName()==null)
		{						
			e.setStatus(200);
			e.setMessage(IDataValidation.ORGANIZATION_NAME_MISSING);			
			return Response.ok(e).build();
		}
		else 
		{
			int orgid = organizationDAO.createOrganization(newOrg);			
			newOrg.setOrganizationId(orgid);
			e.setData(newOrg);
			e.setStatus(200);
			e.setMessage(IDataValidation.SUCCESS);
			
			return Response.ok(e).build();
		}
	}

	public Response listOrganizations() {
		return Response.ok(organizationDAO.listOrganizations()).build();
	}

	public Response updateOrganization(Organization modifiedOrg) {
		organizationDAO.updateOrganization(modifiedOrg);

		return Response.status(Response.Status.OK).build();
	}

	public Response deleteOrganization(Organization modifmodifiedOrg) {
		organizationDAO.deleteOrganization(modifmodifiedOrg);

		return Response.status(Response.Status.OK).build();
	}

	public Response viewOrganization(int id) {
		
		DataValidation e = new DataValidation();
		
		Organization organization = organizationDAO.viewOrganization(id);
		
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
			return Response.ok(e).build();
		}
	}

}
