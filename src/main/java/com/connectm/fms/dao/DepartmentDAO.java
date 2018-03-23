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

import com.connectm.fms.idao.IDepartmentDAO;
import com.connectm.fms.model.Department;



public class DepartmentDAO implements IDepartmentDAO {
	private JdbcTemplate template;

	/**
	 * default constructor
	 */
	public DepartmentDAO() {
		
		
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
	 * @param newDepartment
	 * @return
	 */
	public int createDepartment(final Department department){
		
		int departmentId = 0;
		KeyHolder holder = new GeneratedKeyHolder();
		template.update(new PreparedStatementCreator() {

			public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
				PreparedStatement ps = connection.prepareStatement(INSERT_DEPARTMENT_SQL, new String[] { "departmentId" });
				
				ps.setString(1, department.getDepartmentName());
				ps.setString(2, department.getDescription());
				ps.setInt(3, department.getCampusLevelId());
		        
				return ps;
			}
		}, holder);
		departmentId = holder.getKey().intValue();
		
		return departmentId;
	}
	
	/**
	 * @param modifiedDepartment
	 */
	public void updateDepartment(final Department modifiedDepartment){
		template.update(UPDATE_DEPARTMENT_SQL, 
				new Object[]{modifiedDepartment.getDepartmentName(),modifiedDepartment.getDescription(),
						modifiedDepartment.getCampusLevelId()
						
		});
	}
	
	/**
	 * @param modifiedDepartment
	 */
	public void deleteDepartment(final Department modifiedDepartment){
		template.update(DELETE_DEPARTMENT_SQL, new Object[]{modifiedDepartment.getDepartmentId()});
	}
	
	/**
	 * @return list of Department
	 */
	public List<Department> listDepartment(){
		List<Department> Departmentlist = new ArrayList<Department>();
		
		Departmentlist = template.query(GET_DEPARTMENT_SQL, new RowMapper<Department>(){

			
			public Department mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Department department = new Department();
				
				department.setDepartmentId(rs.getInt("department_id"));
				department.setDepartmentName(rs.getString("dept_name"));
				department.setDepartmentName(rs.getString("description"));
				department.setCampusLevelId(rs.getInt("campus_level_id"));
				
				return department;
			}
			
		});
		
		return Departmentlist;
	}
}
