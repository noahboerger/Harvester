public class Cutting implements ICutting {
    private boolean isOn;

    public Cutting() {
        isOn = false;
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void setOn(boolean on) {
        isOn = on;
    }
}
