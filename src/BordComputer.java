import java.util.*;

public class BordComputer implements IBordComputer {

    private TreeMap<Position, ScannedWheat> scannedWheatMap;
    private TreeSet<ScannedWheat> scannedWheatSet;

    public BordComputer() {
        scannedWheatMap = new TreeMap<>();
        scannedWheatSet = new TreeSet<>(new ScannedWheatComparator());
    }

    public BordComputer(LinkedList<ScannedWheat> scannedWheatList) {
        scannedWheatMap = new TreeMap<>();
        scannedWheatSet = new TreeSet<>(new ScannedWheatComparator());
        for (ScannedWheat scannedWheat : scannedWheatList) {
            scannedWheatMap.put(scannedWheat.getPosition(), scannedWheat);
            scannedWheatSet.add(scannedWheat);
        }
    }

    @Override
    public void setScannedWheatList(List<ScannedWheat> scannedWheatList) {
        scannedWheatMap = new TreeMap<>();
        scannedWheatSet = new TreeSet<>(new ScannedWheatComparator());
        for (ScannedWheat scannedWheat : scannedWheatList) {
            scannedWheatMap.put(scannedWheat.getPosition(), scannedWheat);
            scannedWheatSet.add(scannedWheat);
        }
    }

    @Override
    public TreeSet<ScannedWheat> getScannedWheatSet() {
        return scannedWheatSet;
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
