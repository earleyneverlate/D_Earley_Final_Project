package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;

import java.awt.Font;

import javafx.*;

//public class Main extends Application {
//	
//	public static Stage stage; //global stage
//	@Override
//	public void start(Stage primaryStage) {
//		try {
//			stage = primaryStage;
//			AnchorPane root = new AnchorPane();
//			FXMLLoader.load(getClass().getResource("/views/LoginView.fxml"));
//			Scene scene = new Scene(root, 500, 400); //setting Scene to root
//			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			stage.setTitle("Art Center Login View");
//			stage.setScene(scene);
//			stage.show();
//		} catch(Exception e) {
//			System.out.println("Error occurred while inflating Art Center Login View: " + e);
//		}
//	}
//	
//	public static void main(String[] args) {
//		Application.launch(args);
//	}
//}

public class Main extends Application {

    @Override public void start(Stage stage) {
        Text text = new Text(10, 40, "Hello World!");
//        text.setParent(new Font(40));
        BorderPane border = new BorderPane();
        Scene scene = new Scene(border, 450, 450);
        stage.setTitle("Welcome to JavaFX!"); 
        stage.setScene(scene); 
        stage.sizeToScene(); 
        stage.show(); 
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
