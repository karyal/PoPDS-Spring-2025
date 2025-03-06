package controls_layout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class MainWindow extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		FlowPane pane = new FlowPane();
		Scene scene = new Scene(pane);
		
		primaryStage.setTitle("Main Window");
		//primaryStage.setWidth(350);
		//primaryStage.setHeight(300);
		primaryStage.setAlwaysOnTop(true);
		primaryStage.setMaximized(true);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
//	public static void main(String[] args) {
//		launch(args);
//	}
	
}
