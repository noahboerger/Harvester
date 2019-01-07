import java.util.HashMap;
import java.util.LinkedList;

public class BordComputer {

    private LinkedList<ScannedWheat> scannedWheatList;


    public BordComputer(LinkedList<ScannedWheat> scannedWheatList) {
        this.scannedWheatList = scannedWheatList;
        sortScannedWheatList();
    }

    private void sortScannedWheatList() {
        scannedWheatList.sort(new ScannedWheatComparator());
    }

    public ScannedWheat getScannedWheatAtPos(Position position) {
        for (ScannedWheat scannedWheat : scannedWheatList) {
            if (scannedWheat.getPosition().equals(position)) {
                return scannedWheat;
            }
        }
        return null;
    }
}
