package com.connectm.fms.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class AssetSupplier{

	@XmlElement private int assetId;
	@XmlElement private int supplierId;
	
	/**
	 * default constructor
	 */
	public AssetSupplier()
	{
		
	}

	/**
	 * @param assetId
	 * @param supplierId
	 */
	public AssetSupplier(int assetId, int supplierId) {
		super();
		this.assetId = assetId;
		this.supplierId = supplierId;
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
	 * @return the supplierId
	 */
	public int getSupplierId() {
		return supplierId;
	}

	/**
	 * @param supplierId the supplierId to set
	 */
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AssetSupplier [assetId=" + assetId + ", supplierId=" + supplierId + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + assetId;
		result = prime * result + supplierId;
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
		AssetSupplier other = (AssetSupplier) obj;
		if (assetId != other.assetId)
			return false;
		if (supplierId != other.supplierId)
			return false;
		return true;
	}

		
	
}
