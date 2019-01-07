import java.util.Comparator;
import java.util.LinkedList;

public class Drone extends IDrone{
    private Field actualField;

    public void setActualField (Field actualField){
        this.actualField = actualField;
    }

    public LinkedList <Wheat> scanField (Field field){
        LinkedList<Wheat> wheatList = new LinkedList<>();

        for(int x = 0; x < 10000; x++) {
            for (int y = 0 ; y < 10000; y++){
                wheatList.add(actualField.scanWheatAtPosition(x,y));
            }
        }
        wheatList.sort();

        return wheatList;
    }
}
