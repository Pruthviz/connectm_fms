package com.connectm.fms.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class AssetSensor{

	@XmlElement private int assetId;
	@XmlElement private int sensorId;
	@XmlElement private String description;
	
	/**
	 * default constructor
	 */
	public AssetSensor()
	{
		
	}

	/**
	 * @param assetId
	 * @param sensorId
	 * @param description
	 */
	public AssetSensor(int assetId, int sensorId, String description) {
		super();
		this.assetId = assetId;
		this.sensorId = sensorId;
		this.description = description;
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
	 * @return the sensorId
	 */
	public int getSensorId() {
		return sensorId;
	}

	/**
	 * @param sensorId the sensorId to set
	 */
	public void setSensorId(int sensorId) {
		this.sensorId = sensorId;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AssetSensor [assetId=" + assetId + ", sensorId=" + sensorId + ", description=" + description + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + assetId;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + sensorId;
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
		AssetSensor other = (AssetSensor) obj;
		if (assetId != other.assetId)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (sensorId != other.sensorId)
			return false;
		return true;
	}	
		
	
	
}
