public class Field {
    Wheat[][] wheatField;

    public Field() {
        wheatField  = new Wheat[10000][10000];
        for(int x = 0; x < 10000; x++) {
            for(int y = 0; y < 10000; y++) {
                wheatField[x][y] = new Wheat();
            }
        }
    }

    public Wheat scanWheatAtPosition(int x, int y) {
        return wheatField[x][y];
    }
}
