package controls_layout;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LoginForm extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane pane = new GridPane();
		pane.setHgap(10); // Horizontal gap between columns
		pane.setVgap(10); // Vertical gap between rows
		
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
			public void handle(ActionEvent arg0) {
				//code for btnLogin - Click
				//display main window
				new MainWindow();//Logical Error?
				primaryStage.close();//close
			}
		});
		
		btnClose=new Button("Close");
		btnClose.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				primaryStage.close();
			}
		});
		pane.add(lblTitle, 1, 0);
		pane.add(lblUser, 1, 1);
		pane.add(txtUser, 1, 2);
		pane.add(lblPassword, 1, 3);
		pane.add(txtPassword, 1, 4);
		pane.add(btnLogin, 1,5);
		pane.add(btnClose,2,5);
		pane.add(lblMessage, 1, 6);
		
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
