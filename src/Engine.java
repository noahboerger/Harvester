public class Engine implements IEngine {
    private String manufacturer;
    private boolean isOn;
    private int speed;
    private int highSpeed;

    public Engine(String manufacturer, int highSpeed) {
        this.manufacturer = manufacturer;
        isOn = false;
        speed = 0;
        this.highSpeed = highSpeed;
    }

    @Override
    public void start() {
        isOn = true;
    }

    @Override
    public void stop() {
        isOn = false;
        speed = 0;
    }

    @Override
    public boolean faster() {
        if (isOn && (speed < highSpeed)) {
            speed++;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean slower() {
        if (isOn && (speed > -highSpeed)) {
            speed--;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getManufacturer() {
        return manufacturer;
    }
}
