package com.connectm.fms.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class AlertRule{

	@XmlElement private int alertRuleId;
	@XmlElement private String dataTagName;
	@XmlElement private String description;
	@XmlElement private int choiceListValueSeverityId;
	@XmlElement private int autoClear;
		
	/**
	 * default constructor
	 */
	public AlertRule()
	{
		
	}

	/**
	 * @param alertRuleId
	 * @param dataTagName
	 * @param description
	 * @param choiceListValueSeverityId
	 * @param autoClear
	 */
	public AlertRule(int alertRuleId, String dataTagName, String description, int choiceListValueSeverityId,
			int autoClear) {
		super();
		this.alertRuleId = alertRuleId;
		this.dataTagName = dataTagName;
		this.description = description;
		this.choiceListValueSeverityId = choiceListValueSeverityId;
		this.autoClear = autoClear;
	}

	/**
	 * @return the alertRuleId
	 */
	public int getAlertRuleId() {
		return alertRuleId;
	}

	/**
	 * @param alertRuleId the alertRuleId to set
	 */
	public void setAlertRuleId(int alertRuleId) {
		this.alertRuleId = alertRuleId;
	}

	/**
	 * @return the dataTagName
	 */
	public String getDataTagName() {
		return dataTagName;
	}

	/**
	 * @param dataTagName the dataTagName to set
	 */
	public void setDataTagName(String dataTagName) {
		this.dataTagName = dataTagName;
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
	 * @return the choiceListValueSeverityId
	 */
	public int getChoiceListValueSeverityId() {
		return choiceListValueSeverityId;
	}

	/**
	 * @param choiceListValueSeverityId the choiceListValueSeverityId to set
	 */
	public void setChoiceListValueSeverityId(int choiceListValueSeverityId) {
		this.choiceListValueSeverityId = choiceListValueSeverityId;
	}

	/**
	 * @return the autoClear
	 */
	public int getAutoClear() {
		return autoClear;
	}

	/**
	 * @param autoClear the autoClear to set
	 */
	public void setAutoClear(int autoClear) {
		this.autoClear = autoClear;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AlertRule [alertRuleId=" + alertRuleId + ", dataTagName=" + dataTagName + ", description=" + description
				+ ", choiceListValueSeverityId=" + choiceListValueSeverityId + ", autoClear=" + autoClear + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + alertRuleId;
		result = prime * result + autoClear;
		result = prime * result + choiceListValueSeverityId;
		result = prime * result + ((dataTagName == null) ? 0 : dataTagName.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
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
		AlertRule other = (AlertRule) obj;
		if (alertRuleId != other.alertRuleId)
			return false;
		if (autoClear != other.autoClear)
			return false;
		if (choiceListValueSeverityId != other.choiceListValueSeverityId)
			return false;
		if (dataTagName == null) {
			if (other.dataTagName != null)
				return false;
		} else if (!dataTagName.equals(other.dataTagName))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		return true;
	}
		
	
	
}
