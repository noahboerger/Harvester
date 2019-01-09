import java.util.LinkedList;

public interface IDrone {
    LinkedList<ScannedWheat> scanField(IField field);;
}
