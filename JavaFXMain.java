import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFXMain extends Application {
    
    @Override
    public void start(Stage Test) {
        //remove code from here 
	Button btn = new Button();
        Button exit  = new Button();
        btn.setText("Hallo Siap Mulai");
        exit.setText("Exit");
        btn.setLayoutX(70);
        btn.setLayoutY(70);
        
        exit.setLayoutX(100);
        exit.setLayoutY(100);
        if(btn.isPressed()){
            System.out.println("Is Clicked");
        }
        btn.setOnAction(new EventHandler<ActionEvent>() { 
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Clicked");
            }
        });
        
        Test.setTitle("Hello World!");
        Test.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

