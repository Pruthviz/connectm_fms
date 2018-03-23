package com.connectm.fms.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Sensor{

	@XmlElement private int sensorId;
	@XmlElement private String sensorName;
	@XmlElement private String sensorManufacture;
	@XmlElement private Date manufacturingDate;
	@XmlElement private int choiceListValueSensorTypeID;
	@XmlElement private String sensorModel;
	
	/**
	 * default constructor
	 */
	public Sensor()
	{
		
	}

	/**
	 * @param sensorId
	 * @param sensorName
	 * @param sensorManufacture
	 * @param manufacturingDate
	 * @param choiceListValueSensorTypeID
	 * @param sensorModel
	 */
	public Sensor(int sensorId, String sensorName, String sensorManufacture, Date manufacturingDate,
			int choiceListValueSensorTypeID, String sensorModel) {
		super();
		this.sensorId = sensorId;
		this.sensorName = sensorName;
		this.sensorManufacture = sensorManufacture;
		this.manufacturingDate = manufacturingDate;
		this.choiceListValueSensorTypeID = choiceListValueSensorTypeID;
		this.sensorModel = sensorModel;
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
	 * @return the sensorName
	 */
	public String getSensorName() {
		return sensorName;
	}

	/**
	 * @param sensorName the sensorName to set
	 */
	public void setSensorName(String sensorName) {
		this.sensorName = sensorName;
	}

	/**
	 * @return the sensorManufacture
	 */
	public String getSensorManufacture() {
		return sensorManufacture;
	}

	/**
	 * @param sensorManufacture the sensorManufacture to set
	 */
	public void setSensorManufacture(String sensorManufacture) {
		this.sensorManufacture = sensorManufacture;
	}

	/**
	 * @return the manufacturingDate
	 */
	public Date getManufacturingDate() {
		return manufacturingDate;
	}

	/**
	 * @param manufacturingDate the manufacturingDate to set
	 */
	public void setManufacturingDate(Date manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}

	/**
	 * @return the choiceListValueSensorTypeID
	 */
	public int getChoiceListValueSensorTypeID() {
		return choiceListValueSensorTypeID;
	}

	/**
	 * @param choiceListValueSensorTypeID the choiceListValueSensorTypeID to set
	 */
	public void setChoiceListValueSensorTypeID(int choiceListValueSensorTypeID) {
		this.choiceListValueSensorTypeID = choiceListValueSensorTypeID;
	}

	/**
	 * @return the sensorModel
	 */
	public String getSensorModel() {
		return sensorModel;
	}

	/**
	 * @param sensorModel the sensorModel to set
	 */
	public void setSensorModel(String sensorModel) {
		this.sensorModel = sensorModel;
	}

			
	
}
