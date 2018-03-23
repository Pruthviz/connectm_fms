package com.connectm.fms.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CampusLevelSensor{

	@XmlElement private int campusLevelId;
	@XmlElement private int sensorId;
	@XmlElement private String description;
		
	/**
	 * default constructor
	 */
	public CampusLevelSensor()
	{
		
	}

	/**
	 * @param campusLevelId
	 * @param sensorId
	 * @param description
	 */
	public CampusLevelSensor(int campusLevelId, int sensorId, String description) {
		super();
		this.campusLevelId = campusLevelId;
		this.sensorId = sensorId;
		this.description = description;
	}

	/**
	 * @return the campusLevelId
	 */
	public int getCampusLevelId() {
		return campusLevelId;
	}

	/**
	 * @param campusLevelId the campusLevelId to set
	 */
	public void setCampusLevelId(int campusLevelId) {
		this.campusLevelId = campusLevelId;
	}

	/**
	 * @return the sensorId
	 */
	public int getSensorId() {
		return sensorId;
	}

	/**
	 * @param sensorId the sensorId to set
	 */
	public void setSensorId(int sensorId) {
		this.sensorId = sensorId;
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
