import javax.lang.model.element.NestingKind;

public class Position implements Comparable<Position> {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int compareTo(Position position) {
        if (position.getX() != x) {
            return x - position.getX();
        } else {
            return y - position.getY();
        }
    }

    @Override
    public String toString() {
        return "PosX=" + x + " PosY=" + y;
    }
}
