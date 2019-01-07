public class Main {
    public static void main (String[]args){
        Harvester harvester = new Harvester();
        harvester.sendDrone();
        harvester.startHarvesting();
        harvester.endHarvesting();
    }
}
