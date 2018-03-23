package com.connectm.fms.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class AuthObject{

	@XmlElement private int objectId;
	@XmlElement private String objectName;
	@XmlElement private int parentObjectId;
	@XmlElement private String uriLink;
	@XmlElement private String objectImagePath;
		
	/**
	 * default constructor
	 */
	public AuthObject()
	{
		
	}

	/**
	 * @param objectId
	 * @param objectName
	 * @param parentObjectId
	 * @param uriLink
	 * @param objectImagePath
	 */
	public AuthObject(int objectId, String objectName, int parentObjectId, String uriLink, String objectImagePath) {
		super();
		this.objectId = objectId;
		this.objectName = objectName;
		this.parentObjectId = parentObjectId;
		this.uriLink = uriLink;
		this.objectImagePath = objectImagePath;
	}

	/**
	 * @return the objectId
	 */
	public int getObjectId() {
		return objectId;
	}

	/**
	 * @param objectId the objectId to set
	 */
	public void setObjectId(int objectId) {
		this.objectId = objectId;
	}

	/**
	 * @return the objectName
	 */
	public String getObjectName() {
		return objectName;
	}

	/**
	 * @param objectName the objectName to set
	 */
	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

	/**
	 * @return the parentObjectId
	 */
	public int getParentObjectId() {
		return parentObjectId;
	}

	/**
	 * @param parentObjectId the parentObjectId to set
	 */
	public void setParentObjectId(int parentObjectId) {
		this.parentObjectId = parentObjectId;
	}

	/**
	 * @return the uriLink
	 */
	public String getUriLink() {
		return uriLink;
	}

	/**
	 * @param uriLink the uriLink to set
	 */
	public void setUriLink(String uriLink) {
		this.uriLink = uriLink;
	}

	/**
	 * @return the objectImagePath
	 */
	public String getObjectImagePath() {
		return objectImagePath;
	}

	/**
	 * @param objectImagePath the objectImagePath to set
	 */
	public void setObjectImagePath(String objectImagePath) {
		this.objectImagePath = objectImagePath;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AuthObject [objectId=" + objectId + ", objectName=" + objectName + ", parentObjectId=" + parentObjectId
				+ ", uriLink=" + uriLink + ", objectImagePath=" + objectImagePath + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + objectId;
		result = prime * result + ((objectImagePath == null) ? 0 : objectImagePath.hashCode());
		result = prime * result + ((objectName == null) ? 0 : objectName.hashCode());
		result = prime * result + parentObjectId;
		result = prime * result + ((uriLink == null) ? 0 : uriLink.hashCode());
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
		AuthObject other = (AuthObject) obj;
		if (objectId != other.objectId)
			return false;
		if (objectImagePath == null) {
			if (other.objectImagePath != null)
				return false;
		} else if (!objectImagePath.equals(other.objectImagePath))
			return false;
		if (objectName == null) {
			if (other.objectName != null)
				return false;
		} else if (!objectName.equals(other.objectName))
			return false;
		if (parentObjectId != other.parentObjectId)
			return false;
		if (uriLink == null) {
			if (other.uriLink != null)
				return false;
		} else if (!uriLink.equals(other.uriLink))
			return false;
		return true;
	}	
	
	
	
}
