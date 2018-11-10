package tk.mitsu8.simplebase64;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public final class SimpleBase64 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("SimpleBase64.fxml"));
		Parent root = loader.load();
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("SimpleBase64");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
