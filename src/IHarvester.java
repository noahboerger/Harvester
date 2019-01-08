import java.util.LinkedList;

public interface IHarvester {
    void turnLeft();
    void turnRight();
    void startHarvesting(LinkedList<ScannedWheat> wheatList);
    void endHarvesting();
    LinkedList<ScannedWheat> sendDrone(IField field);
}
