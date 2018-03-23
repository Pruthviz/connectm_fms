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

import com.connectm.fms.idao.IUserDAO;
import com.connectm.fms.model.User;


public class UserDAO implements IUserDAO {
	private JdbcTemplate template;

	/**
	 * default constructor
	 */
	public UserDAO() {
		
		
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
	 * @param newOrganization
	 * @return
	 */
	public int createUser(final User user){
		
		int userId = 0;
		KeyHolder holder = new GeneratedKeyHolder();
		template.update(new PreparedStatementCreator() {

			public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
				PreparedStatement ps = connection.prepareStatement(INSERT_USER_SQL, new String[] { "userId" });
				
				ps.setString(1, user.getFirstName());
				ps.setString(2, user.getLastName());
				ps.setString(3, user.getGender());
				ps.setInt(4, user.getRoleId());
				ps.setInt(5, user.getDepartmentId());
				ps.setString(6, user.getEmailID());
				ps.setString(7, user.getPhoneNumber());
				ps.setString(8, user.getDateOfJoining());
				int active = (user.isActive() ) ? 1 : 0;
				ps.setInt(9, active);
				ps.setString(10, user.getUserImage());
		        ps.setInt(11, user.getAuthUserId());
		        int accountLocked = (user.isAccountLocked()) ? 1 : 0;
		        ps.setInt(12, accountLocked);
		        ps.setInt(13, user.getDefaultPasswordReset());
		        ps.setDate(14, new java.sql.Date(user.getValidUpto().getTime()));
		        ps.setInt(15, user.getUserSuperviourId());
		        
				return ps;
			}
		}, holder);
		userId = holder.getKey().intValue();
		
		return userId;
	}
	
	/**
	 * @param modifiedOrganization
	 */
	public void updateUser(final User modifiedUser){
		template.update(UPDATE_USER_SQL, 
				new Object[]{modifiedUser.getFirstName(), modifiedUser.getLastName(), modifiedUser.getGender(),
						modifiedUser.getRoleId(), modifiedUser.getDepartmentId(), modifiedUser.getEmailID(),modifiedUser.getPhoneNumber(), 
						modifiedUser.getDateOfJoining(),modifiedUser.isActive(),modifiedUser.getUserImage(),
						modifiedUser.getAuthUserId(),modifiedUser.isAccountLocked(),modifiedUser.getDefaultPasswordReset(),
						modifiedUser.getValidUpto(),modifiedUser.getUserSuperviourId(),modifiedUser.getUserId()
						
		});
	}
	
	/**
	 * @param modifiedOrganization
	 */
	public void deleteUser(final User modifiedUser){
		template.update(DELETE_USER_SQL, new Object[]{modifiedUser.getUserId()});
	}
	
	/**
	 * @return list of organizations
	 */
	public List<User> listUsers(){
		List<User> Userlist = new ArrayList<User>();
		
		Userlist = template.query(GET_USER_SQL, new RowMapper<User>(){

			
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				User user = new User();
								
				user.setUserId(rs.getInt("user_id"));
				user.setFirstName(rs.getString("first_name"));
				user.setLastName(rs.getString("last_name"));
				user.setGender(rs.getString("gender"));
				user.setRoleId(rs.getInt("role_id"));
				user.setDepartmentId(rs.getInt("department_id"));
				user.setEmailID(rs.getString("email_id"));
				user.setPhoneNumber(rs.getString("phone_number"));
				user.setDateOfJoining(rs.getString("date_of_joining"));
				boolean active = (rs.getInt("is_active") == 0)?false:true;
				user.setActive(active);
				user.setUserImage(rs.getString("user_image"));
				user.setAuthUserId(rs.getInt("auth_user_id"));
				boolean accountLocked = (rs.getInt("account_locked") == 0)?false:true;
				user.setAccountLocked(accountLocked);
				user.setDefaultPasswordReset(rs.getInt("default_password_reset"));
				user.setValidUpto(new java.util.Date((rs.getDate("valid_upto")).getTime()));
				user.setUserSuperviourId(rs.getInt("user_superviour_id"));
				
				return user;
			}
			
		});
		
		return Userlist;
	}
}
