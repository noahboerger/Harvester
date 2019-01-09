import java.util.LinkedList;

public class Drone implements IDrone {

    public Drone() {
    }

    @Override
    public LinkedList<ScannedWheat> scanField(IField field) {
        LinkedList<ScannedWheat> wheatList = new LinkedList<>();

        for (int x = 0; x < 1000; x++) {
            for (int y = 0; y < 1000; y++) {
                wheatList.add(new ScannedWheat(new Position(x, y), field.scanWheatAtPosition(new Position(x, y))));
            }
        }

        return wheatList;
    }
}
