package com.connectm.fms.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class DataMapList{

	@XmlElement private int mapId;
	@XmlElement private String dataTagName;
	@XmlElement private int assetId;
	@XmlElement private int sensorId;
	@XmlElement private int choiceListValueStatusId;
	
	/**
	 * default constructor
	 */
	public DataMapList()
	{
		
	}

	/**
	 * @param mapId
	 * @param dataTagName
	 * @param assetId
	 * @param sensorId
	 * @param choiceListValueStatusId
	 */
	public DataMapList(int mapId, String dataTagName, int assetId, int sensorId, int choiceListValueStatusId) {
		super();
		this.mapId = mapId;
		this.dataTagName = dataTagName;
		this.assetId = assetId;
		this.sensorId = sensorId;
		this.choiceListValueStatusId = choiceListValueStatusId;
	}

	/**
	 * @return the mapId
	 */
	public int getMapId() {
		return mapId;
	}

	/**
	 * @param mapId the mapId to set
	 */
	public void setMapId(int mapId) {
		this.mapId = mapId;
	}

	/**
	 * @return the dataTagName
	 */
	public String getDataTagName() {
		return dataTagName;
	}

	/**
	 * @param dataTagName the dataTagName to set
	 */
	public void setDataTagName(String dataTagName) {
		this.dataTagName = dataTagName;
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

			
	
}
