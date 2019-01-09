import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main (String[]args){
        IHarvester harvester = new Harvester();
        Position position = new Position(0,0);
        IField field = new Field();

        harvester.startHarvester();
        harvester.sendDrone(field);
        System.out.println(harvester.getWheatAt(position));

        harvester.turnLeft();
        harvester.turnRight();
        
        harvester.startHarvesting();
        harvester.endHarvesting();
        harvester.stopHarvester();
    }
}
