package controls_layout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowLayoutTest extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		FlowPane flowPane=new FlowPane();
		Scene scene = new Scene(flowPane);
		primaryStage.setScene(scene);
		
		primaryStage.setTitle("Null Layout Test");
		primaryStage.setWidth(300);
		primaryStage.setHeight(250);
		primaryStage.setAlwaysOnTop(true);
		
		Label lblTitle, lblUser, lblPassword, lblMessage;
		TextField txtUser;
		PasswordField txtPassword;
		Button btnLogin, btnClose;
		
		lblTitle=new Label("User Login Window");
		lblUser=new Label("User");
		lblPassword=new Label("Password");
		lblMessage=new Label("Message");
		
		txtUser =  new TextField();
		txtPassword = new PasswordField();
		
		btnLogin = new Button("Login");
		btnClose = new Button("Close");
		
		flowPane.getChildren().add(lblTitle);
		flowPane.getChildren().add(lblUser);
		flowPane.getChildren().add(txtUser);
		flowPane.getChildren().add(lblPassword);
		flowPane.getChildren().add(txtPassword);
		flowPane.getChildren().add(btnLogin);
		flowPane.getChildren().add(btnClose);
		flowPane.getChildren().add(lblMessage);
		
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}