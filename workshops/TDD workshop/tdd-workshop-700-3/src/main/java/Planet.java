import java.util.ArrayList;

public class Planet {

    private int lengthX;
    private int lengthY;
    private ArrayList<Rock> rocks = new ArrayList<Rock>();

    public Planet(int lengthX, int lengthY) {
        this.lengthX = lengthX;
        this.lengthY = lengthY;
    }

    public void createRock(int x, int y) {
        rocks.add(new Rock((x >= 0 ? x % (lengthX + 1) : x + lengthX + 1), (y >= 0 ? y % (lengthY + 1) : y + lengthY + 1)));
    }

    public int getLengthX() {
        return lengthX;
    }

    public int getLengthY() {
        return lengthY;
    }

    public ArrayList<Rock> getRocks() {
        return rocks;
    }

}