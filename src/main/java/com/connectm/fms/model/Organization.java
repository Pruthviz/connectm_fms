package com.connectm.fms.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Organization{

	@XmlElement private int organizationId;
	@XmlElement private String organizationName;
	@XmlElement private int choiceListValueTypeId;
	@XmlElement private String subscriptionDate;
	@XmlElement private String expairyDate;
	@XmlElement private int choiceListValueSubscriptionTypeId;
	@XmlElement private String licenseNumber;
	@XmlElement private int lastModifiedUser;
	
	/**
	 * default constructor
	 */
	public Organization()
	{
		
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

	/**
	 * @return the organizationName
	 */
	public String getOrganizationName() {
		return organizationName;
	}

	/**
	 * @param organizationName the organizationName to set
	 */
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
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

	/**
	 * @return the subscriptionDate
	 */
	public String getSubscriptionDate() {
		return subscriptionDate;
	}

	/**
	 * @param subscriptionDate the subscriptionDate to set
	 */
	public void setSubscriptionDate(String subscriptionDate) {
		this.subscriptionDate = subscriptionDate;
	}

	/**
	 * @return the expairyDate
	 */
	public String getExpairyDate() {
		return expairyDate;
	}

	/**
	 * @param expairyDate the expairyDate to set
	 */
	public void setExpairyDate(String expairyDate) {
		this.expairyDate = expairyDate;
	}

	/**
	 * @return the choiceListValueSubscriptionTypeId
	 */
	public int getChoiceListValueSubscriptionTypeId() {
		return choiceListValueSubscriptionTypeId;
	}

	/**
	 * @param choiceListValueSubscriptionTypeId the choiceListValueSubscriptionTypeId to set
	 */
	public void setChoiceListValueSubscriptionTypeId(int choiceListValueSubscriptionTypeId) {
		this.choiceListValueSubscriptionTypeId = choiceListValueSubscriptionTypeId;
	}

	/**
	 * @return the licenseNumber
	 */
	public String getLicenseNumber() {
		return licenseNumber;
	}

	/**
	 * @param licenseNumber the licenseNumber to set
	 */
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	/**
	 * @return the lastModifiedUser
	 */
	public int getLastModifiedUser() {
		return lastModifiedUser;
	}

	/**
	 * @param lastModifiedUser the lastModifiedUser to set
	 */
	public void setLastModifiedUser(int lastModifiedUser) {
		this.lastModifiedUser = lastModifiedUser;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Organization [organizationId=" + organizationId + ", organizationName=" + organizationName
				+ ", choiceListValueTypeId=" + choiceListValueTypeId + ", subscriptionDate=" + subscriptionDate
				+ ", expairyDate=" + expairyDate + ", choiceListValueSubscriptionTypeId="
				+ choiceListValueSubscriptionTypeId + ", licenseNumber=" + licenseNumber + ", lastModifiedUser="
				+ lastModifiedUser + "]";
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + choiceListValueSubscriptionTypeId;
		result = prime * result + choiceListValueTypeId;
		result = prime * result + ((expairyDate == null) ? 0 : expairyDate.hashCode());
		result = prime * result + lastModifiedUser;
		result = prime * result + ((licenseNumber == null) ? 0 : licenseNumber.hashCode());
		result = prime * result + organizationId;
		result = prime * result + ((organizationName == null) ? 0 : organizationName.hashCode());
		result = prime * result + ((subscriptionDate == null) ? 0 : subscriptionDate.hashCode());
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
		Organization other = (Organization) obj;
		if (choiceListValueSubscriptionTypeId != other.choiceListValueSubscriptionTypeId)
			return false;
		if (choiceListValueTypeId != other.choiceListValueTypeId)
			return false;
		if (expairyDate == null) {
			if (other.expairyDate != null)
				return false;
		} else if (!expairyDate.equals(other.expairyDate))
			return false;
		if (lastModifiedUser != other.lastModifiedUser)
			return false;
		if (licenseNumber == null) {
			if (other.licenseNumber != null)
				return false;
		} else if (!licenseNumber.equals(other.licenseNumber))
			return false;
		if (organizationId != other.organizationId)
			return false;
		if (organizationName == null) {
			if (other.organizationName != null)
				return false;
		} else if (!organizationName.equals(other.organizationName))
			return false;
		if (subscriptionDate == null) {
			if (other.subscriptionDate != null)
				return false;
		} else if (!subscriptionDate.equals(other.subscriptionDate))
			return false;
		return true;
	}
	
	
	
	
	
	
}
