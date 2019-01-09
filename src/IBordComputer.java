import java.util.LinkedList;
import java.util.List;

public interface IBordComputer {
    ScannedWheat getScannedWheatAt(Position position);

    void setScannedWheatList(List<ScannedWheat> scannedWheatList);
}
