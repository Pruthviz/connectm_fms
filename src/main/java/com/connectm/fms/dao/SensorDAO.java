package com.connectm.fms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.connectm.fms.idao.ISensorDAO;
import com.connectm.fms.model.Sensor;


public class SensorDAO implements ISensorDAO {
	private JdbcTemplate template;

	/**
	 * default constructor
	 */
	public SensorDAO() {
		
		
	}

	/**
	 * set JdbcTemplate
	 * 
	 * @param template
	 */
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	/**
	 * @param newSensor
	 * @return
	 */
	public int createSensor(final Sensor sensor){
		
		int sensorId = 0;
		KeyHolder holder = new GeneratedKeyHolder();
		template.update(new PreparedStatementCreator() {

			public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
				PreparedStatement ps = connection.prepareStatement(INSERT_SENSOR_SQL, new String[] { "sensorId" });
				
				ps.setString(1, sensor.getSensorName());
				ps.setString(2, sensor.getSensorManufacture());
				ps.setDate(3, new java.sql.Date(sensor.getManufacturingDate().getTime()));
				ps.setInt(4, sensor.getChoiceListValueSensorTypeID());
		        ps.setString(5, sensor.getSensorModel());
		        
				return ps;
			}
		}, holder);
		sensorId = holder.getKey().intValue();
		
		return sensorId;
	}
	
	/**
	 * @param modifiedSensor
	 */
	public void updateSensor(final Sensor modifiedSensor){
		template.update(UPDATE_SENSOR_SQL, 
				new Object[]{modifiedSensor.getSensorName(),modifiedSensor.getSensorManufacture(),modifiedSensor.getManufacturingDate(),
						modifiedSensor.getChoiceListValueSensorTypeID(),modifiedSensor.getSensorModel()
						
		});
	}
	
	/**
	 * @param modifiedSensor
	 */
	public void deleteSensor(final Sensor modifiedSensor){
		template.update(DELETE_SENSOR_SQL, new Object[]{modifiedSensor.getSensorId()});
	}
	
	/**
	 * @return list of Sensor
	 */
	public List<Sensor> listSensor(){
		List<Sensor> Sensorlist = new ArrayList<Sensor>();
		
		Sensorlist = template.query(GET_SENSOR_SQL, new RowMapper<Sensor>(){

			
			public Sensor mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Sensor sensor = new Sensor();
				
				sensor.setSensorId(rs.getInt("sensor_id"));
				sensor.setSensorName(rs.getString("sensor_name"));
				sensor.setSensorManufacture(rs.getString("sensor_name"));
				sensor.setManufacturingDate(new java.util.Date((rs.getDate("manufacturing_date")).getTime()));
				sensor.setChoiceListValueSensorTypeID(rs.getInt("choice_list_value_sensor_type_id"));
				sensor.setSensorModel(rs.getString("sensor_model"));			
				
				return sensor;
			}
			
		});
		
		return Sensorlist;
	}
}
