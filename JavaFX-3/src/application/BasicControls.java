package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class BasicControls extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		FlowPane flowPane = new FlowPane();
		Scene scene = new Scene(flowPane);
		primaryStage.setScene(scene);
		// height, width, title, resizable, alwaysontop of primaryStage?
		primaryStage.setWidth(350);
		primaryStage.setHeight(250);
		primaryStage.setTitle("Basic Controls");

		// Basic Controls
		Label lblHello = new Label();
		lblHello.setText("Welcome to the World of JavaFX");

		TextField txtHello = new TextField();

		RadioButton rb1 = new RadioButton();
		RadioButton rb2 = new RadioButton();

		ToggleGroup toggleGroup1 = new ToggleGroup();

		rb1.setText("Happy");
		rb1.setSelected(true);// default
		rb2.setText("Sad");
		rb1.setToggleGroup(toggleGroup1);
		rb2.setToggleGroup(toggleGroup1);

		// CheckBox
		CheckBox chk1 = new CheckBox();
		CheckBox chk2 = new CheckBox();
		CheckBox chk3 = new CheckBox();
		chk1.setText("Reading");
		chk1.setSelected(true);
		chk2.setText("Playing");
		chk3.setText("Others");

		// ComboBox
		ComboBox cmb1 = new ComboBox();
		// Adding items in ComboBox
		cmb1.getItems().addAll("Apple", "Banana", "Orange", "Grapes", "Others");
		// default value setting?
		cmb1.setValue("Banana"); // Wrong

		// DatePicker
		DatePicker regDate = new DatePicker();

		// Button
		Button btnSave = new Button();
		btnSave.setText("Save");
		btnSave.setOnMouseClicked((new EventHandler<MouseEvent>() {
			public void handle(MouseEvent event) {
				System.out.println("Hello World");
			}
		}));

		Button btnOk=new Button("OK");
		btnOk.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				System.out.println("Button btnOk Clicked");				
			}
		});
		
		Button btnClose=new Button("Close");
		btnClose.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				System.out.println("Button btnClose Clicked");	
				//Close current window?
				primaryStage.close();
			}
		});
		
		flowPane.getChildren().add(lblHello); // adding Label on FlowPabe
		flowPane.getChildren().add(txtHello);
		flowPane.getChildren().add(rb1);
		flowPane.getChildren().add(rb2);
		flowPane.getChildren().add(chk1);
		flowPane.getChildren().add(chk2);
		flowPane.getChildren().add(chk3);
		flowPane.getChildren().add(cmb1);
		flowPane.getChildren().add(regDate);
		flowPane.getChildren().add(btnSave);
		flowPane.getChildren().add(btnOk);
		flowPane.getChildren().add(btnClose);

		primaryStage.show();
	}

	;

	public static void main(String[] args) {
		launch(args);
	}
}