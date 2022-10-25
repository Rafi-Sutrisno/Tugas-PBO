import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;


public class JavaFXMain extends Application {

    public void start(Stage primaryStage){
        Button btn = new Button();
        btn.setText("Start");
        btn.setLayoutX(200);
        btn.setLayoutY(100);
        btn.setOnAction ((ActionEvent event) -> {
            System.out.println("Hello Object Oriented!");
        });
        Button btn2 = new Button ();
        btn2.setText("Exit");
        btn2.setLayoutX(300);
        btn2.setLayoutY(200);
        btn2.setOnAction ((ActionEvent event) -> {
            System.out.println("Keluar");
        });
        Group root = new Group();
        root.getChildren().add(btn);
        root.getChildren().add(btn2);
        
        HBox root2 = new HBox();
        
        for(int i=0; i<3; i++){
            Button test = new Button ("Start");
            root2.getChildren().add(test);
        }
        root2.setLayoutX(40);
        root2.setLayoutY(400);
        root.getChildren().add(root2);    
        Scene scene = new Scene (root, 640, 480);
        primaryStage.setTitle("Tugas PBO");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
