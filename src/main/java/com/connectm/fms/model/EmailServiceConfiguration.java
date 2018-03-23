package com.connectm.fms.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class EmailServiceConfiguration{

	@XmlElement private int emailID;
	@XmlElement private int choiceListValueEmailType;
	@XmlElement private String smtpUser;
	@XmlElement private String smtpPassword;
	@XmlElement private String smtpHost;
	@XmlElement private String smtpPort;
	@XmlElement private String emailSubject;
	@XmlElement private String emailMessage;
	@XmlElement private int attachmentReqd;
	
		
	/**
	 * default constructor
	 */
	public EmailServiceConfiguration()
	{
		
	}


	/**
	 * @param emailID
	 * @param choiceListValueEmailType
	 * @param smtpUser
	 * @param smtpPassword
	 * @param smtpHost
	 * @param smtpPort
	 * @param emailSubject
	 * @param emailMessage
	 * @param attachmentReqd
	 */
	public EmailServiceConfiguration(int emailID, int choiceListValueEmailType, String smtpUser, String smtpPassword,
			String smtpHost, String smtpPort, String emailSubject, String emailMessage, int attachmentReqd) {
		super();
		this.emailID = emailID;
		this.choiceListValueEmailType = choiceListValueEmailType;
		this.smtpUser = smtpUser;
		this.smtpPassword = smtpPassword;
		this.smtpHost = smtpHost;
		this.smtpPort = smtpPort;
		this.emailSubject = emailSubject;
		this.emailMessage = emailMessage;
		this.attachmentReqd = attachmentReqd;
	}


	/**
	 * @return the emailID
	 */
	public int getEmailID() {
		return emailID;
	}


	/**
	 * @param emailID the emailID to set
	 */
	public void setEmailID(int emailID) {
		this.emailID = emailID;
	}


	/**
	 * @return the choiceListValueEmailType
	 */
	public int getChoiceListValueEmailType() {
		return choiceListValueEmailType;
	}


	/**
	 * @param choiceListValueEmailType the choiceListValueEmailType to set
	 */
	public void setChoiceListValueEmailType(int choiceListValueEmailType) {
		this.choiceListValueEmailType = choiceListValueEmailType;
	}


	/**
	 * @return the smtpUser
	 */
	public String getSmtpUser() {
		return smtpUser;
	}


	/**
	 * @param smtpUser the smtpUser to set
	 */
	public void setSmtpUser(String smtpUser) {
		this.smtpUser = smtpUser;
	}


	/**
	 * @return the smtpPassword
	 */
	public String getSmtpPassword() {
		return smtpPassword;
	}


	/**
	 * @param smtpPassword the smtpPassword to set
	 */
	public void setSmtpPassword(String smtpPassword) {
		this.smtpPassword = smtpPassword;
	}


	/**
	 * @return the smtpHost
	 */
	public String getSmtpHost() {
		return smtpHost;
	}


	/**
	 * @param smtpHost the smtpHost to set
	 */
	public void setSmtpHost(String smtpHost) {
		this.smtpHost = smtpHost;
	}


	/**
	 * @return the smtpPort
	 */
	public String getSmtpPort() {
		return smtpPort;
	}


	/**
	 * @param smtpPort the smtpPort to set
	 */
	public void setSmtpPort(String smtpPort) {
		this.smtpPort = smtpPort;
	}


	/**
	 * @return the emailSubject
	 */
	public String getEmailSubject() {
		return emailSubject;
	}


	/**
	 * @param emailSubject the emailSubject to set
	 */
	public void setEmailSubject(String emailSubject) {
		this.emailSubject = emailSubject;
	}


	/**
	 * @return the emailMessage
	 */
	public String getEmailMessage() {
		return emailMessage;
	}


	/**
	 * @param emailMessage the emailMessage to set
	 */
	public void setEmailMessage(String emailMessage) {
		this.emailMessage = emailMessage;
	}


	/**
	 * @return the attachmentReqd
	 */
	public int getAttachmentReqd() {
		return attachmentReqd;
	}


	/**
	 * @param attachmentReqd the attachmentReqd to set
	 */
	public void setAttachmentReqd(int attachmentReqd) {
		this.attachmentReqd = attachmentReqd;
	}	
	
			
	
}
