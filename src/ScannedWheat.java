public class ScannedWheat {
    Position position;

    private int numberOfGrain;

    public ScannedWheat(Position position, int numberOfGrain) {
        this.position = position;
        this.numberOfGrain = numberOfGrain;
    }

    public Position getPosition() {
        return position;
    }

    public int getNumberOfGrain() {
        return numberOfGrain;
    }
}
