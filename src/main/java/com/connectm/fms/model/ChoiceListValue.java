package com.connectm.fms.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ChoiceListValue{

	@XmlElement private int choiceListValueId;
	@XmlElement private int choiceListId;
	@XmlElement private String choiceListValue;
	@XmlElement private String description;
	@XmlElement private int parentChoiceId;
	@XmlElement private boolean isDefault;
	@XmlElement private boolean isActive;
	@XmlElement private int systemDefined;
		
	/**
	 * default constructor
	 */
	public ChoiceListValue()
	{
		
	}

	/**
	 * @param choiceListValueId
	 * @param choiceListId
	 * @param choiceListValue
	 * @param description
	 * @param parentChoiceId
	 * @param isDefault
	 * @param isActive
	 * @param systemDefined
	 */
	public ChoiceListValue(int choiceListValueId, int choiceListId, String choiceListValue, String description,
			int parentChoiceId, boolean isDefault, boolean isActive, int systemDefined) {
		super();
		this.choiceListValueId = choiceListValueId;
		this.choiceListId = choiceListId;
		this.choiceListValue = choiceListValue;
		this.description = description;
		this.parentChoiceId = parentChoiceId;
		this.isDefault = isDefault;
		this.isActive = isActive;
		this.systemDefined = systemDefined;
	}

	/**
	 * @return the choiceListValueId
	 */
	public int getChoiceListValueId() {
		return choiceListValueId;
	}

	/**
	 * @param choiceListValueId the choiceListValueId to set
	 */
	public void setChoiceListValueId(int choiceListValueId) {
		this.choiceListValueId = choiceListValueId;
	}

	/**
	 * @return the choiceListId
	 */
	public int getChoiceListId() {
		return choiceListId;
	}

	/**
	 * @param choiceListId the choiceListId to set
	 */
	public void setChoiceListId(int choiceListId) {
		this.choiceListId = choiceListId;
	}

	/**
	 * @return the choiceListValue
	 */
	public String getChoiceListValue() {
		return choiceListValue;
	}

	/**
	 * @param choiceListValue the choiceListValue to set
	 */
	public void setChoiceListValue(String choiceListValue) {
		this.choiceListValue = choiceListValue;
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
	 * @return the parentChoiceId
	 */
	public int getParentChoiceId() {
		return parentChoiceId;
	}

	/**
	 * @param parentChoiceId the parentChoiceId to set
	 */
	public void setParentChoiceId(int parentChoiceId) {
		this.parentChoiceId = parentChoiceId;
	}

	/**
	 * @return the isDefault
	 */
	public boolean isDefault() {
		return isDefault;
	}

	/**
	 * @param isDefault the isDefault to set
	 */
	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	/**
	 * @return the isActive
	 */
	public boolean isActive() {
		return isActive;
	}

	/**
	 * @param isActive the isActive to set
	 */
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	/**
	 * @return the systemDefined
	 */
	public int getSystemDefined() {
		return systemDefined;
	}

	/**
	 * @param systemDefined the systemDefined to set
	 */
	public void setSystemDefined(int systemDefined) {
		this.systemDefined = systemDefined;
	}

	
	
}
