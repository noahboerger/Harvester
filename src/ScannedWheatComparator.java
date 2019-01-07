import java.util.Comparator;

public class ScannedWheatComparator implements Comparator<ScannedWheat> {

    @Override
    public int compare(ScannedWheat scannedWheat1, ScannedWheat scannedWheat2) {
        if (scannedWheat1.getNumberOfGrain() != scannedWheat2.getNumberOfGrain()) {
            return scannedWheat2.getNumberOfGrain() - scannedWheat1.getNumberOfGrain();
        } else if (scannedWheat1.getxPos() != scannedWheat2.getxPos()) {
            return scannedWheat2.getxPos() - scannedWheat1.getxPos();
        } else if (scannedWheat1.getyPos() != scannedWheat2.getyPos()) {
            return scannedWheat2.getyPos() - scannedWheat1.getyPos();
        } else {
            return 0;
        }
    }
}
