import java.util.HashMap;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.List;

public class BordComputer implements IBordComputer {

    private TreeMap<Position, ScannedWheat> scannedWheatMap;

    public BordComputer() {
    }

    public BordComputer(LinkedList<ScannedWheat> scannedWheatList) {
        scannedWheatMap = new TreeMap<>();
        for (ScannedWheat scannedWheat : scannedWheatList) {
            scannedWheatMap.put(scannedWheat.getPosition(), scannedWheat);
        }
    }

    @Override
    public void setScannedWheatList(List<ScannedWheat> scannedWheatList) {
        scannedWheatMap = new TreeMap<>();
        for (ScannedWheat scannedWheat : scannedWheatList) {
            scannedWheatMap.put(scannedWheat.getPosition(), scannedWheat);
        }
    }

    @Override
    public ScannedWheat getScannedWheatAt(Position position) {
        if (scannedWheatMap == null) {
            return null;
        } else {
            return scannedWheatMap.get(position);
        }
    }
}
