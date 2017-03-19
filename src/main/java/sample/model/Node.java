package sample.model;

/**
 * Created by Bartek on 14.03.2017.
 * Gry Karciane
 */
public class Node {
    private boolean isVisitited;
    private Position position;

    public Node(Position id){
        this.isVisitited = false;
        this.position = id;
    }


    public boolean isVisitited() {
        return isVisitited;
    }

    public Position getPosition() {
        return position;
    }
}
