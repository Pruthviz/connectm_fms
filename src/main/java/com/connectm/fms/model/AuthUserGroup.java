package com.connectm.fms.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class AuthUserGroup{

	@XmlElement private int authUserId;
	@XmlElement private int authGroupId;
	@XmlElement private String description;
		
	/**
	 * default constructor
	 */
	public AuthUserGroup()
	{
		
	}

	/**
	 * @param authUserId
	 * @param authGroupId
	 * @param description
	 */
	public AuthUserGroup(int authUserId, int authGroupId, String description) {
		super();
		this.authUserId = authUserId;
		this.authGroupId = authGroupId;
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
	 * @return the authGroupId
	 */
	public int getAuthGroupId() {
		return authGroupId;
	}

	/**
	 * @param authGroupId the authGroupId to set
	 */
	public void setAuthGroupId(int authGroupId) {
		this.authGroupId = authGroupId;
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
