package com.connectm.fms.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class AuthUser{

	@XmlElement private int authUserId;
	@XmlElement private String userName;
	@XmlElement private String password;
	@XmlElement private Date passwordSetDate;
	@XmlElement private int invalidAttempts;
		
	/**
	 * default constructor
	 */
	public AuthUser()
	{
		
	}

	/**
	 * @param authUserId
	 * @param userName
	 * @param password
	 * @param passwordSetDate
	 * @param invalidAttempts
	 */
	public AuthUser(int authUserId, String userName, String password, Date passwordSetDate, int invalidAttempts) {
		super();
		this.authUserId = authUserId;
		this.userName = userName;
		this.password = password;
		this.passwordSetDate = passwordSetDate;
		this.invalidAttempts = invalidAttempts;
	}

	/**
	 * @return the authUserId
	 */
	public int getAuthUserId() {
		return authUserId;
	}

	/**
	 * @param authUserId the authUserId to set
	 */
	public void setAuthUserId(int authUserId) {
		this.authUserId = authUserId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the passwordSetDate
	 */
	public Date getPasswordSetDate() {
		return passwordSetDate;
	}

	/**
	 * @param passwordSetDate the passwordSetDate to set
	 */
	public void setPasswordSetDate(Date passwordSetDate) {
		this.passwordSetDate = passwordSetDate;
	}

	/**
	 * @return the invalidAttempts
	 */
	public int getInvalidAttempts() {
		return invalidAttempts;
	}

	/**
	 * @param invalidAttempts the invalidAttempts to set
	 */
	public void setInvalidAttempts(int invalidAttempts) {
		this.invalidAttempts = invalidAttempts;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AuthUser [authUserId=" + authUserId + ", userName=" + userName + ", password=" + password
				+ ", passwordSetDate=" + passwordSetDate + ", invalidAttempts=" + invalidAttempts + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + authUserId;
		result = prime * result + invalidAttempts;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((passwordSetDate == null) ? 0 : passwordSetDate.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
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
		AuthUser other = (AuthUser) obj;
		if (authUserId != other.authUserId)
			return false;
		if (invalidAttempts != other.invalidAttempts)
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (passwordSetDate == null) {
			if (other.passwordSetDate != null)
				return false;
		} else if (!passwordSetDate.equals(other.passwordSetDate))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}	
	
	
}
