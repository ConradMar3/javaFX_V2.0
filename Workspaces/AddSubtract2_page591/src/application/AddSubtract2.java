/*
 package application;


import java.awt.event.ActionEvent;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
 
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
		pane.getChildren().addAll(lbl, btnAdd, btnSubtract);
// Add the layout pane to a scene
		Scene scene = new Scene(pane, 200, 75);
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
 */

package application;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;

public class AddSubtract2 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	Button btnAdd;
	Button btnSubtract;
	Label lbl;
	int iCounter = 0;

	@Override
	public void start(Stage primaryStage) {
// Create a ClickHandler instance
		ClickHandler ch = new ClickHandler();
// Create the Add button
		btnAdd = new Button();
		btnAdd.setText("Add");
		btnAdd.setOnAction(ch);
// Create the Subtract button
		btnSubtract = new Button();
		btnSubtract.setText("Subtract");
		btnSubtract.setOnAction(ch);
// Create the Label
		lbl = new Label();
		lbl.setText(Integer.toString(iCounter));
// Add the buttons and label to an HBox pane
		HBox pane = new HBox(10);
		pane.getChildren().addAll(lbl, btnAdd, btnSubtract);
// Add the layout pane to a scene
		Scene scene = new Scene(pane, 200, 75);
// Add the scene to the stage, set the title
// and show the stage
		primaryStage.setScene(scene);
		primaryStage.setTitle("Add/Sub");
		primaryStage.show();
	}

	private class ClickHandler implements EventHandler<ActionEvent> {
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
}