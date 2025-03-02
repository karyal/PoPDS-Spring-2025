module JavaFX-2 {
	requires javafx.controls;
	
	opens application to javafx.graphics, javafx.fxml;
}
