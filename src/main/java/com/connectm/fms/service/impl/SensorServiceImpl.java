package com.connectm.fms.service.impl;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.connectm.fms.dao.SensorDAO;
import com.connectm.fms.model.Sensor;
import com.connectm.fms.service.ISensorService;

public class SensorServiceImpl implements ISensorService{

	@Autowired
	private SensorDAO sensorDAO;
	
	public Response createSensor(Sensor newSensor) {
		sensorDAO.createSensor(newSensor);
		
		return Response.status(Response.Status.OK).build();
	}

	public Response listSensor() {
		return Response.ok(sensorDAO.listSensor()).build();
	}

	public Response updateSensor(Sensor modifiedSensor) {
		sensorDAO.updateSensor(modifiedSensor);
		
		return Response.status(Response.Status.OK).build();
	}

	public Response deleteSensor(Sensor modifiedSensor) {
		sensorDAO.deleteSensor(modifiedSensor);
		
		return Response.status(Response.Status.OK).build();
	}

}
