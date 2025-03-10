package week9.day1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class EditUser extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Label lblTitle, lblUid, lblName, lblAddress, lblEmail, lblLoginID, lblLoginPassword, lblMessage;
		TextField txtUid, txtName, txtAddress, txtEmail, txtLoginID, txtLoginPassword;
		Button btnSearch, btnEdit, btnClose;
		
		lblTitle=new Label("Edit User Form");
		lblTitle.relocate(50, 0);
		Font font = new Font("Arial", 20);
		lblTitle.setFont(font);
		
		Font font1 = new Font("Arial", 15);
		lblUid = new Label("UID");
		lblUid.relocate(50, 40);
		lblUid.setFont(font1);
		
		txtUid = new TextField();
		txtUid.relocate(50,70);
		
		btnSearch = new Button("Search");
		btnSearch.relocate(150,70);
		
		lblName=new Label("NAME");
		lblName.relocate(50,100);
		lblName.setFont(font1);
		
		txtName= new TextField();
		txtName.relocate(50,130);
		
		lblAddress=new Label("ADDRESS");
		lblAddress.relocate(50,160);
		lblAddress.setFont(font1);
		
		txtAddress=new TextField();
		txtAddress.relocate(50,190);
		
		lblEmail=new Label("EMAIL");
		lblEmail.relocate(50,220);
		lblEmail.setFont(font1);
		
		txtEmail=new TextField();
		txtEmail.relocate(50,250);
		
		lblLoginID = new Label("LOGIN ID");
		lblLoginID.relocate(50,280);
		lblLoginID.setFont(font1);
		
		txtLoginID=new TextField();
		txtLoginID.relocate(50,310);
		
		lblLoginPassword=new Label("PASSWORD");
		lblLoginPassword.relocate(50,340);
		lblLoginPassword.setFont(font1);
		
		txtLoginPassword=new TextField();
		txtLoginPassword.relocate(50,370);
		
		btnEdit=new Button("Edit");
		btnEdit.relocate(50, 400);
		
		btnClose=new Button("Close");
		btnClose.relocate(150, 400);
		
		lblMessage = new Label("Message");
		lblMessage.relocate(50, 430);
		lblMessage.setFont(font1);
		
		//FlowPane pane=new FlowPane();
		Pane pane=new Pane();
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.setWidth(350);
		primaryStage.setHeight(500);
		
		//pane.getChildren().add() - FlowPane
		//pane.add(lblTitle, 0, 0); - GridPane
		pane.getChildren().add(lblTitle); //Pane
		pane.getChildren().addAll(lblUid, txtUid, btnSearch); 
		pane.getChildren().addAll(lblName, txtName);
		pane.getChildren().addAll(lblAddress, txtAddress);
		pane.getChildren().addAll(lblEmail, txtEmail);
		pane.getChildren().addAll(lblLoginID, txtLoginID);
		pane.getChildren().addAll(lblLoginPassword, txtLoginPassword);
		pane.getChildren().addAll(btnSearch, btnClose, lblMessage);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
	
}
