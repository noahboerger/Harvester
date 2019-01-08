import java.util.HashMap;
import java.util.LinkedList;
import java.util.TreeMap;

public class BordComputer implements IBordComputer{

    private LinkedList<ScannedWheat> scannedWheatList;
    private TreeMap<Position,ScannedWheat> scannedWheatMap;


    public BordComputer(LinkedList<ScannedWheat> scannedWheatList) {
        this.scannedWheatList = scannedWheatList;
        for (ScannedWheat w: scannedWheatList
             ) {
            scannedWheatMap.put(w.getPosition(),w);
        }
    }


    public ScannedWheat getScannedWheatAtPos(Position position) {

        return scannedWheatMap.get(position);
    }
}
