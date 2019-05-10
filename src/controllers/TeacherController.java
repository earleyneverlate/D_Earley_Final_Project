package controllers;

import java.sql.SQLException;
import java.sql.Statement;

import dao.DBConnect;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class TeacherController {
	
	@FXML 
	private Pane pane1;
	
	@FXML 
	private Pane pane2;
	
	@FXML 
	private Pane pane3;
	
	//TO DO 
	@FXML 
	private Button tViewAccount;
	
	//TO DO 
	@FXML 
	private Button tUpdateAccount;
	
	//TO DO 
	@FXML 
	private Button tViewClasses;
	
	@FXML 
	private TextField cTitle; 
	
	@FXML 
	private TextField cLocation;
	
	@FXML 
	private TextField cInstructor;
	
	@FXML 
	private TextField cDept;
	
	@FXML 
	private TextField cSize;
	
	@FXML 
	private TextField cTime;
	//TO DO 
	@FXML 
	private Button cSubmit;
	
	//Declare DB objects
	DBConnect conn = null;
	Statement stmt = null;
	
	public TeacherController() {
		conn = new DBConnect();
	}
	public void ViewAccount() {
		pane1.setVisible(true);
		pane2.setVisible(false);
		pane3.setVisible(false);
		
	}
	public void UpdateAccount() {
		pane1.setVisible(true);
		pane2.setVisible(false);
		pane3.setVisible(false);
	}
	public void ViewClasses() {
		pane1.setVisible(false);
		pane2.setVisible(false);
		pane3.setVisible(true);
	}
	public void submitClass() {
		//insert into art center class table 
		try {
			System.out.println("Inserting class record into the table.");
			stmt = conn.getConnection().createStatement();
			String sql = null;
			
			//include all object data to the database art center class table
			sql="insert into art_center_class(className, classLocation, classInstructor, classDept, classSize, classTime) values('"
			+ cTitle.getText() + "', '" + cLocation.getText() + "', '" + cInstructor.getText() + "', '" + cDept.getText() + 
					 " ', '" + cSize.getText() + "', '" + cTime.getText() + " ')";
			stmt.executeUpdate(sql);
			System.out.println("Class record created!");
			
			conn.getConnection().close();
		} catch (SQLException se) {
			se.printStackTrace();
		}
	}

}
