package com.connectm.fms.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Alert{

	@XmlElement private int alertId;
	@XmlElement private int choiceListValueType;
	@XmlElement private String source;
	@XmlElement private int choiceListValueStatusId;
	@XmlElement private String description;
	@XmlElement private int choiceListValueSeverityId;
	@XmlElement private Date timeOfOccurence;
	@XmlElement private String remarks;
	
		
	/**
	 * default constructor
	 */
	public Alert()
	{
		
	}


	/**
	 * @param alertId
	 * @param choiceListValueType
	 * @param source
	 * @param choiceListValueStatusId
	 * @param description
	 * @param choiceListValueSeverityId
	 * @param timeOfOccurence
	 * @param remarks
	 */
	public Alert(int alertId, int choiceListValueType, String source, int choiceListValueStatusId, String description,
			int choiceListValueSeverityId, Date timeOfOccurence, String remarks) {
		super();
		this.alertId = alertId;
		this.choiceListValueType = choiceListValueType;
		this.source = source;
		this.choiceListValueStatusId = choiceListValueStatusId;
		this.description = description;
		this.choiceListValueSeverityId = choiceListValueSeverityId;
		this.timeOfOccurence = timeOfOccurence;
		this.remarks = remarks;
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


	/**
	 * @return the choiceListValueType
	 */
	public int getChoiceListValueType() {
		return choiceListValueType;
	}


	/**
	 * @param choiceListValueType the choiceListValueType to set
	 */
	public void setChoiceListValueType(int choiceListValueType) {
		this.choiceListValueType = choiceListValueType;
	}


	/**
	 * @return the source
	 */
	public String getSource() {
		return source;
	}


	/**
	 * @param source the source to set
	 */
	public void setSource(String source) {
		this.source = source;
	}


	/**
	 * @return the choiceListValueStatusId
	 */
	public int getChoiceListValueStatusId() {
		return choiceListValueStatusId;
	}


	/**
	 * @param choiceListValueStatusId the choiceListValueStatusId to set
	 */
	public void setChoiceListValueStatusId(int choiceListValueStatusId) {
		this.choiceListValueStatusId = choiceListValueStatusId;
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
	 * @return the timeOfOccurence
	 */
	public Date getTimeOfOccurence() {
		return timeOfOccurence;
	}


	/**
	 * @param timeOfOccurence the timeOfOccurence to set
	 */
	public void setTimeOfOccurence(Date timeOfOccurence) {
		this.timeOfOccurence = timeOfOccurence;
	}


	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}


	/**
	 * @param remarks the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Alert [alertId=" + alertId + ", choiceListValueType=" + choiceListValueType + ", source=" + source
				+ ", choiceListValueStatusId=" + choiceListValueStatusId + ", description=" + description
				+ ", choiceListValueSeverityId=" + choiceListValueSeverityId + ", timeOfOccurence=" + timeOfOccurence
				+ ", remarks=" + remarks + "]";
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + alertId;
		result = prime * result + choiceListValueSeverityId;
		result = prime * result + choiceListValueStatusId;
		result = prime * result + choiceListValueType;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((remarks == null) ? 0 : remarks.hashCode());
		result = prime * result + ((source == null) ? 0 : source.hashCode());
		result = prime * result + ((timeOfOccurence == null) ? 0 : timeOfOccurence.hashCode());
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
		Alert other = (Alert) obj;
		if (alertId != other.alertId)
			return false;
		if (choiceListValueSeverityId != other.choiceListValueSeverityId)
			return false;
		if (choiceListValueStatusId != other.choiceListValueStatusId)
			return false;
		if (choiceListValueType != other.choiceListValueType)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (remarks == null) {
			if (other.remarks != null)
				return false;
		} else if (!remarks.equals(other.remarks))
			return false;
		if (source == null) {
			if (other.source != null)
				return false;
		} else if (!source.equals(other.source))
			return false;
		if (timeOfOccurence == null) {
			if (other.timeOfOccurence != null)
				return false;
		} else if (!timeOfOccurence.equals(other.timeOfOccurence))
			return false;
		return true;
	}	
	
	
		
	
}
