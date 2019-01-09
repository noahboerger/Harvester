public class Field implements IField{
    Wheat[][] wheatField;

    public Field() {
        wheatField  = new Wheat[1000][1000];
        for(int x = 0; x < 1000; x++) {
            for(int y = 0; y < 1000; y++) {
                wheatField[x][y] = new Wheat();
            }
        }
    }

    public Wheat scanWheatAtPosition(Position position) {
        return wheatField[position.getX()][position.getY()];
    }
}
