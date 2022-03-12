package com.example.videogame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;

public class GameBoardController {

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Button startButton;

    @FXML
    private void startGame(ActionEvent event){
        startButton.setVisible(false);

        //a canvas can be used to "draw" on.
        Canvas canvas = new Canvas(GameConfig.getGame_width(),GameConfig.getGame_height());
        GraphicsContext gc = canvas.getGraphicsContext2D(); //asking something to drawn on it

        Image background = new Image(getClass().getResource("images/space.png").toExternalForm());
        Image shipImage = new Image(getClass().getResource("images/ship.png").toExternalForm());

        Sprite ship = new Sprite(shipImage,100,100,100,70,8);

        gc.drawImage(background,0,0,GameConfig.getGame_width(),GameConfig.getGame_height());
        //attach canvas to anchor pane



        anchorPane.getChildren().add(canvas);

    }
}
