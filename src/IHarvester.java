import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public interface IHarvester {
    void turnLeft();

    void turnRight();

    void startHarvester();

    void stopHarvester();

    void startHarvesting();

    void endHarvesting();

    List<ScannedWheat> sendDrone(IField field);

    Wheat getWheatAt(Position position);

    TreeSet<ScannedWheat> getScannedWheatSet();
}
