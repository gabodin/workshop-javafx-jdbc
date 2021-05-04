module workshop {
	requires javafx.controls;
	requires javafx.fxml;
	
	exports gui to javafx.fxml;
	
	opens application to javafx.graphics, javafx.fxml;
	opens gui to javafx.graphics, javafx.fxml;
	opens model.entities to javafx.base;
}
