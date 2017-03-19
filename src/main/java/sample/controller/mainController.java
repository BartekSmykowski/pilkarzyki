package sample.controller;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import sample.model.Direction;
import sample.model.DirectionHorizontal;
import sample.model.DirectionVertical;
import sample.model.Game;


public class mainController {
    public Canvas mainCanvas;

    private Game game;

    @FXML
    public void initialize(){
        GraphicsContext gc = mainCanvas.getGraphicsContext2D();


        gc.setFill(Color.GREENYELLOW);
        gc.fillRect(0,0,mainCanvas.getWidth(),mainCanvas.getHeight());
        //printGame();
    }

    public void printGame(){
        GraphicsContext gc = mainCanvas.getGraphicsContext2D();
        gc.setStroke(Color.BLUE);
        gc.setLineWidth(5);
        //gc.strokeLine(0, 0, 0, 400);
        gc.setFill(Color.BLUE);
        for(int i = 0; i < game.getWidth();i++){
            for(int j = 0; j < game.getHeight(); j++){
                gc.fillOval(20*i+10, 20*j+10, 3, 3);
            }
        }
//        mainCanvas.setWidth(20*(game.getWidth()));
//        mainCanvas.setHeight(20*(game.getHeight()));

    }

    public void setGame(Game game){
        this.game = game;
    }


    public void keyPress(KeyEvent keyEvent) {
        GraphicsContext gc = mainCanvas.getGraphicsContext2D();
        gc.setLineWidth(3);
        gc.setStroke(Color.GRAY);
        int xPos = game.getPosition().getX();
        int yPos = game.getPosition().getY();
        if(keyEvent.getCode() == KeyCode.Y){
            game.move(new Direction(DirectionHorizontal.NONE, DirectionVertical.UP));
        } else if(keyEvent.getCode() == KeyCode.U){
            game.move(new Direction(DirectionHorizontal.RIGHT, DirectionVertical.UP));
        } else if(keyEvent.getCode() == KeyCode.J){
            game.move(new Direction(DirectionHorizontal.RIGHT, DirectionVertical.NONE));
        } else if(keyEvent.getCode() == KeyCode.M){
            game.move(new Direction(DirectionHorizontal.RIGHT, DirectionVertical.DOWN));
        }else if(keyEvent.getCode() == KeyCode.N){
            game.move(new Direction(DirectionHorizontal.NONE, DirectionVertical.DOWN));
        }else if(keyEvent.getCode() == KeyCode.B){
            game.move(new Direction(DirectionHorizontal.LEFT, DirectionVertical.DOWN));
        }else if(keyEvent.getCode() == KeyCode.G){
            game.move(new Direction(DirectionHorizontal.LEFT, DirectionVertical.NONE));
        }else if(keyEvent.getCode() == KeyCode.T){
            game.move(new Direction(DirectionHorizontal.LEFT, DirectionVertical.UP));
        }

        int xNewPos = game.getPosition().getX();
        int yNewPos = game.getPosition().getY();
        gc.strokeLine(20*xPos + 10, 20*yPos + 10, 20*xNewPos + 10, 20*yNewPos + 10);
    }
}
