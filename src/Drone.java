import java.util.LinkedList;

public class Drone implements IDrone{
    private Field actualField;

    @Override
    public void setActualField (Field actualField){
        this.actualField = actualField;
    }

    @Override
    public LinkedList <ScannedWheat> scanField (){
        LinkedList<Wheat> wheatList = new LinkedList<>();

        for(int x = 0; x < 10000; x++) {
            for (int y = 0 ; y < 10000; y++){
                wheatList.add(actualField.scanWheatAtPosition(x,y));
            }
        }
        wheatList.sort(new ScannedWheatComparator());

        return wheatList;
    }
}
