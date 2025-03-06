package basic_controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class BasicControls extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		FlowPane flowPane=new FlowPane();
		Scene scene = new Scene(flowPane);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Basic Controls");
		primaryStage.setWidth(500);
		primaryStage.setHeight(300);
		
		//Button
		/*
		Button button1=new Button();
		button1.setText("Click Me!");
		flowPane.getChildren().add(button1);
		*/
		
		//CheckBox
		/*
		CheckBox chk1=new CheckBox("Reading");
		CheckBox chk2=new CheckBox("Playing");
		CheckBox chk3=new CheckBox("Other");		
		chk1.setSelected(true);		
		flowPane.getChildren().addAll(chk1, chk2, chk3);
		*/
		
		//ChoiceBox
		/*
		ChoiceBox choiceBox1 = new ChoiceBox();
		choiceBox1.getItems().addAll("Reading","Playing","Other");
		flowPane.getChildren().add(choiceBox1);
		*/
		
		//ColorPicker
		/*
		Label lblMessage = new Label("Default Color"); 
		ColorPicker colorPicker1 = new ColorPicker();
		flowPane.getChildren().addAll(colorPicker1, lblMessage);
		*/
		
		//ComboBox
		/*
		ComboBox comboBox1 = new ComboBox(); comboBox1.getItems().addAll("1-14", "15-29", "30-44", "45-59", "60+");
		comboBox1.setValue(comboBox1.getItems().get(0));
		flowPane.getChildren().addAll(comboBox1);
		*/
		
		// DatePicker
		/*
		DatePicker datePicker1 = new DatePicker();
		flowPane.getChildren().addAll(datePicker1);
		*/
		
		// Hyperlink
		/*
		Hyperlink link = new Hyperlink("www.oracle.com");
		flowPane.getChildren().addAll(link);
		*/
		
		//Label
		/*
		Label lblHello = new Label("Hello ");
		flowPane.getChildren().addAll(lblHello);
		*/
		
		// ListView
		/*
		ListView listView1=new ListView(); 
		ObservableList<String> values =	FXCollections.observableArrayList("1-14", "15-29", "30-44", "45-59", "60+");
		listView1.setItems(values); listView1.setPrefHeight(50);
		flowPane.getChildren().addAll(listView1);
		*/
		
		//PasswordField
		/*
		PasswordField txtPassword=new PasswordField();
		flowPane.getChildren().addAll(txtPassword);
		*/
		
		// ProgressBar
		/*
		ProgressBar progressBar1 = new ProgressBar();
		progressBar1.setProgress(0.25F); 
		flowPane.getChildren().addAll(progressBar1);
		*/
		
		// ProgressIndicator
		/*
		ProgressIndicator progressIndicator1 = new ProgressIndicator();
		flowPane.getChildren().addAll(progressIndicator1);
		*/
		
		// RadioButton, ToggleGroup
		/*
		RadioButton rb1=new RadioButton("Male"); 
		RadioButton rb2=new RadioButton("Female"); 
		rb1.setSelected(true);
		
		ToggleGroup toggleGroup1=new ToggleGroup(); rb1.setToggleGroup(toggleGroup1);
		rb2.setToggleGroup(toggleGroup1); flowPane.getChildren().addAll(rb1, rb2);
		*/
		
		// ScrollBar
		/*
		ScrollBar scrollBar1 = new ScrollBar();
		scrollBar1.setOrientation(Orientation.VERTICAL);
		flowPane.getChildren().addAll(scrollBar1);
		 */
		
		// ScrollPane
		/*
		Rectangle rect = new Rectangle(200, 200, Color.RED); 
		ScrollPane scrollPane1 = new ScrollPane(); scrollPane1.setPrefSize(120, 120);
		scrollPane1.setContent(rect); 
		flowPane.getChildren().addAll(scrollPane1);
		*/
		
		// Slider
		/*
		Slider slider = new Slider(0, 1, 0.5);
		slider.setShowTickMarks(true);
		slider.setShowTickLabels(true);
		slider.setMajorTickUnit(0.25f);
		slider.setBlockIncrement(0.1f);
		flowPane.getChildren().addAll(slider);
		*/
		
		//Spinner
		/*
		Spinner month = new Spinner(1, 12, 4);
		month.setEditable(true);
		month.setPrefSize(75, 25);
		flowPane.getChildren().addAll(month);
		*/
		
		//TableView
		/*
		TableView tableView = new TableView();
		tableView.setPrefWidth(250);
		tableView.setPrefHeight(125);
		
		TableColumn<Person, String> columnPID = new TableColumn<>("PID");
		columnPID.setCellValueFactory(new PropertyValueFactory<>("pid"));
		
		TableColumn<Person, String> columnName = new TableColumn<>("Fullname");
		columnName.setCellValueFactory(new PropertyValueFactory<>("fullName"));
		
		TableColumn<Person, String> columnEmail= new TableColumn<>("Email");
		columnEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
		
		tableView.getColumns().add(columnPID);
		tableView.getColumns().add(columnName);
		tableView.getColumns().add(columnEmail);
		
		tableView.getItems().add(new Person(1,"Raj Rai","raj@gmail.com"));
		tableView.getItems().add(new Person(2,"Keshor Joshi","keshor@gmail.com"));
		tableView.getItems().add(new Person(3,"Ashok Sharma","ashok@gmail.com"));
		tableView.getItems().add(new Person(4,"Rose Rai","rose@gmail.com"));
		tableView.getItems().add(new Person(5,"Kiran Thapa","kiran@gmail.com"));
		flowPane.getChildren().addAll(tableView);
		*/
		
		//TextArea - Multi-line text box
		/*
		TextArea txtComments = new TextArea("TextArea supports the notion of showing prompt text to the user when there is no text already in the TextArea (either via the user, or set programmatically). This is a useful way of informing the user as to what is expected in the text area, without having to resort to tooltips or on-screen labels.");
		txtComments.setPrefWidth(175);
		txtComments.setPrefHeight(50);
		txtComments.setWrapText(true);
		flowPane.getChildren().addAll(txtComments);
		*/
		
		//TextField - Single line text box
		/*
		TextField txtPID = new TextField();
		txtPID.setPrefWidth(100);
		flowPane.getChildren().addAll(txtPID);
		*/
		
		//MenuBar, Menu, MenuItem
		/*
		MenuBar menuBar1 = new MenuBar();
		Menu menu1 = new Menu("File");
		MenuItem menuItem1 = new MenuItem("New");
		MenuItem menuItem2 = new MenuItem("Open");
		MenuItem menuItem3 = new MenuItem("Close");		
		MenuItem menuItem4 = new MenuItem("Exit");
		SeparatorMenuItem separator = new SeparatorMenuItem();
				
		menu1.getItems().addAll(menuItem1, menuItem2, menuItem3, separator, menuItem4);
		menuBar1.getMenus().add(menu1);
		flowPane.getChildren().addAll(menuBar1);
		*/
		
		//Toolbar, Tooltip
		/*
		ToolBar toolBar1 = new ToolBar();
		Button btn1 = new Button("Button-1");
		Tooltip toolTip1 = new Tooltip("Tooltip-1");
		btn1.setTooltip(toolTip1);
		
		Button btn2 = new Button("Button-2");				
		toolBar1.getItems().addAll(btn1, btn2);
		flowPane.getChildren().addAll(toolBar1);
		*/
		
		//Assign image on button
		
		//TreeView
		/*
		TreeView treeView = new TreeView();
		TreeItem courses= new TreeItem("Courses");
		
		TreeItem bscSE = new TreeItem("BSc SE");
		TreeItem bscBM = new TreeItem("BSc BM");
		
		bscSE.getChildren().add(new TreeItem("Level-4"));
		bscSE.getChildren().add(new TreeItem("Level-5"));
		bscSE.getChildren().add(new TreeItem("Level-5"));
		
		bscBM.getChildren().add(new TreeItem("Level-4"));
		bscBM.getChildren().add(new TreeItem("Level-5"));
		bscBM.getChildren().add(new TreeItem("Level-5"));
		
		courses.getChildren().add(bscSE);
		courses.getChildren().add(bscBM);
		
		treeView.setRoot(courses);
		treeView.setPrefHeight(150);
		flowPane.getChildren().addAll(treeView);
		*/
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}













