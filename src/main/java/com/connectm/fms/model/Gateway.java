package com.connectm.fms.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Gateway{

	@XmlElement private int gatewayId;
	@XmlElement private String gatewayName;
	@XmlElement private int choiceListValueStatusId;
	@XmlElement private String portNumber;
	@XmlElement private String communicationNumber;
	@XmlElement private int choiceListValueCommunicationTypeId;	
	@XmlElement private String communicationUrl;
	@XmlElement private int choiceListValueProtocalTypeId;
	@XmlElement private String eventUrl;
	/**
	 * default constructor
	 */
	public Gateway()
	{
		
	}
	/**
	 * @param gatewayId
	 * @param gatewayName
	 * @param choiceListValueStatusId
	 * @param portNumber
	 * @param communicationNumber
	 * @param choiceListValueCommunicationTypeId
	 * @param communicationUrl
	 * @param choiceListValueProtocalTypeId
	 * @param eventUrl
	 */
	public Gateway(int gatewayId, String gatewayName, int choiceListValueStatusId, String portNumber,
			String communicationNumber, int choiceListValueCommunicationTypeId, String communicationUrl,
			int choiceListValueProtocalTypeId, String eventUrl) {
		super();
		this.gatewayId = gatewayId;
		this.gatewayName = gatewayName;
		this.choiceListValueStatusId = choiceListValueStatusId;
		this.portNumber = portNumber;
		this.communicationNumber = communicationNumber;
		this.choiceListValueCommunicationTypeId = choiceListValueCommunicationTypeId;
		this.communicationUrl = communicationUrl;
		this.choiceListValueProtocalTypeId = choiceListValueProtocalTypeId;
		this.eventUrl = eventUrl;
	}
	/**
	 * @return the gatewayId
	 */
	public int getGatewayId() {
		return gatewayId;
	}
	/**
	 * @param gatewayId the gatewayId to set
	 */
	public void setGatewayId(int gatewayId) {
		this.gatewayId = gatewayId;
	}
	/**
	 * @return the gatewayName
	 */
	public String getGatewayName() {
		return gatewayName;
	}
	/**
	 * @param gatewayName the gatewayName to set
	 */
	public void setGatewayName(String gatewayName) {
		this.gatewayName = gatewayName;
	}
	/**
	 * @return the choiceListValueStatusId
	 */
	public int getChoiceListValueStatusId() {
		return choiceListValueStatusId;
	}
	/**
	 * @param choiceListValueStatusId the choiceListValueStatusId to set
	 */
	public void setChoiceListValueStatusId(int choiceListValueStatusId) {
		this.choiceListValueStatusId = choiceListValueStatusId;
	}
	/**
	 * @return the portNumber
	 */
	public String getPortNumber() {
		return portNumber;
	}
	/**
	 * @param portNumber the portNumber to set
	 */
	public void setPortNumber(String portNumber) {
		this.portNumber = portNumber;
	}
	/**
	 * @return the communicationNumber
	 */
	public String getCommunicationNumber() {
		return communicationNumber;
	}
	/**
	 * @param communicationNumber the communicationNumber to set
	 */
	public void setCommunicationNumber(String communicationNumber) {
		this.communicationNumber = communicationNumber;
	}
	/**
	 * @return the choiceListValueCommunicationTypeId
	 */
	public int getChoiceListValueCommunicationTypeId() {
		return choiceListValueCommunicationTypeId;
	}
	/**
	 * @param choiceListValueCommunicationTypeId the choiceListValueCommunicationTypeId to set
	 */
	public void setChoiceListValueCommunicationTypeId(int choiceListValueCommunicationTypeId) {
		this.choiceListValueCommunicationTypeId = choiceListValueCommunicationTypeId;
	}
	/**
	 * @return the communicationUrl
	 */
	public String getCommunicationUrl() {
		return communicationUrl;
	}
	/**
	 * @param communicationUrl the communicationUrl to set
	 */
	public void setCommunicationUrl(String communicationUrl) {
		this.communicationUrl = communicationUrl;
	}
	/**
	 * @return the choiceListValueProtocalTypeId
	 */
	public int getChoiceListValueProtocalTypeId() {
		return choiceListValueProtocalTypeId;
	}
	/**
	 * @param choiceListValueProtocalTypeId the choiceListValueProtocalTypeId to set
	 */
	public void setChoiceListValueProtocalTypeId(int choiceListValueProtocalTypeId) {
		this.choiceListValueProtocalTypeId = choiceListValueProtocalTypeId;
	}
	/**
	 * @return the eventUrl
	 */
	public String getEventUrl() {
		return eventUrl;
	}
	/**
	 * @param eventUrl the eventUrl to set
	 */
	public void setEventUrl(String eventUrl) {
		this.eventUrl = eventUrl;
	}
	
	
	
}
