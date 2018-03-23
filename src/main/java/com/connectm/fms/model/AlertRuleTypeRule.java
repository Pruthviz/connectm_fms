package com.connectm.fms.model;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class AlertRuleTypeRule{

	@XmlElement private int ruleTypeValueId;	
	@XmlElement private int choiceListValueRuleTypeId;
	@XmlElement private String ruleValue;
	@XmlElement private String description;
	@XmlElement private int choiceListValueRuleValueTypeId;
	@XmlElement private int ruleId;
		
	/**
	 * default constructor
	 */
	public AlertRuleTypeRule()
	{
		
	}

	/**
	 * @param ruleTypeValueId
	 * @param choiceListValueRuleTypeId
	 * @param ruleValue
	 * @param description
	 * @param choiceListValueRuleValueTypeId
	 * @param ruleId
	 */
	public AlertRuleTypeRule(int ruleTypeValueId, int choiceListValueRuleTypeId, String ruleValue, String description,
			int choiceListValueRuleValueTypeId, int ruleId) {
		super();
		this.ruleTypeValueId = ruleTypeValueId;
		this.choiceListValueRuleTypeId = choiceListValueRuleTypeId;
		this.ruleValue = ruleValue;
		this.description = description;
		this.choiceListValueRuleValueTypeId = choiceListValueRuleValueTypeId;
		this.ruleId = ruleId;
	}

	/**
	 * @return the ruleTypeValueId
	 */
	public int getRuleTypeValueId() {
		return ruleTypeValueId;
	}

	/**
	 * @param ruleTypeValueId the ruleTypeValueId to set
	 */
	public void setRuleTypeValueId(int ruleTypeValueId) {
		this.ruleTypeValueId = ruleTypeValueId;
	}

	/**
	 * @return the choiceListValueRuleTypeId
	 */
	public int getChoiceListValueRuleTypeId() {
		return choiceListValueRuleTypeId;
	}

	/**
	 * @param choiceListValueRuleTypeId the choiceListValueRuleTypeId to set
	 */
	public void setChoiceListValueRuleTypeId(int choiceListValueRuleTypeId) {
		this.choiceListValueRuleTypeId = choiceListValueRuleTypeId;
	}

	/**
	 * @return the ruleValue
	 */
	public String getRuleValue() {
		return ruleValue;
	}

	/**
	 * @param ruleValue the ruleValue to set
	 */
	public void setRuleValue(String ruleValue) {
		this.ruleValue = ruleValue;
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
	 * @return the choiceListValueRuleValueTypeId
	 */
	public int getChoiceListValueRuleValueTypeId() {
		return choiceListValueRuleValueTypeId;
	}

	/**
	 * @param choiceListValueRuleValueTypeId the choiceListValueRuleValueTypeId to set
	 */
	public void setChoiceListValueRuleValueTypeId(int choiceListValueRuleValueTypeId) {
		this.choiceListValueRuleValueTypeId = choiceListValueRuleValueTypeId;
	}

	/**
	 * @return the ruleId
	 */
	public int getRuleId() {
		return ruleId;
	}

	/**
	 * @param ruleId the ruleId to set
	 */
	public void setRuleId(int ruleId) {
		this.ruleId = ruleId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AlertRuleTypeRule [ruleTypeValueId=" + ruleTypeValueId + ", choiceListValueRuleTypeId="
				+ choiceListValueRuleTypeId + ", ruleValue=" + ruleValue + ", description=" + description
				+ ", choiceListValueRuleValueTypeId=" + choiceListValueRuleValueTypeId + ", ruleId=" + ruleId + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + choiceListValueRuleTypeId;
		result = prime * result + choiceListValueRuleValueTypeId;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ruleId;
		result = prime * result + ruleTypeValueId;
		result = prime * result + ((ruleValue == null) ? 0 : ruleValue.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AlertRuleTypeRule other = (AlertRuleTypeRule) obj;
		if (choiceListValueRuleTypeId != other.choiceListValueRuleTypeId)
			return false;
		if (choiceListValueRuleValueTypeId != other.choiceListValueRuleValueTypeId)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (ruleId != other.ruleId)
			return false;
		if (ruleTypeValueId != other.ruleTypeValueId)
			return false;
		if (ruleValue == null) {
			if (other.ruleValue != null)
				return false;
		} else if (!ruleValue.equals(other.ruleValue))
			return false;
		return true;
	}	
		
	
	
}
