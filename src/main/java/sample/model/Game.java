package sample.model;

import java.util.Vector;

public class Game {
    private Node[][] fields;
    private Vector<Vector<Node>> field;
    private int width;
    private int height;
    private Position positionOfBall;

    public Game(){
        width = 3;
        height = 3;
        positionOfBall = new Position(width/2, height/2);

        fields = new Node[width][height];
        for(int i = 0; i < width; i++){
            for(int j = 0; j <= height; j++) {
                fields[i][j] = new Node(new Position(i, j));
            }
        }

    }

    private Node[] takeNeighbours(Position position){
        Node[] neigbours = new Node[8];
        int count = 0;
        for(int i = -1; i <= 1; i++){
            for(int j = -1; j <= 1; j++) {
                if (i != 0 && j != 0) {
                    //neigbours[count] = fields[i + position.getX()][j + position.getY()];
                    count++;
                }
            }
        }
        return neigbours;
    }

    public void move(Direction direction){
        int x = positionOfBall.getX();
        int y = positionOfBall.getY();
        int xprev = positionOfBall.getX();
        int yprev = positionOfBall.getY();
        if(direction.getDirectionH() == DirectionHorizontal.LEFT){
            x--;
        } else if(direction.getDirectionH() == DirectionHorizontal.RIGHT){
            x++;
        }
        if(direction.getDirectionV() == DirectionVertical.DOWN){
            y++;
        } else if(direction.getDirectionV() == DirectionVertical.UP){
            y--;
        }
        //if(connections[x*width+y][xprev*width+yprev] == 1) {
            positionOfBall.setX(x);
            positionOfBall.setY(y);
        //}
    }

    public int getWidth(){return width;}

    public int getHeight(){return height;}

    public Position getPosition(){return positionOfBall;}
}
