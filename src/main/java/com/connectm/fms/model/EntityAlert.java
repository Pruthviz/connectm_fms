package com.connectm.fms.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class EntityAlert{

	@XmlElement private int entityId;
	@XmlElement private int alertId;
	
		
	/**
	 * default constructor
	 */
	public EntityAlert()
	{
		
	}


	/**
	 * @param entityId
	 * @param alertId
	 */
	public EntityAlert(int entityId, int alertId) {
		super();
		this.entityId = entityId;
		this.alertId = alertId;
	}


	/**
	 * @return the entityId
	 */
	public int getEntityId() {
		return entityId;
	}


	/**
	 * @param entityId the entityId to set
	 */
	public void setEntityId(int entityId) {
		this.entityId = entityId;
	}


	/**
	 * @return the alertId
	 */
	public int getAlertId() {
		return alertId;
	}


	/**
	 * @param alertId the alertId to set
	 */
	public void setAlertId(int alertId) {
		this.alertId = alertId;
	}
	
	
}
