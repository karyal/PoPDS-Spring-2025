package send_sms;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Pane pane = new Pane();
			Scene scene = new Scene(pane);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setWidth(650);
			primaryStage.setHeight(350);

			// TableView
			TableView tableView = new TableView();
			tableView.relocate(0, 0);
			tableView.setPrefWidth(500);
			tableView.setPrefHeight(250);
			tableView.setEditable(true);
			tableView.setPlaceholder(new Label("No rows to display"));

			TableColumn<Person, Boolean> columnIsSelect = new TableColumn<>("#");
			columnIsSelect.setCellValueFactory(new PropertyValueFactory<>("select"));
			columnIsSelect.setCellFactory(CheckBoxTableCell.forTableColumn(columnIsSelect));

			TableColumn<Person, String> columnPID = new TableColumn<>("PID");
			TableColumn<Person, String> columnName = new TableColumn<>("Fullname");
			TableColumn<Person, String> columnEmail = new TableColumn<>("Email");
			TableColumn<Person, String> columnMobile = new TableColumn<>("Mobile");
			TableColumn<Person, String> vehicleNumber = new TableColumn<>("VehicleNumber");

			columnPID.setCellValueFactory(new PropertyValueFactory<>("isSelect"));
			columnPID.setCellValueFactory(new PropertyValueFactory<>("pid"));
			columnName.setCellValueFactory(new PropertyValueFactory<>("fullName"));
			columnEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
			columnMobile.setCellValueFactory(new PropertyValueFactory<>("mobile"));
			vehicleNumber.setCellValueFactory(new PropertyValueFactory<>("vehicleNumber"));

			tableView.getColumns().add(columnIsSelect);
			tableView.getColumns().add(columnPID);
			tableView.getColumns().add(columnName);
			tableView.getColumns().add(columnEmail);
			tableView.getColumns().add(columnMobile);
			tableView.getColumns().add(vehicleNumber);

			tableView.getItems().add(new Person(false, 1, "Raj Rai", "raj@gmail.com", "9851141414", "9851141414"));
			tableView.getItems()
					.add(new Person(false, 2, "Keshor Joshi", "keshor@gmail.com", "9851147485", "9851141414"));
			tableView.getItems()
					.add(new Person(false, 3, "Ashok Sharma", "ashok@gmail.com", "98511469635", "9851141414"));
			tableView.getItems().add(new Person(false, 4, "Rose Rai", "rose@gmail.com", "9851584758", "9851141414"));
			tableView.getItems()
					.add(new Person(false, 5, "Kiran Thapa", "kiran@gmail.com", "98511897845", "9851141414"));

			Button btnSend = new Button("Send");
			btnSend.relocate(0, 280);

			pane.getChildren().addAll(tableView);
			pane.getChildren().addAll(btnSend);

			primaryStage.show();

			// Events
			List<Person> persons = new ArrayList<Person>();
			btnSend.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					System.out.println("Send Button Clicked");
					ObservableList<Person> row, allRows;
					allRows = tableView.getItems();
					row = tableView.getSelectionModel().getSelectedItems();
					//Read all selected rows
					for(Person person: allRows) {
						System.out.println(person);
						if(person.getSelect()==true) {
							persons.add(person);
						}
					}
					
					//Display all selected rows
					
				}
			});
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}