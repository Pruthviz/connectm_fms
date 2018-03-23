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

import com.connectm.fms.idao.IGatewayDAO;
import com.connectm.fms.model.Gateway;


public class GatewayDAO implements IGatewayDAO {
	private JdbcTemplate template;

	/**
	 * default constructor
	 */
	public GatewayDAO() {
		
		
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
	 * @param newGateway
	 * @return
	 */
	public int createGateway(final Gateway gateway){
		
		int gatewayId = 0;
		KeyHolder holder = new GeneratedKeyHolder();
		template.update(new PreparedStatementCreator() {

			public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
				PreparedStatement ps = connection.prepareStatement(INSERT_GATEWAY_SQL, new String[] { "gatewayId" });
				
				ps.setString(1, gateway.getGatewayName());
				ps.setInt(2, gateway.getChoiceListValueStatusId());
				ps.setString(3, gateway.getPortNumber());
				ps.setString(4, gateway.getCommunicationNumber());
				ps.setInt(5, gateway.getChoiceListValueCommunicationTypeId());
				ps.setString(6, gateway.getCommunicationUrl());
				ps.setInt(7, gateway.getChoiceListValueProtocalTypeId());
				ps.setString(8, gateway.getEventUrl());
		        
				return ps;
			}
		}, holder);
		gatewayId = holder.getKey().intValue();
		
		return gatewayId;
	}
	
	/**
	 * @param modifiedGateway
	 */
	public void updateGateway(final Gateway modifiedGateway){
		template.update(UPDATE_GATEWAY_SQL, 
				new Object[]{modifiedGateway.getGatewayName(),modifiedGateway.getChoiceListValueStatusId(),
						modifiedGateway.getPortNumber(),modifiedGateway.getCommunicationNumber(),
						modifiedGateway.getChoiceListValueCommunicationTypeId(),modifiedGateway.getCommunicationUrl(),
						modifiedGateway.getChoiceListValueProtocalTypeId(),modifiedGateway.getEventUrl()
						
		});
	}
	
	/**
	 * @param modifiedGateway
	 */
	public void deleteGateway(final Gateway modifiedGateway){
		template.update(DELETE_GATEWAY_SQL, new Object[]{modifiedGateway.getGatewayId()});
	}
	
	/**
	 * @return list of Gateway
	 */
	public List<Gateway> listGateway(){
		List<Gateway> Gatewaylist = new ArrayList<Gateway>();
		
		Gatewaylist = template.query(GET_GATEWAY_SQL, new RowMapper<Gateway>(){

			
			public Gateway mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Gateway gateway = new Gateway();
				
				gateway.setGatewayId(rs.getInt("gateway_id"));
				gateway.setGatewayName(rs.getString("gateway_name"));
				gateway.setChoiceListValueStatusId(rs.getInt("choice_list_value_status_id"));
				gateway.setPortNumber(rs.getString("port_number"));
				gateway.setCommunicationNumber(rs.getString("communication_number"));
				gateway.setChoiceListValueCommunicationTypeId(rs.getInt("choice_list_value_communication_type_id"));
				gateway.setCommunicationUrl(rs.getString("communication_url"));
				gateway.setChoiceListValueProtocalTypeId(rs.getInt("choice_list_value_protocal_type_id"));
				gateway.setEventUrl(rs.getString("event_url"));			
				
				return gateway;
			}
			
		});
		
		return Gatewaylist;
	}
}
