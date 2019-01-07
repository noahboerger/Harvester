import java.util.LinkedList;

public interface IDrone {
    LinkedList<Wheat> scanField();
    void setActualField (Field field);
}
