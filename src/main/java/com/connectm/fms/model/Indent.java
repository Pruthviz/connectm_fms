package com.connectm.fms.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Indent{

	@XmlElement private int indentId;
	@XmlElement private String indententNumber;
	@XmlElement private String receiptNumber;
	@XmlElement private double quantity;
	@XmlElement private int choiceListValueTypeId;
	@XmlElement private int userRequesterId;
	@XmlElement private Date indentDate;
	@XmlElement private int campusLevelSourceId;
	@XmlElement private int levelEntityDestinationId;
	@XmlElement private String description;
	@XmlElement private int choiceListValueCurrentStatusId;
	
	/**
	 * default constructor
	 */
	public Indent()
	{
		
	}

	/**
	 * @param indentId
	 * @param indententNumber
	 * @param receiptNumber
	 * @param quantity
	 * @param choiceListValueTypeId
	 * @param userRequesterId
	 * @param indentDate
	 * @param campusLevelSourceId
	 * @param levelEntityDestinationId
	 * @param description
	 * @param choiceListValueCurrentStatusId
	 */
	public Indent(int indentId, String indententNumber, String receiptNumber, double quantity,
			int choiceListValueTypeId, int userRequesterId, Date indentDate, int campusLevelSourceId,
			int levelEntityDestinationId, String description, int choiceListValueCurrentStatusId) {
		super();
		this.indentId = indentId;
		this.indententNumber = indententNumber;
		this.receiptNumber = receiptNumber;
		this.quantity = quantity;
		this.choiceListValueTypeId = choiceListValueTypeId;
		this.userRequesterId = userRequesterId;
		this.indentDate = indentDate;
		this.campusLevelSourceId = campusLevelSourceId;
		this.levelEntityDestinationId = levelEntityDestinationId;
		this.description = description;
		this.choiceListValueCurrentStatusId = choiceListValueCurrentStatusId;
	}

	/**
	 * @return the indentId
	 */
	public int getIndentId() {
		return indentId;
	}

	/**
	 * @param indentId the indentId to set
	 */
	public void setIndentId(int indentId) {
		this.indentId = indentId;
	}

	/**
	 * @return the indententNumber
	 */
	public String getIndententNumber() {
		return indententNumber;
	}

	/**
	 * @param indententNumber the indententNumber to set
	 */
	public void setIndententNumber(String indententNumber) {
		this.indententNumber = indententNumber;
	}

	/**
	 * @return the receiptNumber
	 */
	public String getReceiptNumber() {
		return receiptNumber;
	}

	/**
	 * @param receiptNumber the receiptNumber to set
	 */
	public void setReceiptNumber(String receiptNumber) {
		this.receiptNumber = receiptNumber;
	}

	/**
	 * @return the quantity
	 */
	public double getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the choiceListValueTypeId
	 */
	public int getChoiceListValueTypeId() {
		return choiceListValueTypeId;
	}

	/**
	 * @param choiceListValueTypeId the choiceListValueTypeId to set
	 */
	public void setChoiceListValueTypeId(int choiceListValueTypeId) {
		this.choiceListValueTypeId = choiceListValueTypeId;
	}

	/**
	 * @return the userRequesterId
	 */
	public int getUserRequesterId() {
		return userRequesterId;
	}

	/**
	 * @param userRequesterId the userRequesterId to set
	 */
	public void setUserRequesterId(int userRequesterId) {
		this.userRequesterId = userRequesterId;
	}

	/**
	 * @return the indentDate
	 */
	public Date getIndentDate() {
		return indentDate;
	}

	/**
	 * @param indentDate the indentDate to set
	 */
	public void setIndentDate(Date indentDate) {
		this.indentDate = indentDate;
	}

	/**
	 * @return the campusLevelSourceId
	 */
	public int getCampusLevelSourceId() {
		return campusLevelSourceId;
	}

	/**
	 * @param campusLevelSourceId the campusLevelSourceId to set
	 */
	public void setCampusLevelSourceId(int campusLevelSourceId) {
		this.campusLevelSourceId = campusLevelSourceId;
	}

	/**
	 * @return the levelEntityDestinationId
	 */
	public int getLevelEntityDestinationId() {
		return levelEntityDestinationId;
	}

	/**
	 * @param levelEntityDestinationId the levelEntityDestinationId to set
	 */
	public void setLevelEntityDestinationId(int levelEntityDestinationId) {
		this.levelEntityDestinationId = levelEntityDestinationId;
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

	/**
	 * @return the choiceListValueCurrentStatusId
	 */
	public int getChoiceListValueCurrentStatusId() {
		return choiceListValueCurrentStatusId;
	}

	/**
	 * @param choiceListValueCurrentStatusId the choiceListValueCurrentStatusId to set
	 */
	public void setChoiceListValueCurrentStatusId(int choiceListValueCurrentStatusId) {
		this.choiceListValueCurrentStatusId = choiceListValueCurrentStatusId;
	}

	

		
	
}
