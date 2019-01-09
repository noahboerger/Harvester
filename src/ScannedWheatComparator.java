import java.util.Comparator;

public class ScannedWheatComparator implements Comparator<ScannedWheat> {

    @Override
    public int compare(ScannedWheat scannedWheat1, ScannedWheat scannedWheat2) {
        if (scannedWheat1.getWheat().getNumberOfGrain() != scannedWheat2.getWheat().getNumberOfGrain()) {
            return scannedWheat2.getWheat().getNumberOfGrain() - scannedWheat1.getWheat().getNumberOfGrain();
        } else if (scannedWheat1.getPosition().getX() != scannedWheat2.getPosition().getX()) {
            return scannedWheat2.getPosition().getX() - scannedWheat1.getPosition().getX();
        } else if (scannedWheat1.getPosition().getY() != scannedWheat2.getPosition().getY()) {
            return scannedWheat2.getPosition().getY() - scannedWheat1.getPosition().getY();
        } else {
            return 0;
        }
    }
}
