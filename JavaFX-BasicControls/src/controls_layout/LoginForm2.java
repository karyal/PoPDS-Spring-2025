package controls_layout;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class LoginForm2 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();		
		
		Scene scene=new Scene(pane);	
		primaryStage.setScene(scene);
		
		primaryStage.setTitle("User Login Window");
		primaryStage.setWidth(350);
		primaryStage.setHeight(300);
		primaryStage.setAlwaysOnTop(true);
		
		Label lblTitle, lblUser, lblPassword, lblMessage;
		TextField txtUser;
		PasswordField txtPassword;
		Button btnLogin, btnClose;
		
		lblTitle=new Label("User Login Window");
		lblUser=new Label("User");
		lblPassword=new Label("Password");
		lblMessage=new Label("Message");
		
		txtUser=new TextField();
		txtPassword=new PasswordField();
		
		btnLogin=new Button("Login"); //setOnAction
		btnLogin.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				//code for btnLogin - Click
				//display main window
				try {
					new MainWindow().start(new Stage());
					primaryStage.close();
				} catch (Exception e) {
					e.printStackTrace();
				}//Logical Error?
				//primaryStage.close();//close
			}
		});
		
		btnClose=new Button("Close");
		btnClose.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				primaryStage.close();
			}
		});
		
		lblTitle.relocate(20, 20);
		lblUser.relocate(20, 50);
		txtUser.relocate(20, 80);
		lblPassword.relocate(20, 120);
		txtPassword.relocate(20, 150);
		btnLogin.relocate(20, 180);
		btnClose.relocate(80, 180);
		
		//lblMessage.relocate(20, 220);
		
		lblMessage.setLayoutX(20);
		lblMessage.setLayoutY(220);
		
		pane.getChildren().add(lblTitle);
		pane.getChildren().add(lblUser);
		pane.getChildren().add(txtUser);
		pane.getChildren().add(lblPassword);
		pane.getChildren().add(txtPassword);
		pane.getChildren().add(btnLogin);
		pane.getChildren().add(btnClose);
		pane.getChildren().add(lblMessage);		
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}