package com.example.videogame;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Sprite {
    private Image image;
    private int posX,posY,imageWidth,imageHieght,speed;
    private boolean alive;

    public Sprite(Image image, int posX, int posY, int imageWidth, int imageHieght, int speed) {
        setImage(image);
        setPosX(posX);
        setPosY(posY);
        setImageHieght(imageHieght);
        setImageWidth( imageWidth);
        setSpeed(speed);
        alive = true;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        if(posX >=0 && posX <= GameConfig.getGame_width()-imageWidth)
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        if(posY >=0 && posY <= GameConfig.getGame_height() - imageHieght)
        this.posY = posY;
    }

    public int getImageWidth() {
        return imageWidth;
    }

    public void setImageWidth(int imageWidth) {
        this.imageWidth = imageWidth;
    }

    public int getImageHieght() {
        return imageHieght;
    }

    public void setImageHieght(int imageHieght) {
        this.imageHieght = imageHieght;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void draw(GraphicsContext gc){
        gc.drawImage(image,posX,posY,imageWidth,imageHieght);
    }
    public void moveRight(){
        posX = posX + speed;

        if(posX >= GameConfig.getGame_width()-imageWidth){
            posX = GameConfig.getGame_width()-imageWidth;
        }
    }

}
