package com.connectm.fms.idao;

public interface IDepartmentDAO {
	static String INSERT_DEPARTMENT_SQL = "insert into department (dept_name,description,campus_level_id) "
			+ "values(?,?,?)";
				
	static String UPDATE_DEPARTMENT_SQL = "update department set dept_name = ?, description = ? , campus_level_id = ? "
			+ " where department_id = ?";
	
	static String DELETE_DEPARTMENT_SQL = "update department set is_active = 1 where department_id = ?";
	
	static String GET_DEPARTMENT_SQL = "select department_id,dept_name,description,campus_level_id"
			+ "from department where is_deleted = 0 order by department_id";
}
