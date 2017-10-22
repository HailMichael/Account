import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.ChoiceDialog;
import java.util.ArrayList;
import java.util.Optional;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

/**
 * @author Michael Hailemariam
 * Date 10/22/2017
 * Application to prompt the user to enter his/her role.
 * SuppressWarnings("unchecked"); tell the compiler that what you're doing really will be legal at execution time.
 */

public class Account extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		ArrayList<String> choices = new ArrayList<String>();
		choices.add("Administrator");
		choices.add("Faculty");
		choices.add("Staff");
		choices.add("Student");
		choices.add("Guest");

		String defaultOption = choices.get(4);
		@SuppressWarnings("unchecked")
		ChoiceDialog choiceDialog = new ChoiceDialog(defaultOption, choices);
		choiceDialog.setTitle("Account");
		choiceDialog.setHeaderText("Pleae select your account");
		@SuppressWarnings("unchecked")
		Optional<String> result = choiceDialog.showAndWait();
		
		String selected = result.get();

		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Account");
		alert.setHeaderText("Welcome!");
		switch(selected) {
			case "Administrator":
				alert.setContentText("Welcome adminstrator!");
				break;
			case "Faculty":
				alert.setContentText("Welcome faculty!");
				break;
			case "Staff":
				alert.setContentText("Welcome staff!");
				break;
			case "Student":
				alert.setContentText("Welcome student!");
				break;
			case "Guest":
				alert.setContentText("Welcome guest!");
				break;

		}

		alert.show();
	
	}
}
