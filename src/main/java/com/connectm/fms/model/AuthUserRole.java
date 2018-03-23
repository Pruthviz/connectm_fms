package com.connectm.fms.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class AuthUserRole{

	@XmlElement private int authUserId;
	@XmlElement private int authRoleId;
	@XmlElement private String description;
		
	/**
	 * default constructor
	 */
	public AuthUserRole()
	{
		
	}

	/**
	 * @param authUserId
	 * @param authRoleId
	 * @param description
	 */
	public AuthUserRole(int authUserId, int authRoleId, String description) {
		super();
		this.authUserId = authUserId;
		this.authRoleId = authRoleId;
		this.description = description;
	}

	/**
	 * @return the authUserId
	 */
	public int getAuthUserId() {
		return authUserId;
	}

	/**
	 * @param authUserId the authUserId to set
	 */
	public void setAuthUserId(int authUserId) {
		this.authUserId = authUserId;
	}

	/**
	 * @return the authRoleId
	 */
	public int getAuthRoleId() {
		return authRoleId;
	}

	/**
	 * @param authRoleId the authRoleId to set
	 */
	public void setAuthRoleId(int authRoleId) {
		this.authRoleId = authRoleId;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	
}
