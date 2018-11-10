package tk.mitsu8.simplebase64;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

public class Controller implements Initializable {
	
	@FXML
	private TextArea plainTextArea;
	
	@FXML
	private TextArea encodedTextArea;
	
	private StringPair pair;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		pair = new StringPair();
		plainTextArea.textProperty().bindBidirectional(pair.plainProperty());
		encodedTextArea.textProperty().bindBidirectional(pair.encodedProperty());
	}
	
	
	
}
