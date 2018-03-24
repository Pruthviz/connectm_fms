package com.connectm.fms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.connectm.fms.idao.IAuthUserDAO;
import com.connectm.fms.model.AuthUser;


public class AuthUserDAO implements IAuthUserDAO {
	
	private JdbcTemplate template;

	/**
	 * default constructor
	 */
	public AuthUserDAO() 
	{
		
		
	}

	/**
	 * set JdbcTemplate
	 * 
	 * @param template
	 */
	public void setTemplate(JdbcTemplate template) 
	{
		this.template = template;
	}
	
	/**
	 * @param newAuthUser
	 * @return
	 */
	public int createAuthUser(final AuthUser authUser)
	{		
		int authUserId = 0;
		KeyHolder holder = new GeneratedKeyHolder();
		template.update(new PreparedStatementCreator() {

			public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
				PreparedStatement ps = connection.prepareStatement(INSERT_AUTHUSER_SQL, new String[] { "authUserId" });
				
				ps.setString(1, authUser.getUserName());
				ps.setString(2, authUser.getPassword());
				ps.setDate(3, (java.sql.Date) authUser.getPasswordSetDate());
				ps.setInt(4, authUser.getInvalidAttempts());
		        
				return ps;
			}
		}, holder);
		authUserId = holder.getKey().intValue();
		
		return authUserId;
	}
	
	/**
	 * @param modifiedAuthUser
	 */
	public void updateAuthUser(final AuthUser modifiedAuthUser)
	{
		template.update(UPDATE_AUTHUSER_SQL, 
				new Object[]{
						
						modifiedAuthUser.getUserName() ,modifiedAuthUser.getPassword(),
						modifiedAuthUser.getPasswordSetDate(), modifiedAuthUser.getInvalidAttempts()
		});
	}
	
	/**
	 * @param modifiedAuthUser
	 */
	public void deleteAuthUser(final AuthUser modifiedAuthUser)
	{		
		template.update(DELETE_AUTHUSER_SQL, new Object[]{modifiedAuthUser.getAuthUserId()});
	}
	
	/**
	 * @param modifiedAuthUser
	 */
	public void resetPassword(final AuthUser modifiedAuthUser)
	{		
		template.update(UPDATE_AUTHUSER_PASSWORD_SQL, new Object[]{modifiedAuthUser.getPassword(),modifiedAuthUser.getAuthUserId()});
	}
	
	/**
	 * @return list of AuthUser
	 */
	public List<AuthUser> listAuthUser()
	{		
		List<AuthUser> AuthUserlist = new ArrayList<AuthUser>();
		
		AuthUserlist = template.query(GET_AUTHUSER_SQL, new RowMapper<AuthUser>(){

			
			public AuthUser mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				AuthUser authUser = new AuthUser();
				
				authUser.setAuthUserId(rs.getInt("auth_user_id"));
				authUser.setUserName(rs.getString("user_name"));
				authUser.setPasswordSetDate(rs.getDate("password_set_date"));
				authUser.setInvalidAttempts(rs.getInt("invalid_attempts"));			
				
				return authUser;
			}
			
		});
		
		return AuthUserlist;
	}
	
	/**
	 * @return View AuthUser
	 */
	@SuppressWarnings("unchecked")
	public AuthUser viewOrganization(int auth_user_id){
		
		AuthUser authUser = new AuthUser();
		
		try {	
				
			authUser = (AuthUser)template.queryForObject(GET_AUTHUSERBYID_SQL, new Object[]
		        { auth_user_id },new RowMapper(){

			public AuthUser mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				AuthUser authUser = new AuthUser();
				
				authUser.setAuthUserId(rs.getInt("auth_user_id"));
				authUser.setUserName(rs.getString("user_name"));
				authUser.setInvalidAttempts(rs.getInt("invalid_attempts"));	
				
				return authUser;
			}
			
		});
		
		return authUser;
		
		} catch (EmptyResultDataAccessException e) 
		{
			return null;
		}		
	}

	public void lockAuthUser(AuthUser modifiedAuthUser) {

		template.update(LOCK_AUTHUSER_SQL, new Object[]{modifiedAuthUser.getAuthUserId()});
		
	}

	public void unlockAuthUser(AuthUser modifiedAuthUser) {
		
		template.update(UNLOCK_AUTHUSER_SQL, new Object[]{modifiedAuthUser.getAuthUserId()});
	}
}
