package com.connectm.fms.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CampusLevelAddress{

	@XmlElement private int campusLevelAddressId;
	@XmlElement private int campusLevelId;
	@XmlElement private int choiceListValueAddressTypeId;
	@XmlElement private String addressLine1;
	@XmlElement private String addressLine2;
	@XmlElement private int choiceListValueStateId;
	@XmlElement private int choiceListValueCountryId;
	@XmlElement private String city;
	@XmlElement private String postalCode;
	@XmlElement private double lat;
	@XmlElement private double lon;
		
	/**
	 * default constructor
	 */
	public CampusLevelAddress()
	{
		
	}

	/**
	 * @param campusLevelAddressId
	 * @param campusLevelId
	 * @param choiceListValueAddressTypeId
	 * @param addressLine1
	 * @param addressLine2
	 * @param choiceListValueStateId
	 * @param choiceListValueCountryId
	 * @param city
	 * @param postalCode
	 * @param lat
	 * @param lon
	 */
	public CampusLevelAddress(int campusLevelAddressId, int campusLevelId, int choiceListValueAddressTypeId,
			String addressLine1, String addressLine2, int choiceListValueStateId, int choiceListValueCountryId,
			String city, String postalCode, double lat, double lon) {
		super();
		this.campusLevelAddressId = campusLevelAddressId;
		this.campusLevelId = campusLevelId;
		this.choiceListValueAddressTypeId = choiceListValueAddressTypeId;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.choiceListValueStateId = choiceListValueStateId;
		this.choiceListValueCountryId = choiceListValueCountryId;
		this.city = city;
		this.postalCode = postalCode;
		this.lat = lat;
		this.lon = lon;
	}

	/**
	 * @return the campusLevelAddressId
	 */
	public int getCampusLevelAddressId() {
		return campusLevelAddressId;
	}

	/**
	 * @param campusLevelAddressId the campusLevelAddressId to set
	 */
	public void setCampusLevelAddressId(int campusLevelAddressId) {
		this.campusLevelAddressId = campusLevelAddressId;
	}

	/**
	 * @return the campusLevelId
	 */
	public int getCampusLevelId() {
		return campusLevelId;
	}

	/**
	 * @param campusLevelId the campusLevelId to set
	 */
	public void setCampusLevelId(int campusLevelId) {
		this.campusLevelId = campusLevelId;
	}

	/**
	 * @return the choiceListValueAddressTypeId
	 */
	public int getChoiceListValueAddressTypeId() {
		return choiceListValueAddressTypeId;
	}

	/**
	 * @param choiceListValueAddressTypeId the choiceListValueAddressTypeId to set
	 */
	public void setChoiceListValueAddressTypeId(int choiceListValueAddressTypeId) {
		this.choiceListValueAddressTypeId = choiceListValueAddressTypeId;
	}

	/**
	 * @return the addressLine1
	 */
	public String getAddressLine1() {
		return addressLine1;
	}

	/**
	 * @param addressLine1 the addressLine1 to set
	 */
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	/**
	 * @return the addressLine2
	 */
	public String getAddressLine2() {
		return addressLine2;
	}

	/**
	 * @param addressLine2 the addressLine2 to set
	 */
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	/**
	 * @return the choiceListValueStateId
	 */
	public int getChoiceListValueStateId() {
		return choiceListValueStateId;
	}

	/**
	 * @param choiceListValueStateId the choiceListValueStateId to set
	 */
	public void setChoiceListValueStateId(int choiceListValueStateId) {
		this.choiceListValueStateId = choiceListValueStateId;
	}

	/**
	 * @return the choiceListValueCountryId
	 */
	public int getChoiceListValueCountryId() {
		return choiceListValueCountryId;
	}

	/**
	 * @param choiceListValueCountryId the choiceListValueCountryId to set
	 */
	public void setChoiceListValueCountryId(int choiceListValueCountryId) {
		this.choiceListValueCountryId = choiceListValueCountryId;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * @return the lat
	 */
	public double getLat() {
		return lat;
	}

	/**
	 * @param lat the lat to set
	 */
	public void setLat(double lat) {
		this.lat = lat;
	}

	/**
	 * @return the lon
	 */
	public double getLon() {
		return lon;
	}

	/**
	 * @param lon the lon to set
	 */
	public void setLon(double lon) {
		this.lon = lon;
	}	
	
	
}
