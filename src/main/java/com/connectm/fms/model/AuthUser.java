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
	
	
	
}
