package com.connectm.fms.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CampusLevelEntity{

	@XmlElement private int levelEntityId;
	@XmlElement private int campusLevelId;
	@XmlElement private String name;
	@XmlElement private double maxCapacity;
	@XmlElement private String description;
	@XmlElement private int choiceListValueTypeId;
		
	/**
	 * default constructor
	 */
	public CampusLevelEntity()
	{
		
	}

	/**
	 * @param levelEntityId
	 * @param campusLevelId
	 * @param name
	 * @param maxCapacity
	 * @param description
	 * @param choiceListValueTypeId
	 */
	public CampusLevelEntity(int levelEntityId, int campusLevelId, String name, double maxCapacity, String description,
			int choiceListValueTypeId) {
		super();
		levelEntityId = levelEntityId;
		this.campusLevelId = campusLevelId;
		this.name = name;
		this.maxCapacity = maxCapacity;
		this.description = description;
		this.choiceListValueTypeId = choiceListValueTypeId;
	}

	/**
	 * @return the levelEntityId
	 */
	public int getLevelEntityId() {
		return levelEntityId;
	}

	/**
	 * @param levelEntityId the levelEntityId to set
	 */
	public void setLevelEntityId(int levelEntityId) {
		levelEntityId = levelEntityId;
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
	public double getMaxCapacity() {
		return maxCapacity;
	}

	/**
	 * @param maxCapacity the maxCapacity to set
	 */
	public void setMaxCapacity(double maxCapacity) {
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
