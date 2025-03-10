package basic_controls;

import java.io.FileInputStream;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonClass extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		FlowPane flowPane = new FlowPane();
		Scene scene = new Scene(flowPane);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("CheckBox Controls");
		primaryStage.setWidth(500);
		primaryStage.setHeight(300);

		//Button
		Button button1 = new Button();

		//Set/Get Text
		button1.setText("Click Me!");
		String str1 = button1.getText();
		System.out.println(str1);
		
		//Alignment
		//void setAlignment​(Pos value)
		//Pos getAlignment()
		 
		button1.setPrefHeight(25);
		button1.setPrefWidth(75);

		//Color
		/*
		 Paint paint = Color.RED;
		 CornerRadii cornerRadii = new CornerRadii(5);
		 Insets insets=new Insets(20, 25,20,25);
		 button1.setBackground(new Background(new BackgroundFill(paint, cornerRadii, insets)));
		*/
		
		//Image
		/*
		FileInputStream fileInputStream = new FileInputStream("resources/images/refresh.png");
		Image image1 = new Image(fileInputStream);
		ImageView imageView = new ImageView(image1);
		button1.setGraphic(imageView);
		*/
		
		//Enable/Disable
		//button1.setDisable(true);
		//button1.setDisable(false);
		
		//protected Object	clone()
		/*
		Button btn1 = new Button();
		Button btn2 = new Button();
		Button btn3 = btn2; 
		boolean result = btn1.equals(btn2);
		System.out.println(result);
		result = btn2.equals(btn3);
		System.out.println(result);
		*/		
		
		//int	hashCode()
		/*
		Button btn1 = new Button();
		Button btn2 = new Button();
		Button btn3 = btn2;
		System.out.println(btn1.hashCode());
		System.out.println(btn2.hashCode());
		System.out.println(btn3.hashCode());
		*/
		
		flowPane.getChildren().add(button1);

		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}