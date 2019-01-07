public class Engine {
    private String manufacturer;
    private boolean isOn;
    private int speed;
    private int highspeed;



    public void start() {
        isOn = true;
    }

    public void stop() {
        isOn = false;
        speed = 0;
    }

    public boolean faster() {

        if(isOn && (speed < highspeed)) {
            speed++;
            return true;
        } else {
            return false;
        }
    }

    public boolean slower() {
        if(isOn && (speed > -highspeed)) {
            speed--;
            return true;
        } else {
            return false;
        }
    }

}
