package user_interfaces;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import mylibs.ResultProcessing;
import mylibs.Student;

public class MainWindow extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		Label lblTitle, lblSid, lblName, lblCourse, lblLevel, lblSection, lblSub1, lblSub2, lblTotal, lblAverage,
				lblResult;
		TextField txtSid, txtName, txtCourse, txtLevel, txtSection, txtSub1, txtSub2, txtTotal, txtAverage, txtResult;
		Button btnSearch, btnCalculate, btnNew, btnSave, btnEdit, btnDelete, btnExport;

		TableView tblStudents;
		
		Font font1 = new Font("Arial", 25);
		Font font2 = new Font("Arial", 16);

		lblTitle = new Label("Student Result Processing System");
		lblTitle.relocate(50, 0);
		lblTitle.setFont(font1);

		lblSid = new Label("SID");
		lblSid.relocate(50, 35);
		lblSid.setFont(font2);

		txtSid = new TextField();
		txtSid.relocate(150, 35);

		btnSearch = new Button("Search");
		btnSearch.relocate(325, 35);

		lblName = new Label("NAME");
		lblName.relocate(50, 70);

		txtName = new TextField();
		txtName.relocate(150, 70);

		lblCourse = new Label("COURSE");
		lblCourse.relocate(50, 105);

		txtCourse = new TextField();
		txtCourse.relocate(150, 105);

		lblLevel = new Label("LEVEL");
		lblLevel.relocate(50, 140);

		txtLevel = new TextField();
		txtLevel.relocate(150, 140);

		lblSection = new Label("SECTION");
		lblSection.relocate(50, 175);

		txtSection = new TextField();
		txtSection.relocate(150, 175);

		lblSub1 = new Label("DCN");
		lblSub1.relocate(50, 210);

		txtSub1 = new TextField();
		txtSub1.relocate(150, 210);

		lblSub2 = new Label("PoP");
		lblSub2.relocate(50, 245);

		txtSub2 = new TextField();
		txtSub2.relocate(150, 245);

		btnCalculate = new Button("Calculate Result");
		btnCalculate.relocate(325, 245);

		lblTotal = new Label("TOTAL");
		lblTotal.relocate(50, 280);

		txtTotal = new TextField();
		txtTotal.relocate(150, 280);

		lblAverage = new Label("AVERAGE");
		lblAverage.relocate(50, 315);

		txtAverage = new TextField();
		txtAverage.relocate(150, 315);

		lblResult = new Label("RESULT");
		lblResult.relocate(50, 350);

		txtResult = new TextField();
		txtResult.relocate(150, 350);

		tblStudents=new TableView();
		tblStudents.setPrefHeight(185);
		tblStudents.setPrefWidth(850);
		tblStudents.relocate(50, 385);
		
		//Add Columns
		TableColumn colSid = new TableColumn<>("SID");
		TableColumn colName = new TableColumn("FULLNAME");
		TableColumn colCourse = new TableColumn("COURSE");
		TableColumn colLevel = new TableColumn("LEVEL");
		TableColumn colSection = new TableColumn("SECTION");
		TableColumn colDcn = new TableColumn("DCN");
		TableColumn colPoP = new TableColumn("POP");
		TableColumn colTotal = new TableColumn("TOTAL");
		TableColumn colAverage = new TableColumn("PERCENTAGE");
		TableColumn colResult = new TableColumn("RESULT");
		
		
		
		tblStudents.getColumns().add(colSid);
		tblStudents.getColumns().add(colName);
		tblStudents.getColumns().add(colCourse);
		tblStudents.getColumns().add(colLevel);
		tblStudents.getColumns().add(colSection);
		tblStudents.getColumns().add(colDcn);
		tblStudents.getColumns().add(colPoP);
		tblStudents.getColumns().add(colTotal);
		tblStudents.getColumns().add(colAverage);
		tblStudents.getColumns().add(colResult);
		
		btnNew = new Button("New");
		btnNew.relocate(50, 585);

		btnSave = new Button("Save");
		btnSave.relocate(120, 585);

		btnEdit = new Button("Edit");
		btnEdit.relocate(190, 585);

		btnDelete = new Button("Delete");
		btnDelete.relocate(260, 585);

		btnExport = new Button("Export All");
		btnExport.relocate(330, 585);

		btnSave.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				Student student = new Student();
				student.setSid(Integer.parseInt(txtSid.getText()));
				student.setFull_name(txtName.getText());
				student.setCourse(txtCourse.getText());
				student.setCurrent_level(txtLevel.getText());
				student.setSection(txtSection.getText());
				student.setDcn(Integer.parseInt(txtSub1.getText()));
				student.setPop(Integer.parseInt(txtSub2.getText()));
				new ResultProcessing().insert(student);
			}
		});

		// Calculate Results
		btnCalculate.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				// Set Values
				Student s1 = new Student();
				s1.setSid(Integer.parseInt(txtSid.getText()));
				s1.setFull_name(txtName.getText());
				s1.setCourse(txtCourse.getText());
				s1.setCurrent_level(txtLevel.getText());
				s1.setSection(txtSection.getText());
				s1.setDcn(Integer.parseInt(txtSub1.getText()));
				s1.setDcn(Integer.parseInt(txtSub2.getText()));

				// Send to middle-ware to process
				s1 = new ResultProcessing().calculateResult(s1);

				// Display Result
				txtTotal.setText(Integer.toString(s1.getTotal()));
				txtAverage.setText(Integer.toString(s1.getAverage()));
				txtResult.setText(s1.getResult());
			}
		});

		// Search and display
		btnSearch.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				Student s1 = new ResultProcessing().search(Integer.parseInt(txtSid.getText()));
				txtName.setText(s1.getFull_name());
				txtCourse.setText(s1.getCourse());
				txtLevel.setText(s1.getCurrent_level());
				txtSection.setText(s1.getSection());
				txtSub1.setText(Integer.toString(s1.getDcn()));
				txtSub2.setText(Integer.toString(s1.getPop()));
				
				Alert alert;
				
				//?
				if (s1.getTotal() > 0) {
					// Record found
					s1 = new ResultProcessing().calculateResult(s1);
					txtTotal.setText(Integer.toString(s1.getTotal()));
					txtAverage.setText(Integer.toString(s1.getAverage()));
					txtResult.setText(s1.getResult());
					alert = new Alert(AlertType.INFORMATION);
					alert.setContentText("Record found and display!");
				} else {
					// record not found
					alert = new Alert(AlertType.CONFIRMATION);
					alert.setContentText("Record not found!");
				}

			}
		});

		//Edit Record
		btnEdit.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				Student s1 = new Student();
				s1.setSid(Integer.parseInt(txtSid.getText()));
				s1.setFull_name(txtName.getText());
				s1.setCourse(txtCourse.getText());
				s1.setCurrent_level(txtLevel.getText());
				s1.setSection(txtSection.getText());
				s1.setDcn(Integer.parseInt(txtSub1.getText()));
				s1.setPop(Integer.parseInt(txtSub2.getText()));
				
				//Send to Edit
				boolean result = new ResultProcessing().edit(s1);
				if(result==true) {
					//Alert success//Dialog
				}
				else {
					//Alert error to edit //Dialog
				}
			}
		});
		
		btnDelete.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				boolean result = new ResultProcessing().delete(Integer.parseInt(txtSid.getText()));
				if(result==true) {
					//alert deleted
				}
				else {
					//alert error to delete
				}
			}
		});
		
		Pane pane = new Pane();
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.setWidth(1000);
		primaryStage.setHeight(700);

		// Add Controls
		pane.getChildren().addAll(lblTitle, lblSid, txtSid, btnSearch);
		pane.getChildren().addAll(lblName, txtName);
		pane.getChildren().addAll(lblCourse, txtCourse);
		pane.getChildren().addAll(lblLevel, txtLevel);
		pane.getChildren().addAll(lblSection, txtSection);
		pane.getChildren().addAll(lblSub1, txtSub1);
		pane.getChildren().addAll(lblSub2, txtSub2, btnCalculate);
		pane.getChildren().addAll(lblTotal, txtTotal);
		pane.getChildren().addAll(lblAverage, txtAverage);
		pane.getChildren().addAll(lblResult, txtResult);
		pane.getChildren().addAll(tblStudents);
		pane.getChildren().addAll(btnNew, btnSave, btnEdit, btnDelete, btnExport);

		// Display Window
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
