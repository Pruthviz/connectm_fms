package com.connectm.fms.error;

public interface IDataValidation {
	
	static String SUCCESS = "Success";
	static String ORGANIZATION_DOESNOT_EXIST = "Organization Doesnt Exist By the Entered ID";
	static String ORGANIZATION_ID_MISSING = "Organization ID is Mandatory";
	static String ORGANIZATION_NAME_MISSING = "Organization Name is Mandatory";
	static String ORGANIZATION_EMAILID_MISSING = "Organization Email is Mandatory";
	
	static String AUTHUSER_NAME_MISSING = "Auth User Name is Mandatory";
	static String AUTHUSER_ID_MISSING = "Auth User ID is Mandatory";
	static String AUTHUSER_DOESNOT_EXIST = "Auth User Doesnt Exist By the Entered ID";

}
