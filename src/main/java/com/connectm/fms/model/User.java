package com.connectm.fms.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class User{

	@XmlElement private int userId;
	@XmlElement private String firstName;
	@XmlElement private String lastName;
	@XmlElement private String gender;
	@XmlElement private int roleId;
	@XmlElement private int departmentId;
	@XmlElement private String emailID;
	@XmlElement private String phoneNumber;
	@XmlElement private String dateOfJoining;
	@XmlElement private boolean isActive;//
	@XmlElement private String userImage;
	@XmlElement private int authUserId;
	@XmlElement private boolean accountLocked;//
	@XmlElement private int defaultPasswordReset;
	@XmlElement private Date validUpto;//
	@XmlElement private int userSuperviourId;
	
	/**
	 * default constructor
	 */
	public User()
	{
		
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
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
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

	/**
	 * @return the departmentId
	 */
	public int getDepartmentId() {
		return departmentId;
	}

	/**
	 * @param departmentId the departmentId to set
	 */
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	/**
	 * @return the emailID
	 */
	public String getEmailID() {
		return emailID;
	}

	/**
	 * @param emailID the emailID to set
	 */
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the dateOfJoining
	 */
	public String getDateOfJoining() {
		return dateOfJoining;
	}

	/**
	 * @param dateOfJoining the dateOfJoining to set
	 */
	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	/**
	 * @return the isActive
	 */
	public boolean isActive() {
		return isActive;
	}

	/**
	 * @param isActive the isActive to set
	 */
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	/**
	 * @return the userImage
	 */
	public String getUserImage() {
		return userImage;
	}

	/**
	 * @param userImage the userImage to set
	 */
	public void setUserImage(String userImage) {
		this.userImage = userImage;
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
	 * @return the accountLocked
	 */
	public boolean isAccountLocked() {
		return accountLocked;
	}

	/**
	 * @param accountLocked the accountLocked to set
	 */
	public void setAccountLocked(boolean accountLocked) {
		this.accountLocked = accountLocked;
	}

	/**
	 * @return the defaultPasswordReset
	 */
	public int getDefaultPasswordReset() {
		return defaultPasswordReset;
	}

	/**
	 * @param defaultPasswordReset the defaultPasswordReset to set
	 */
	public void setDefaultPasswordReset(int defaultPasswordReset) {
		this.defaultPasswordReset = defaultPasswordReset;
	}

	/**
	 * @return the validUpto
	 */
	public Date getValidUpto() {
		return validUpto;
	}

	/**
	 * @param validUpto the validUpto to set
	 */
	public void setValidUpto(Date validUpto) {
		this.validUpto = validUpto;
	}

	/**
	 * @return the userSuperviourId
	 */
	public int getUserSuperviourId() {
		return userSuperviourId;
	}

	/**
	 * @param userSuperviourId the userSuperviourId to set
	 */
	public void setUserSuperviourId(int userSuperviourId) {
		this.userSuperviourId = userSuperviourId;
	}

	/**
	 * @param userId
	 * @param firstName
	 * @param lastName
	 * @param gender
	 * @param roleId
	 * @param departmentId
	 * @param emailID
	 * @param phoneNumber
	 * @param dateOfJoining
	 * @param isActive
	 * @param userImage
	 * @param authUserId
	 * @param accountLocked
	 * @param defaultPasswordReset
	 * @param validUpto
	 * @param userSuperviourId
	 */
	public User(int userId, String firstName, String lastName, String gender, int roleId, int departmentId,
			String emailID, String phoneNumber, String dateOfJoining, boolean isActive, String userImage,
			int authUserId, boolean accountLocked, int defaultPasswordReset, Date validUpto, int userSuperviourId) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.roleId = roleId;
		this.departmentId = departmentId;
		this.emailID = emailID;
		this.phoneNumber = phoneNumber;
		this.dateOfJoining = dateOfJoining;
		this.isActive = isActive;
		this.userImage = userImage;
		this.authUserId = authUserId;
		this.accountLocked = accountLocked;
		this.defaultPasswordReset = defaultPasswordReset;
		this.validUpto = validUpto;
		this.userSuperviourId = userSuperviourId;
	}
	
	
	
	
	
}
