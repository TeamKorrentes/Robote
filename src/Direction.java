/**
 * Created by Алёха on 30.10.2016.
 */
public enum Direction {
    TOP("Верх"),
    LEFT("Лево"),
    BOTTOM("Вниз"),
    RIGHT("Право");

    private String str;

    Direction(String str){
        this.str = str;
    }

    public String toString(){
        return str;
    }
}