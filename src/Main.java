import java.util.*;

public class Main {
    public static void main (String[]args){
        IHarvester harvester = new Harvester();
        Position position = new Position(0,0);
        IField field = new Field();

        harvester.startHarvester();

        List<ScannedWheat> unsortedList =  harvester.sendDrone(field);
        System.out.println("Ausgeben eines Teils der unsortierten Liste:");
        for(int i = 0; i < 10; i++) {
            System.out.println(unsortedList.get(i));
        }


        System.out.println("\nAusgeben eines Teils des sortierten TreeSets:");
        TreeSet<ScannedWheat> scannedWheatTreeSet = harvester.getScannedWheatSet();
        Iterator<ScannedWheat> iterator = scannedWheatTreeSet.iterator();
        for(int i = 0; i < 10; i++) {
            ScannedWheat scannedWheat = iterator.next();
            System.out.println(scannedWheat.getWheat() + " " + scannedWheat.getPosition());
        }

        System.out.println("\nWheat at " + position + ":");
        System.out.println(harvester.getWheatAt(position) + "\n");

        harvester.turnLeft();
        harvester.turnRight();

        harvester.startHarvesting();
        harvester.endHarvesting();
        harvester.stopHarvester();
    }
}
