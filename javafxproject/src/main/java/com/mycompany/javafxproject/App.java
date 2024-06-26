package com.mycompany.javafxproject;

import commonuse.JdbcUtils;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import static javafx.application.Application.launch;
/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        stage.setResizable(false);
        stage.setTitle("@2022 Power By codefoodteam");
        stage.centerOnScreen();
        scene = new Scene(loadFXML("home-page"), 1280, 710);

        stage.setOnHiding(et -> {
            Connection conn = null;
            conn = JdbcUtils.getConn();
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }
}