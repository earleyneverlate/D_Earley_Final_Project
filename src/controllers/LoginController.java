//package controllers;
//
//import application.Main;
//import javafx.fxml.FXML;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Scene;
//import javafx.scene.control.Label;
//import javafx.scene.control.PasswordField;
//import javafx.scene.control.TextField;
//import javafx.scene.layout.AnchorPane;
//import models.LoginModel;
//
//public class LoginController {
//	
//	@FXML 
//	private TextField username; 
//	
//	@FXML 
//	private PasswordField password; 
//	
//	@FXML 
//	private Label lblError; 
//	
//	private LoginModel model;
//	
//	public LoginController() {model = new LoginModel();}
//	
//	public void login() {
//		
//		lblError.setText("");
//		String userName = this.username.getText(); 
//		String passWord = this.password.getText(); 
//		
//		//Validations 
//		if (userName == null || userName.trim().equals("")) {
//			lblError.setText("Username cannot be empty or just spaces!");
//			return; 
//		}
//		if (passWord == null || passWord.trim().equals("")) {
//			lblError.setText("Password cannot be empty or spaces");
//			return;
//		}
//		if (userName == null || userName.trim().equals("") && 
//				(passWord == null || passWord.trim().equals(""))) {
//			lblError.setText("Username and password cannot be empty or just spaces!");
//		}
//		//authentication check 
//		checkCredentials(userName, passWord);
//	}
//
//	public void checkCredentials(String usrname, String passwrd) {
//		Boolean isValid = model.getCredentials(usrname,passwrd);
//		if(!isValid) {
//			lblError.setText("User credentials does not exist");
//			return;
//		}
//		try {
//			AnchorPane root;
//			if(model.isTeacher() && isValid) {
//				//if user is a teacher, inflate teacher view 
//				root = (AnchorPane)
//				FXMLLoader.load(getClass().getResource("/views/TeacherView.fxml"));
//					Main.stage.setTitle("Teacher View");
//			}
//			else {
//				//if user is a student, inflate student view
//				root = (AnchorPane)
//				FXMLLoader.load(getClass().getResource("/views/StudentView.fxml"));
//				//Set user ID acquired from db 
//				int user_id = 1; //hard coded for testing purposes only 
//				StudentController.setUserID(user_id);
//				Main.stage.setTitle("Student View");
//			}
//			Scene scene = new Scene(root);
//			Main.stage.setScene(scene);	
//		} catch(Exception e) {
//			System.out.println("Error occurred inflating view: "+ e);
//		}
//		
//	}
//	
//}
