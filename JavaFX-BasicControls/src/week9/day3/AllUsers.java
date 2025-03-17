package week9.day3;

import java.util.List;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TableView.TableViewSelectionModel;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import week9.day2.User;
import week9.day2.UserCRUD;

public class AllUsers extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Label lblTitle, lblUid, lblName, lblAddress, lblEmail, lblLoginID, lblLoginPassword, lblMessage;
		TextField txtUid, txtName, txtAddress, txtEmail, txtLoginID, txtLoginPassword;
		Button btnSearch, btnNew, btnSave, btnEdit, btnDelete, btnClose, btnDisplay, btnClear;
		
		TableView tblUsers;
		
		lblTitle=new Label("User Management System");
		lblTitle.relocate(50, 0);
		Font font = new Font("Arial", 20);
		lblTitle.setFont(font);
		
		Font font1 = new Font("Arial", 18);
		lblTitle.setFont(font1);
		
		lblUid = new Label("UID");
		lblUid.relocate(50, 40);
		lblUid.setFont(font1);
		
		txtUid = new TextField();
		txtUid.relocate(170,40);
		
		lblName=new Label("NAME");
		lblName.relocate(50, 80);
		lblName.setFont(font1);
		
		txtName= new TextField();
		txtName.relocate(170, 80);
		
		lblAddress=new Label("ADDRESS");
		lblAddress.relocate(50, 120);
		lblAddress.setFont(font1);
		
		txtAddress=new TextField();
		txtAddress.relocate(170, 120);
		
		lblEmail=new Label("EMAIL");
		lblEmail.relocate(50, 160);
		lblEmail.setFont(font1);
		
		txtEmail=new TextField();
		txtEmail.relocate(170, 160);
		
		lblLoginID = new Label("LOGIN ID");
		lblLoginID.relocate(50, 200);
		lblLoginID.setFont(font1);
		
		txtLoginID=new TextField();
		txtLoginID.relocate(170, 200);
		
		lblLoginPassword=new Label("PASSWORD");
		lblLoginPassword.relocate(50, 240);
		lblLoginPassword.setFont(font1);
		
		txtLoginPassword=new TextField();
		txtLoginPassword.relocate(170, 240);
		
		lblMessage = new Label("Message");
		lblMessage.relocate(50, 620);
		
		btnSearch = new Button("Search");
		btnSearch.relocate(350, 40);
		
		btnNew = new Button("New");
		btnNew.relocate(50, 280);
		
		btnSave= new Button("Save");
		btnSave.relocate(150, 280);
		
		btnEdit= new Button("Edit");
		btnEdit.relocate(250, 280);
		
		btnDelete= new Button("Delete");
		btnDelete.relocate(350, 280);
		
		tblUsers = new TableView();
		tblUsers.setPlaceholder(new Label("No rows to display"));
		
		TableColumn<User, Integer> colUid = new TableColumn<>("UID");		
		TableColumn<User, String> colFullName= new TableColumn<>("NAME");			
		TableColumn<User, String> colAddress = new TableColumn<>("ADDRESS");					
		TableColumn<User, String> colEmail = new TableColumn<>("EMAIL");				
		TableColumn<User, String> colUser = new TableColumn<>("USER");				
		TableColumn<User, String> colPass = new TableColumn<>("PASSWORD");		
				
		colUid.setCellValueFactory(new PropertyValueFactory<>("uid"));
		colFullName.setCellValueFactory(new PropertyValueFactory<>("fullName"));
		colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));	
		colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));		
		colUser.setCellValueFactory(new PropertyValueFactory<>("loginID"));
		colPass.setCellValueFactory(new PropertyValueFactory<>("loginPassword"));
		
		tblUsers.getColumns().add(colUid);
		tblUsers.getColumns().add(colFullName);
		tblUsers.getColumns().add(colAddress);
		tblUsers.getColumns().add(colEmail);
		tblUsers.getColumns().add(colUser);
		tblUsers.getColumns().add(colPass);
		
		tblUsers.setPrefHeight(250);
		tblUsers.setPrefWidth(500);
		tblUsers.relocate(50, 320);
		
		btnClear=new Button("Clear All");
		btnClear.relocate(50, 580);	
		
		btnDisplay=new Button("Display All");
		btnDisplay.relocate(150, 580);
				
		btnClose=new Button("Close");
		btnClose.relocate(250, 580);
		
		btnSearch.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				//Search and Display
				int uid = Integer.parseInt(txtUid.getText());//String to Integer
				User user = new UserCRUD().search(uid); //Record search bases on uid
				if(user.getUid()>0) {
					txtName.setText(user.getFullName());
					txtAddress.setText(user.getAddress());
					txtEmail.setText(user.getEmail());
					txtLoginID.setText(user.getLoginID());
					txtLoginPassword.setText(user.getLoginPassword());
					lblMessage.setText("User found!");
				}
				else {
					txtName.setText("");//clear text
					txtAddress.setText("");
					txtEmail.setText("");
					txtLoginID.setText("");
					txtLoginPassword.setText("");
					lblMessage.setText("User not found!");
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
		
		btnDelete.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {				
				int uid = Integer.parseInt(txtUid.getText());				
				boolean result = new UserCRUD().delete(uid);
				if(result==true) {
					lblMessage.setText("Delete record!");
				}
				else {
					lblMessage.setText("Error to delete record");
				}
			}
		});
		
		btnNew.setOnAction(new EventHandler<ActionEvent>() {	
			@Override
			public void handle(ActionEvent actionEvent) {				
				txtUid.setText("");
				txtName.setText("");
				txtAddress.setText("");
				txtEmail.setText("");
				txtLoginID.setText("");
				txtLoginPassword.setText("");				
			}
		});
		
		btnSave.setOnAction(new EventHandler<ActionEvent>() {	
			@Override
			public void handle(ActionEvent actionEvent) {
				User user=new User();
				user.setUid(Integer.parseInt(txtUid.getText()));
				user.setFullName(txtName.getText());
				user.setAddress(txtAddress.getText());
				user.setEmail(txtEmail.getText());
				user.setLoginID(txtLoginID.getText());
				user.setLoginPassword(txtLoginPassword.getText());
				boolean result = new UserCRUD().insert(user);
				if(result==true) {
					lblMessage.setText("Insert User Successfully");
				}
				else {
					lblMessage.setText("Error to insert User");
				}
				
			}
		});
		
		btnClear.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				//Clear All Records
				tblUsers.getItems().clear();
				//selectionModel.clearSelection();
				
			}
		});
		
		btnDisplay.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				//GetAll and Display	
				List<User> users = new UserCRUD().all();
				for(User user: users) {
					//tblUsers.getItems().add(new User(1, "Raj","KTM", "raj@gmail.com", "raj", "raj"));
					System.out.println(user);
					tblUsers.getItems().add(user);
				}				
			}
		});
				
		btnClose.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				primaryStage.close();
			}
		});
		
		//FlowPane pane=new FlowPane();
		Pane pane=new Pane();
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.setWidth(600);
		primaryStage.setHeight(700);
		
		//pane.getChildren().add() - FlowPane
		//pane.add(lblTitle, 0, 0); - GridPane
				
		pane.getChildren().add(lblTitle);
		pane.getChildren().addAll(lblUid, txtUid, btnSearch);
		pane.getChildren().addAll(lblName, txtName);
		pane.getChildren().addAll(lblAddress, txtAddress);
		pane.getChildren().addAll(lblEmail, txtEmail);
		pane.getChildren().addAll(lblLoginID, txtLoginID);
		pane.getChildren().addAll(lblLoginPassword, txtLoginPassword);		
		pane.getChildren().addAll(btnNew, btnSave, btnEdit, btnDelete);
		pane.getChildren().add(tblUsers); 		
		pane.getChildren().addAll(btnClear, btnDisplay, btnClose);
		pane.getChildren().addAll(lblMessage);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}	
}