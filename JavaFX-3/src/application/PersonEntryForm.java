package application;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import myjdbc.Person;
import myjdbc.PersonCRUDV6;

public class PersonEntryForm extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setWidth(200);
		primaryStage.setHeight(225);
		FlowPane flowPane=new FlowPane();
		Scene scene=new Scene(flowPane);
		primaryStage.setScene(scene);
		
		//Declare
		Label lblTitle, lblPID, lblName, lblEmail;
		TextField txtPID, txtName, txtEmail;
		Button btnSave, btnClose;
		
		//Initialize, and Set
		lblTitle=new Label("Person Entry Form");
		lblPID=new Label("PID : ");
		lblName=new Label("NAME : ");
		lblEmail=new Label("EMAIL : ");
		
		txtPID=new TextField();
		txtName=new TextField();
		txtEmail=new TextField();
		
		btnSave=new Button("Save");
		btnSave.setOnMouseClicked((new EventHandler<MouseEvent>() {
			public void handle(MouseEvent event) {
				//Save Record on Database table
				Person person=new Person();
				person.setPID(Integer.parseInt(txtPID.getText()));
				person.setFullName(txtName.getText());
				person.setEmail(txtEmail.getText());
				new PersonCRUDV6().insert(person);
				System.out.println("Record save successfully");
			}
		}));
		
		btnClose=new Button("Close");
		btnClose.setOnMouseClicked((new EventHandler<MouseEvent>() {
			public void handle(MouseEvent event) {
				primaryStage.close();
			}
		}));
		
		//Add Controls on Stage
		flowPane.getChildren().add(lblTitle);
		flowPane.getChildren().add(lblPID);
		flowPane.getChildren().add(txtPID);
		flowPane.getChildren().add(lblName);
		flowPane.getChildren().add(txtName);
		flowPane.getChildren().add(lblEmail);
		flowPane.getChildren().add(txtEmail);
		flowPane.getChildren().add(btnSave);
		flowPane.getChildren().add(btnClose);
		
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
	
}
