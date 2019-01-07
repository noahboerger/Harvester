import java.util.Comparator;

public class ScannedWheatComparator implements Comparator<ScannedWheat> {

    @Override
    public int compare(ScannedWheat scannedWheat1, ScannedWheat scannedWheat2) {
        if (scannedWheat1.getNumberOfGrain() != scannedWheat2.getNumberOfGrain()) {
            return scannedWheat2.getNumberOfGrain() - scannedWheat1.getNumberOfGrain();
        } else if (scannedWheat1.getPosition().getX() != scannedWheat2.getPosition().getX()) {
            return scannedWheat2.getPosition().getX() - scannedWheat1.getPosition().getX();
        } else if (scannedWheat1.getPosition().getY() != scannedWheat2.getPosition().getY()) {
            return scannedWheat2.getPosition().getY() - scannedWheat1.getPosition().getY();
        } else {
            return 0;
        }
    }
}
