package sample.model;

/**
 * Created by Bartek on 14.03.2017.
 * Gry Karciane
 */

public class Direction {

    private DirectionHorizontal directionH;
    private DirectionVertical directionV;

    public Direction(){
        directionH = DirectionHorizontal.NONE;
        directionV = DirectionVertical.NONE;
    }


    public Direction(DirectionHorizontal diretionH, DirectionVertical directionV){
        this.directionH = diretionH;
        this.directionV = directionV;
    }


    public DirectionHorizontal getDirectionH() {
        return directionH;
    }

    public void setDirectionH(DirectionHorizontal directionH) {
        this.directionH = directionH;
    }

    public DirectionVertical getDirectionV() {
        return directionV;
    }

    public void setDirectionV(DirectionVertical directionV) {
        this.directionV = directionV;
    }
}
