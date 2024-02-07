package application;



import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;


public class AlertBox {

	public static void displayError(String title,String Message) {
		
		Alert alert = new Alert(AlertType.WARNING);
		alert.setTitle(title);
		alert.setHeaderText(Message);
		alert.showAndWait();
	}
	public static void displayInfo(String title,String Message) {
		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle(title);
		alert.setHeaderText(Message);
		alert.showAndWait();
	}
}
