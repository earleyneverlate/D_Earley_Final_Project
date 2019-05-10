//package controllers;
//
//import application.Main;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Scene;
//import javafx.scene.control.Alert;
//import javafx.scene.control.Alert.AlertType;
//import javafx.scene.layout.AnchorPane;
//
//public class StudentController {
//	
//	public StudentController() {
//		Alert alert = new Alert(AlertType.INFORMATION);
//		alert.setTitle("From Student Controller");
//		alert.setHeaderText("Art Center");
//		alert.setContentText("Welcome!");
//		alert.showAndWait();
//	}
//	static int userID;
//	
//	public static void setUserID(int user_id) {
//		userID = user_id;
//		System.out.println("Welcome id " + userID);
//	}
//	
//	public void logout() {
//		try {
//			AnchorPane root = (AnchorPane)
//			FXMLLoader.load(getClass().getResource("/views/LoginView.fxl"));
//			Scene scene = new Scene(root);
//			scene.getStylesheets().add(getClass().getResource("/application/application.css").toExternalForm());
//			Main.stage.setScene(scene);
//			Main.stage.setTitle("Login");
//		}catch (Exception e) {
//			System.out.println("Error occurred while inflating view: " + e);
//		}
//	}
//}

