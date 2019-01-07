import java.util.LinkedList;

public interface IDrone {
    LinkedList<ScannedWheat> scanField();
    void setActualField (Field field);
}
