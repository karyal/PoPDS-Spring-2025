package controls_layout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class GridLayoutTest extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		GridPane pane=new GridPane();
		pane.setHgap(20);
		pane.setVgap(20);
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		
		//Set Background Color on Stage
		primaryStage.setTitle("Null Layout Test");
		primaryStage.setWidth(350);
		primaryStage.setHeight(350);
		primaryStage.setAlwaysOnTop(true);
		
		Label lblTitle, lblUser, lblPassword, lblMessage;
		TextField txtUser;
		PasswordField txtPassword;
		Button btnLogin, btnClose;
		
		lblTitle=new Label("User Login Window");
		//Face, Size, and Style?
		Font font1 = new Font("Arial", 30);
		lblTitle.setFont(font1);
		//Color?
		
		
		lblUser=new Label("User");
		lblPassword=new Label("Password");
		lblMessage=new Label("Message");
		
		txtUser =  new TextField();
		txtPassword = new PasswordField();
		
		btnLogin = new Button("Login");
		btnClose = new Button("Close");
		
		pane.add(lblTitle, 0, 0);
		pane.add(new Label(), 1, 0);
		pane.add(lblUser, 0, 1);
		pane.add(new Label(), 1, 1);
		pane.add(txtUser, 0, 2);
		pane.add(new Label(), 1, 2);
		pane.add(lblPassword, 0, 3);
		pane.add(new Label(), 1, 3);
		pane.add(txtPassword, 0, 4);
		pane.add(new Label(), 1, 4);
		pane.add(btnLogin, 0, 5);
		pane.add(btnClose, 1, 5);
		pane.add(lblMessage, 0, 6);
		pane.add(new Label(), 1, 6);
		
		/*
		flowPane.getChildren().add(lblUser);
		flowPane.getChildren().add(txtUser);
		flowPane.getChildren().add(lblPassword);
		flowPane.getChildren().add(txtPassword);
		flowPane.getChildren().add(btnLogin);
		flowPane.getChildren().add(btnClose);
		flowPane.getChildren().add(lblMessage);
		*/
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}