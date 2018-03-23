package com.connectm.fms.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class AuditLog{

	@XmlElement private int auditLogId;
	@XmlElement private String auditLogCode;
	@XmlElement private String ipAddress;
	@XmlElement private Date timeStamp;
	@XmlElement private int operationId;
	@XmlElement private String comments;
	@XmlElement private int statusId;
	@XmlElement private int userId;
	@XmlElement private int roleId;
		
	/**
	 * default constructor
	 */
	public AuditLog()
	{
		
	}

	/**
	 * @param auditLogId
	 * @param auditLogCode
	 * @param ipAddress
	 * @param timeStamp
	 * @param operationId
	 * @param comments
	 * @param statusId
	 * @param userId
	 * @param roleId
	 */
	public AuditLog(int auditLogId, String auditLogCode, String ipAddress, Date timeStamp, int operationId,
			String comments, int statusId, int userId, int roleId) {
		super();
		this.auditLogId = auditLogId;
		this.auditLogCode = auditLogCode;
		this.ipAddress = ipAddress;
		this.timeStamp = timeStamp;
		this.operationId = operationId;
		this.comments = comments;
		this.statusId = statusId;
		this.userId = userId;
		this.roleId = roleId;
	}

	/**
	 * @return the auditLogId
	 */
	public int getAuditLogId() {
		return auditLogId;
	}

	/**
	 * @param auditLogId the auditLogId to set
	 */
	public void setAuditLogId(int auditLogId) {
		this.auditLogId = auditLogId;
	}

	/**
	 * @return the auditLogCode
	 */
	public String getAuditLogCode() {
		return auditLogCode;
	}

	/**
	 * @param auditLogCode the auditLogCode to set
	 */
	public void setAuditLogCode(String auditLogCode) {
		this.auditLogCode = auditLogCode;
	}

	/**
	 * @return the ipAddress
	 */
	public String getIpAddress() {
		return ipAddress;
	}

	/**
	 * @param ipAddress the ipAddress to set
	 */
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	/**
	 * @return the timeStamp
	 */
	public Date getTimeStamp() {
		return timeStamp;
	}

	/**
	 * @param timeStamp the timeStamp to set
	 */
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	/**
	 * @return the operationId
	 */
	public int getOperationId() {
		return operationId;
	}

	/**
	 * @param operationId the operationId to set
	 */
	public void setOperationId(int operationId) {
		this.operationId = operationId;
	}

	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}

	/**
	 * @return the statusId
	 */
	public int getStatusId() {
		return statusId;
	}

	/**
	 * @param statusId the statusId to set
	 */
	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the roleId
	 */
	public int getRoleId() {
		return roleId;
	}

	/**
	 * @param roleId the roleId to set
	 */
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AuditLog [auditLogId=" + auditLogId + ", auditLogCode=" + auditLogCode + ", ipAddress=" + ipAddress
				+ ", timeStamp=" + timeStamp + ", operationId=" + operationId + ", comments=" + comments + ", statusId="
				+ statusId + ", userId=" + userId + ", roleId=" + roleId + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((auditLogCode == null) ? 0 : auditLogCode.hashCode());
		result = prime * result + auditLogId;
		result = prime * result + ((comments == null) ? 0 : comments.hashCode());
		result = prime * result + ((ipAddress == null) ? 0 : ipAddress.hashCode());
		result = prime * result + operationId;
		result = prime * result + roleId;
		result = prime * result + statusId;
		result = prime * result + ((timeStamp == null) ? 0 : timeStamp.hashCode());
		result = prime * result + userId;
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
		AuditLog other = (AuditLog) obj;
		if (auditLogCode == null) {
			if (other.auditLogCode != null)
				return false;
		} else if (!auditLogCode.equals(other.auditLogCode))
			return false;
		if (auditLogId != other.auditLogId)
			return false;
		if (comments == null) {
			if (other.comments != null)
				return false;
		} else if (!comments.equals(other.comments))
			return false;
		if (ipAddress == null) {
			if (other.ipAddress != null)
				return false;
		} else if (!ipAddress.equals(other.ipAddress))
			return false;
		if (operationId != other.operationId)
			return false;
		if (roleId != other.roleId)
			return false;
		if (statusId != other.statusId)
			return false;
		if (timeStamp == null) {
			if (other.timeStamp != null)
				return false;
		} else if (!timeStamp.equals(other.timeStamp))
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}	
	
	
	
}
