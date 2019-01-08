import java.util.LinkedList;

public class Main {
    public static void main (String[]args){
        IHarvester harvester = new Harvester();
        IField field = new Field();
        LinkedList<ScannedWheat> wheatList = harvester.sendDrone(field);
        harvester.startHarvesting(wheatList);
        harvester.endHarvesting();
    }
}
