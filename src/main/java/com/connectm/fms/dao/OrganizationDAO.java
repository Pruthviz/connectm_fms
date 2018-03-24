package com.connectm.fms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.connectm.fms.idao.IOrganizationDAO;
import com.connectm.fms.model.AuthUser;
import com.connectm.fms.model.Organization;




public class OrganizationDAO implements IOrganizationDAO {
	
	private JdbcTemplate template;

	/**
	 * default constructor
	 */
	public OrganizationDAO() {
	}

	/**
	 * set JdbcTemplate
	 * 
	 * @param template
	 */
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	/**
	 * @param newOrganization
	 * @return
	 */
	public int createOrganization(final Organization organization)
	{		
		int organizationId = 0;
		KeyHolder holder = new GeneratedKeyHolder();
		
		
		template.update(new PreparedStatementCreator() {
			
			public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
				PreparedStatement ps = connection.prepareStatement(INSERT_ORGANIZATION_SQL, new String[] { "organizationId" });
				ps.setString(1, organization.getOrganizationName());
				ps.setInt(2, organization.getChoiceListValueTypeId());
				ps.setString(3, organization.getSubscriptionDate());
				ps.setString(4, organization.getExpairyDate());
				ps.setInt(5, organization.getChoiceListValueSubscriptionTypeId());
				ps.setString(6, organization.getLicenseNumber());
				ps.setString(7, organization.getEmailId());
				return ps;
			}
		}, holder);
		
		organizationId = holder.getKey().intValue();
		
		final AuthUser authUser = new AuthUser();
		authUser.setUserName(organization.getOrganizationName()+"123");
		authUser.setPassword("password123");
		authUser.setInvalidAttempts(0);
		
		template.update(new PreparedStatementCreator() {
			
			public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
				PreparedStatement ps = connection.prepareStatement(INSERT_AUTHUSER_SQL, new String[] { "authUserId" });
				
				ps.setString(1, authUser.getUserName());
				ps.setString(2, authUser.getPassword());
				ps.setInt(3, authUser.getInvalidAttempts());				
				
				return ps;
			}
		}, holder);		
		
		return organizationId;
	}
	
	/**
	 * @param modifiedOrganization
	 */
	public void updateOrganization(final Organization modifiedOrganization)
	{
		System.out.println(modifiedOrganization);
		template.update(UPDATE_ORGANIZATION_SQL, 
				new Object[]{
								modifiedOrganization.getOrganizationName(), modifiedOrganization.getChoiceListValueTypeId(), 
								modifiedOrganization.getSubscriptionDate(), modifiedOrganization.getExpairyDate(), 
								modifiedOrganization.getChoiceListValueSubscriptionTypeId(),modifiedOrganization.getLicenseNumber(),
								modifiedOrganization.getOrganizationId()
						});
	}
	
	/**
	 * @param modifiedOrganization
	 */
	public void deleteOrganization(final Organization modifiedOrganization)
	{
		template.update(DELETE_ORGANIZATION_SQL, new Object[]{modifiedOrganization.getLastModifiedUser(), modifiedOrganization.getOrganizationId()});
	}
	
	/**
	 * @return list of organizations
	 */
	public List<Organization> listOrganizations(){
		List<Organization> organizationlist = new ArrayList<Organization>();
		
		organizationlist = template.query(GET_ORGANIZATION_SQL, new RowMapper<Organization>(){

			public Organization mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Organization organization = new Organization();
				
				organization.setOrganizationId(rs.getInt("organization_id"));
				organization.setOrganizationName(rs.getString("organization_name"));
				organization.setChoiceListValueTypeId(rs.getInt("choice_list_value_type_id"));
				organization.setSubscriptionDate(rs.getString("subscription_date"));
				organization.setExpairyDate(rs.getString("expairy_date"));
				organization.setChoiceListValueSubscriptionTypeId(rs.getInt("choice_list_value_subscription_type_id"));
				organization.setLicenseNumber(rs.getString("license_number"));
				organization.setEmailId(rs.getString("email_id"));
				
				return organization;
			}
			
		});
		
		return organizationlist;
	}
	
	/**
	 * @return View Organization
	 */
	@SuppressWarnings("unchecked")
	public Organization viewOrganization(int organization_id){
		
		Organization organization = new Organization();
		
		try {	
				
		organization = (Organization)template.queryForObject(GET_ORGANIZATIONBYID_SQL, new Object[]
		        { organization_id },new RowMapper(){

			public Organization mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Organization organization = new Organization();
				
				organization.setOrganizationId(rs.getInt("organization_id"));
				organization.setOrganizationName(rs.getString("organization_name"));
				organization.setChoiceListValueSubscriptionTypeId(rs.getInt("choice_list_value_type_id"));
				organization.setSubscriptionDate(rs.getString("subscription_date"));
				organization.setSubscriptionDate(rs.getString("expairy_date"));
				organization.setChoiceListValueSubscriptionTypeId(rs.getInt("choice_list_value_subscription_type_id"));
				organization.setLicenseNumber(rs.getString("license_number"));
				organization.setEmailId(rs.getString("email_id"));
				
				return organization;
			}
			
		});
		
		return organization;
		
		} catch (EmptyResultDataAccessException e) 
		{
			return null;
		}		
	}
	
	/**
	 * @param modifiedOrganization
	 */
	public void activateOrganization(final Organization modifiedOrganization)
	{
		template.update(ACTIVATE_ORGANIZATION_SQL, new Object[]{modifiedOrganization.getOrganizationId()});
	}
	
	/**
	 * @param modifiedOrganization
	 */
	public void deactivateOrganization(final Organization modifiedOrganization)
	{
		template.update(DEACTIVATE_ORGANIZATION_SQL, new Object[]{modifiedOrganization.getOrganizationId()});
	}
}
