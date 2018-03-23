package com.connectm.fms.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ChoiceList{

	@XmlElement private int choiceListId;
	@XmlElement private String choiceListCode;
	@XmlElement private String description;
	@XmlElement private int systemDefined;
		
	/**
	 * default constructor
	 */
	public ChoiceList()
	{
		
	}

	/**
	 * @param choiceListId
	 * @param choiceListCode
	 * @param description
	 * @param systemDefined
	 */
	public ChoiceList(int choiceListId, String choiceListCode, String description, int systemDefined) {
		super();
		this.choiceListId = choiceListId;
		this.choiceListCode = choiceListCode;
		this.description = description;
		this.systemDefined = systemDefined;
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
	 * @return the choiceListCode
	 */
	public String getChoiceListCode() {
		return choiceListCode;
	}

	/**
	 * @param choiceListCode the choiceListCode to set
	 */
	public void setChoiceListCode(String choiceListCode) {
		this.choiceListCode = choiceListCode;
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
