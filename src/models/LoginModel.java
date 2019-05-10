package models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.DBConnect;

public class LoginModel extends DBConnect{
	
	private Boolean teacher;
	
	public Boolean isTeacher() {
		return teacher;
	}
	
	public void setTeacher(Boolean teacher) {
		this.teacher = teacher;
	}
	
	public Boolean getCredentials(String username, String password) {
		String query = "SELECT * FROM art_center_login WHERE username = ? and password = ?; ";
		try(PreparedStatement stmt = connection.prepareStatement(query)){
			stmt.setString(1, username);
			stmt.setString(2, password);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				setTeacher(rs.getBoolean("teacher"));
				return true;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
