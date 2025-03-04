package application;

//Ctlr + Shift + O - auto import
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class MainWindow extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("MainWindow");
		primaryStage.setWidth(350); //pixel
		primaryStage.setHeight(250);
		primaryStage.setResizable(false);
		primaryStage.setAlwaysOnTop(true);
		
		FlowPane flowPane = new FlowPane();
		Scene scene = new Scene(flowPane);
		//how to set flowPane to primaryStage?
		primaryStage.setScene(scene);
		
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);//call start method
	}
}
