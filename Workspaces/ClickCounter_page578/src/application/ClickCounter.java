package application;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class ClickCounter extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	Button btn;
	Label lbl;
	int iClickCount = 0;

	@Override
	public void start(Stage primaryStage) {
		// Create the button
		btn = new Button();
		btn.setText("'Av it son!");
		btn.setOnAction(e -> buttonClick());
		// Create the Label
		lbl = new Label();
		lbl.setText("Click the button!");
		// Add the label and the button to a layout pane
		BorderPane pane = new BorderPane();
		pane.setTop(lbl);
		pane.setCenter(btn);
		// Add the layout pane to a scene
		Scene scene = new Scene(pane, 450, 350);
		// Add the scene to the stage, set the title
		// and show the stage
		primaryStage.setScene(scene);
		primaryStage.setTitle("Click 'o Counter");
		primaryStage.show();
	}

	public void buttonClick() {
		iClickCount++;
		if (iClickCount == 1) {
			lbl.setText("That's a click.");
		} else {
			lbl.setText("You have clicked " + iClickCount + " times.");
		}
	}
}