package com.connectm.fms.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Property{

	@XmlElement private int propertyId;
	@XmlElement private String propertyName;
	@XmlElement private int choiceListValuePropertyTypeId;
	@XmlElement private String propertyDescription;
	@XmlElement private int campusLevelId;
	
	/**
	 * default constructor
	 */
	public Property()
	{
		
	}

	/**
	 * @param propertyId
	 * @param propertyName
	 * @param choiceListValuePropertyTypeId
	 * @param propertyDescription
	 * @param campusLevelId
	 */
	public Property(int propertyId, String propertyName, int choiceListValuePropertyTypeId, String propertyDescription,
			int campusLevelId) {
		super();
		this.propertyId = propertyId;
		this.propertyName = propertyName;
		this.choiceListValuePropertyTypeId = choiceListValuePropertyTypeId;
		this.propertyDescription = propertyDescription;
		this.campusLevelId = campusLevelId;
	}

	/**
	 * @return the propertyId
	 */
	public int getPropertyId() {
		return propertyId;
	}

	/**
	 * @param propertyId the propertyId to set
	 */
	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}

	/**
	 * @return the propertyName
	 */
	public String getPropertyName() {
		return propertyName;
	}

	/**
	 * @param propertyName the propertyName to set
	 */
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	/**
	 * @return the choiceListValuePropertyTypeId
	 */
	public int getChoiceListValuePropertyTypeId() {
		return choiceListValuePropertyTypeId;
	}

	/**
	 * @param choiceListValuePropertyTypeId the choiceListValuePropertyTypeId to set
	 */
	public void setChoiceListValuePropertyTypeId(int choiceListValuePropertyTypeId) {
		this.choiceListValuePropertyTypeId = choiceListValuePropertyTypeId;
	}

	/**
	 * @return the propertyDescription
	 */
	public String getPropertyDescription() {
		return propertyDescription;
	}

	/**
	 * @param propertyDescription the propertyDescription to set
	 */
	public void setPropertyDescription(String propertyDescription) {
		this.propertyDescription = propertyDescription;
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

			
	
}
