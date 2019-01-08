import java.util.LinkedList;

public class Drone implements IDrone {
    private IField actualField;

    public Drone() {

    }

    @Override
    public void setActualField(IField actualField) {
        this.actualField = actualField;
    }

    @Override
    public LinkedList<ScannedWheat> scanField() {
        LinkedList<ScannedWheat> wheatList = new LinkedList<>();

        for (int x = 0; x < 10000; x++) {
            for (int y = 0; y < 10000; y++) {
                wheatList.add(new ScannedWheat(new Position(x,y), actualField.scanWheatAtPosition(new Position(x,y))));
            }
        }

        return wheatList;
    }
}
