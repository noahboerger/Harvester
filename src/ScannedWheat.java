public class ScannedWheat {
    private int xPos;
    private int yPos;

    private int numberOfGrain;

    public ScannedWheat(int xPos, int yPos, int numberOfGrain) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.numberOfGrain = numberOfGrain;
    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public int getNumberOfGrain() {
        return numberOfGrain;
    }
}
