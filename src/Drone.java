import java.util.LinkedList;

public class Drone implements IDrone{
    private Field actualField;

    @Override
    public void setActualField (Field actualField){
        this.actualField = actualField;
    }

    @Override
    public LinkedList <ScannedWheat> scanField (){
        LinkedList<ScannedWheat> wheatList = new LinkedList<>();

        for(int x = 0; x < 10000; x++) {
            for (int y = 0 ; y < 10000; y++){
                wheatList.add(new ScannedWheat(x, y, actualField.scanWheatAtPosition(x,y).getNumberOfGrain()));
            }
        }
        wheatList.sort(new ScannedWheatComparator());

        return wheatList;
    }
}
