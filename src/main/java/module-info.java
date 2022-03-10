module com.example.videogame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.videogame to javafx.fxml;
    exports com.example.videogame;
}