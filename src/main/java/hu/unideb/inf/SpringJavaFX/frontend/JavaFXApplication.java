package hu.unideb.inf.SpringJavaFX.frontend;

import hu.unideb.inf.SpringJavaFX.backend.SpringBackendManager;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class JavaFXApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/fxml/MainPage.fxml"));
        Parent root = loader.load();
        stage.setScene(new Scene(root));
        stage.show();

        ((MainPageController)loader.getController())
                .setBackendManager(new SpringBackendManager());
    }

    @Override
    public void stop() throws Exception {
        super.stop();
    }
}
