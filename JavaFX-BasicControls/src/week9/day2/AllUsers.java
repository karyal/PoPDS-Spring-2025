package week9.day2;

import java.util.List;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TableView.TableViewSelectionModel;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AllUsers extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Label lblTitle;		
		Button btnDisplay, btnClear, btnClose;
		TableView tblUsers;
		
		lblTitle=new Label("All Users");
		lblTitle.relocate(50, 0);
		Font font = new Font("Arial", 20);
		lblTitle.setFont(font);
		
		btnClear=new Button("Clear All");
		btnClear.relocate(50, 300);	
		
		btnDisplay=new Button("Display All");
		btnDisplay.relocate(150, 300);
				
		btnClose=new Button("Close");
		btnClose.relocate(250, 300);		
		
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
		tblUsers.relocate(50, 30);
		
		btnClear.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
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
		primaryStage.setHeight(375);
		
		//pane.getChildren().add() - FlowPane
		//pane.add(lblTitle, 0, 0); - GridPane
		pane.getChildren().add(lblTitle); 
		pane.getChildren().add(tblUsers); 		
		pane.getChildren().addAll(btnClear, btnDisplay, btnClose);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
	
}
