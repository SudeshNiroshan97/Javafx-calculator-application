import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class Initializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        URL resource = this.getClass().getResource("Calculator.fxml");
        Parent root = FXMLLoader.load(resource);
        Scene mainscene = new Scene(root);
        primaryStage.setScene(mainscene);
        primaryStage.setTitle("Calculator");
        primaryStage.show();




    }
}
