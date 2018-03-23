package com.connectm.fms.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class AuthRolePermission{

	@XmlElement private int authRoleId;
	@XmlElement private int authObjectId;
	@XmlElement private String operationType;
	@XmlElement private String description;
		
	/**
	 * default constructor
	 */
	public AuthRolePermission()
	{
		
	}

	/**
	 * @param authRoleId
	 * @param authObjectId
	 * @param operationType
	 * @param description
	 */
	public AuthRolePermission(int authRoleId, int authObjectId, String operationType, String description) {
		super();
		this.authRoleId = authRoleId;
		this.authObjectId = authObjectId;
		this.operationType = operationType;
		this.description = description;
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
	 * @return the authObjectId
	 */
	public int getAuthObjectId() {
		return authObjectId;
	}

	/**
	 * @param authObjectId the authObjectId to set
	 */
	public void setAuthObjectId(int authObjectId) {
		this.authObjectId = authObjectId;
	}

	/**
	 * @return the operationType
	 */
	public String getOperationType() {
		return operationType;
	}

	/**
	 * @param operationType the operationType to set
	 */
	public void setOperationType(String operationType) {
		this.operationType = operationType;
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
