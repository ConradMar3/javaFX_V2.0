
package application;

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class AddSubtract1 extends Application implements EventHandler<ActionEvent> {

	public static void main(String[] args) {
		launch(args);
	}

	Button btnAdd;
	Button btnSubtract;
	Label lbl;
	int iCounter = 0;

	@Override
	public void start(Stage primaryStage) {
// Create the Add button
		btnAdd = new Button();
		btnAdd.setText("Add");
		btnAdd.setOnAction(this);
// Create the Subtract button
		btnSubtract = new Button();
		btnSubtract.setText("Subtract");
		btnSubtract.setOnAction(this);
// Create the Label
		lbl = new Label();
		lbl.setText(Integer.toString(iCounter));
// Add the buttons and label to an HBox pane
		HBox pane = new HBox(10);
		pane.getChildren().addAll( btnAdd,lbl, btnSubtract);  // -> Moved lbl to between btnAdd and btnSubtract, looks better.
// Add the layout pane to a scene
		Scene scene = new Scene(pane, 500, 375); // -> Larger pane dimensions (Box is bigger)
// Add the scene to the stage, set the title
// and show the stage
		primaryStage.setScene(scene);
		primaryStage.setTitle("Add/Sub");
		primaryStage.show();
	}

	@Override
	public void handle(ActionEvent e) {
		if (e.getSource() == btnAdd) {
			iCounter++;
		} else {
			if (e.getSource() == btnSubtract) {
				iCounter--;
			}
		}
		lbl.setText(Integer.toString(iCounter));
	}
}
