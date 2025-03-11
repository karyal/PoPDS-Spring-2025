package week9.day2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
		btnSearch.relocate(220,70);
		
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
		
		btnClose.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				primaryStage.close();
			}
		});
		
		//Search
		btnSearch.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				int uid = Integer.parseInt(txtUid.getText());
				User user = new UserCRUD().search(uid);
				if(user.getUid()>0) {
					//Record found and display
					txtName.setText(user.getFullName());
					txtAddress.setText(user.getAddress());
					txtEmail.setText(user.getEmail());
					txtLoginID.setText(user.getLoginID());
					txtLoginPassword.setText(user.getLoginPassword());
					lblMessage.setText("Record found !");
				}
				else {
					txtName.setText("");
					txtAddress.setText("");
					txtEmail.setText("");
					txtLoginID.setText("");
					txtLoginPassword.setText("");
					lblMessage.setText("Record not found !");
				}
			}
		});
		
		
		btnEdit.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent ActionEvent) {
				//code to update record
				User user = new User();
				user.setUid(Integer.parseInt(txtUid.getText()));
				user.setFullName(txtName.getText());
				user.setAddress(txtAddress.getText());
				user.setEmail(txtEmail.getText());
				user.setLoginID(txtLoginID.getText());
				user.setLoginPassword(txtLoginPassword.getText());
				boolean result = new UserCRUD().update(user);
				if(result==true) {
					lblMessage.setText("Update record!");
				}
				else {
					lblMessage.setText("Error to update record");
				}
			}
		});
		
		//FlowPane pane=new FlowPane();
		Pane pane=new Pane();
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.setWidth(350);
		primaryStage.setHeight(500);
		
		//pane.getChildren().add() - FlowPane
		//pane.add(lblTitle, 0, 0); - GridPane
		pane.getChildren().add(lblTitle); //Pane
		pane.getChildren().addAll(lblUid, txtUid); 
		pane.getChildren().add(btnSearch);
		pane.getChildren().addAll(lblName, txtName);
		pane.getChildren().addAll(lblAddress, txtAddress);
		pane.getChildren().addAll(lblEmail, txtEmail);
		pane.getChildren().addAll(lblLoginID, txtLoginID);
		pane.getChildren().addAll(lblLoginPassword, txtLoginPassword);
		pane.getChildren().addAll(btnEdit, btnClose, lblMessage);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
	
}
