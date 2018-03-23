package com.connectm.fms.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CampusLevel{

	@XmlElement private int campusLevelId;
	@XmlElement private String levelName;
	@XmlElement private double lat;
	@XmlElement private double lon;
	@XmlElement private int choiceListValueLevelTypeId;
	@XmlElement private int organizationId;
		
	/**
	 * default constructor
	 */
	public CampusLevel()
	{
		
	}

	/**
	 * @param campusLevelId
	 * @param levelName
	 * @param lat
	 * @param lon
	 * @param choiceListValueLevelTypeId
	 * @param organizationId
	 */
	public CampusLevel(int campusLevelId, String levelName, double lat, double lon, int choiceListValueLevelTypeId,
			int organizationId) {
		super();
		this.campusLevelId = campusLevelId;
		this.levelName = levelName;
		this.lat = lat;
		this.lon = lon;
		this.choiceListValueLevelTypeId = choiceListValueLevelTypeId;
		this.organizationId = organizationId;
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
	 * @return the levelName
	 */
	public String getLevelName() {
		return levelName;
	}

	/**
	 * @param levelName the levelName to set
	 */
	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}

	/**
	 * @return the lat
	 */
	public double getLat() {
		return lat;
	}

	/**
	 * @param lat the lat to set
	 */
	public void setLat(double lat) {
		this.lat = lat;
	}

	/**
	 * @return the lon
	 */
	public double getLon() {
		return lon;
	}

	/**
	 * @param lon the lon to set
	 */
	public void setLon(double lon) {
		this.lon = lon;
	}

	/**
	 * @return the choiceListValueLevelTypeId
	 */
	public int getChoiceListValueLevelTypeId() {
		return choiceListValueLevelTypeId;
	}

	/**
	 * @param choiceListValueLevelTypeId the choiceListValueLevelTypeId to set
	 */
	public void setChoiceListValueLevelTypeId(int choiceListValueLevelTypeId) {
		this.choiceListValueLevelTypeId = choiceListValueLevelTypeId;
	}

	/**
	 * @return the organizationId
	 */
	public int getOrganizationId() {
		return organizationId;
	}

	/**
	 * @param organizationId the organizationId to set
	 */
	public void setOrganizationId(int organizationId) {
		this.organizationId = organizationId;
	}
	
	
}
