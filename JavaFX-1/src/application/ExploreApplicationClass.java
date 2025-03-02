package application;

import javafx.application.Application;
import javafx.stage.Stage;

public class ExploreApplicationClass extends Application {

	@Override
	public void init() {
		System.out.println("Hello from init() method");
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {		
		System.out.println("Hello from start() method");
		primaryStage.show();
	}

	@Override
	public void stop() {
		System.out.println("Hello from stop() method");
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}