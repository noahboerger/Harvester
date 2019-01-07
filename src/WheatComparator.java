import java.util.Comparator;

public class WheatComparator implements Comparator<Wheat> {

    @Override
    public int compare(Wheat wheat1, Wheat wheat2) {
        if(wheat1.getNumberOfGrain() != wheat2.getNumberOfGrain()) {
            return wheat2.getNumberOfGrain() - wheat1.getNumberOfGrain();
        } else {
            return 0;
        }
    }
}
