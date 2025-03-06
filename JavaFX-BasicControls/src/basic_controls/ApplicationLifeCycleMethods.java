package basic_controls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ApplicationLifeCycleMethods extends Application {

	//Declare
	int num1;
	Scene scene;
	FlowPane flowPane;
	
	@Override
	public void init() {
		//initialize, and set
		num1=90;
		flowPane=new FlowPane();
		scene = new Scene(flowPane);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		//input, process, output
		System.out.println(num1);//90
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	@Override
	public void stop() {
		//remove all
		num1=-1;
		System.out.println(num1);
		scene=null;
		flowPane=null;
	}
	
	public static void main(String[] args) {
		//startup - load at first -> start -> display window
		launch(args);
	}
}