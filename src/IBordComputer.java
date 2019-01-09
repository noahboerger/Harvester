import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public interface IBordComputer {
    ScannedWheat getScannedWheatAt(Position position);

    void setScannedWheatList(List<ScannedWheat> scannedWheatList);

    TreeSet<ScannedWheat> getScannedWheatSet();
}
