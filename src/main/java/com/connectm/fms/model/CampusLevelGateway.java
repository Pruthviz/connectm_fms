package com.connectm.fms.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CampusLevelGateway{

	@XmlElement private int levelId;
	@XmlElement private int gatewayId;
	@XmlElement private String description;
		
	/**
	 * default constructor
	 */
	public CampusLevelGateway()
	{
		
	}

	/**
	 * @param levelId
	 * @param gatewayId
	 * @param description
	 */
	public CampusLevelGateway(int levelId, int gatewayId, String description) {
		super();
		this.levelId = levelId;
		this.gatewayId = gatewayId;
		this.description = description;
	}

	/**
	 * @return the levelId
	 */
	public int getLevelId() {
		return levelId;
	}

	/**
	 * @param levelId the levelId to set
	 */
	public void setLevelId(int levelId) {
		this.levelId = levelId;
	}

	/**
	 * @return the gatewayId
	 */
	public int getGatewayId() {
		return gatewayId;
	}

	/**
	 * @param gatewayId the gatewayId to set
	 */
	public void setGatewayId(int gatewayId) {
		this.gatewayId = gatewayId;
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
