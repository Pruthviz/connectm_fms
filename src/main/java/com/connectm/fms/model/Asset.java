package com.connectm.fms.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Asset{

	@XmlElement private int assetId;
	@XmlElement private String assetName;
	@XmlElement private String assetMake;
	@XmlElement private String assetModel;
	@XmlElement private Date dateOfInstallation;
	@XmlElement private Double quantity;
	@XmlElement private Date warranty;
	@XmlElement private int action;
	@XmlElement private int campusLevelId;
	
	/**
	 * default constructor
	 */
	public Asset()
	{
		
	}

	/**
	 * @param assetId
	 * @param assetName
	 * @param assetMake
	 * @param assetModel
	 * @param dateOfInstallation
	 * @param quantity
	 * @param warranty
	 * @param action
	 * @param campusLevelId
	 */
	public Asset(int assetId, String assetName, String assetMake, String assetModel, Date dateOfInstallation,
			Double quantity, Date warranty, int action, int campusLevelId) {
		super();
		this.assetId = assetId;
		this.assetName = assetName;
		this.assetMake = assetMake;
		this.assetModel = assetModel;
		this.dateOfInstallation = dateOfInstallation;
		this.quantity = quantity;
		this.warranty = warranty;
		this.action = action;
		this.campusLevelId = campusLevelId;
	}

	/**
	 * @return the assetId
	 */
	public int getAssetId() {
		return assetId;
	}

	/**
	 * @param assetId the assetId to set
	 */
	public void setAssetId(int assetId) {
		this.assetId = assetId;
	}

	/**
	 * @return the assetName
	 */
	public String getAssetName() {
		return assetName;
	}

	/**
	 * @param assetName the assetName to set
	 */
	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	/**
	 * @return the assetMake
	 */
	public String getAssetMake() {
		return assetMake;
	}

	/**
	 * @param assetMake the assetMake to set
	 */
	public void setAssetMake(String assetMake) {
		this.assetMake = assetMake;
	}

	/**
	 * @return the assetModel
	 */
	public String getAssetModel() {
		return assetModel;
	}

	/**
	 * @param assetModel the assetModel to set
	 */
	public void setAssetModel(String assetModel) {
		this.assetModel = assetModel;
	}

	/**
	 * @return the dateOfInstallation
	 */
	public Date getDateOfInstallation() {
		return dateOfInstallation;
	}

	/**
	 * @param dateOfInstallation the dateOfInstallation to set
	 */
	public void setDateOfInstallation(Date dateOfInstallation) {
		this.dateOfInstallation = dateOfInstallation;
	}

	/**
	 * @return the quantity
	 */
	public Double getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the warranty
	 */
	public Date getWarranty() {
		return warranty;
	}

	/**
	 * @param warranty the warranty to set
	 */
	public void setWarranty(Date warranty) {
		this.warranty = warranty;
	}

	/**
	 * @return the action
	 */
	public int getAction() {
		return action;
	}

	/**
	 * @param action the action to set
	 */
	public void setAction(int action) {
		this.action = action;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Asset [assetId=" + assetId + ", assetName=" + assetName + ", assetMake=" + assetMake + ", assetModel="
				+ assetModel + ", dateOfInstallation=" + dateOfInstallation + ", quantity=" + quantity + ", warranty="
				+ warranty + ", action=" + action + ", campusLevelId=" + campusLevelId + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + action;
		result = prime * result + assetId;
		result = prime * result + ((assetMake == null) ? 0 : assetMake.hashCode());
		result = prime * result + ((assetModel == null) ? 0 : assetModel.hashCode());
		result = prime * result + ((assetName == null) ? 0 : assetName.hashCode());
		result = prime * result + campusLevelId;
		result = prime * result + ((dateOfInstallation == null) ? 0 : dateOfInstallation.hashCode());
		result = prime * result + ((quantity == null) ? 0 : quantity.hashCode());
		result = prime * result + ((warranty == null) ? 0 : warranty.hashCode());
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
		Asset other = (Asset) obj;
		if (action != other.action)
			return false;
		if (assetId != other.assetId)
			return false;
		if (assetMake == null) {
			if (other.assetMake != null)
				return false;
		} else if (!assetMake.equals(other.assetMake))
			return false;
		if (assetModel == null) {
			if (other.assetModel != null)
				return false;
		} else if (!assetModel.equals(other.assetModel))
			return false;
		if (assetName == null) {
			if (other.assetName != null)
				return false;
		} else if (!assetName.equals(other.assetName))
			return false;
		if (campusLevelId != other.campusLevelId)
			return false;
		if (dateOfInstallation == null) {
			if (other.dateOfInstallation != null)
				return false;
		} else if (!dateOfInstallation.equals(other.dateOfInstallation))
			return false;
		if (quantity == null) {
			if (other.quantity != null)
				return false;
		} else if (!quantity.equals(other.quantity))
			return false;
		if (warranty == null) {
			if (other.warranty != null)
				return false;
		} else if (!warranty.equals(other.warranty))
			return false;
		return true;
	}

		
	
}
