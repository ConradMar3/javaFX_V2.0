package application;



public interface EventHandler<ActionEvent, Stage> {

	void start(Stage primaryStage);

	void handle(java.awt.event.ActionEvent e);

}
