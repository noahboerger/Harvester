public class ScannedWheat {
    Position position;

    private Wheat wheat;

    public ScannedWheat(Position position, Wheat wheat) {
        this.position = position;
        this.wheat = wheat;
    }

    public Position getPosition() {
        return position;
    }

    public Wheat getWheat() {
        return wheat;
    }

    @Override
    public String toString() {
        return wheat + " Position: " + position;
    }
}
