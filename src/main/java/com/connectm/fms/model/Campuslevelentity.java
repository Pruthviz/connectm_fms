package com.connectm.fms.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Campuslevelentity{

	@XmlElement private int levelEntityID;
	@XmlElement private int campusLevelId;
	@XmlElement private String name;
	@XmlElement private Double maxCapacity;
	@XmlElement private String description;
	@XmlElement private int choiceListValueTypeId;
	
	/**
	 * default constructor
	 */
	public Campuslevelentity()
	{
		
	}

	/**
	 * @param levelEntityID
	 * @param campusLevelId
	 * @param name
	 * @param maxCapacity
	 * @param description
	 * @param choiceListValueTypeId
	 */
	public Campuslevelentity(int levelEntityID, int campusLevelId, String name, Double maxCapacity, String description,
			int choiceListValueTypeId) {
		super();
		this.levelEntityID = levelEntityID;
		this.campusLevelId = campusLevelId;
		this.name = name;
		this.maxCapacity = maxCapacity;
		this.description = description;
		this.choiceListValueTypeId = choiceListValueTypeId;
	}

	/**
	 * @return the levelEntityID
	 */
	public int getLevelEntityID() {
		return levelEntityID;
	}

	/**
	 * @param levelEntityID the levelEntityID to set
	 */
	public void setLevelEntityID(int levelEntityID) {
		this.levelEntityID = levelEntityID;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the maxCapacity
	 */
	public Double getMaxCapacity() {
		return maxCapacity;
	}

	/**
	 * @param maxCapacity the maxCapacity to set
	 */
	public void setMaxCapacity(Double maxCapacity) {
		this.maxCapacity = maxCapacity;
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

	/**
	 * @return the choiceListValueTypeId
	 */
	public int getChoiceListValueTypeId() {
		return choiceListValueTypeId;
	}

	/**
	 * @param choiceListValueTypeId the choiceListValueTypeId to set
	 */
	public void setChoiceListValueTypeId(int choiceListValueTypeId) {
		this.choiceListValueTypeId = choiceListValueTypeId;
	}

	
	
}
