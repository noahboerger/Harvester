import java.util.Random;

public class Wheat {
    private int numberOfGrain;

    public Wheat() {
        numberOfGrain = getRandomNumberOfGrain();
    }

    public int getNumberOfGrain() {
        return numberOfGrain;
    }

    private int getRandomNumberOfGrain() {
        Random random = new Random();
        int randomInt = random.nextInt();
        randomInt = (randomInt % 401) + 100;
        return randomInt;
    }
}
