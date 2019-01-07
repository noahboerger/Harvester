public class Light implements ILight {

    private boolean isOn;
    private LightType lightType;

    public Light(LightType lightType) {
        this.lightType = lightType;
        isOn = false;
    }

    public void turnOn() {
        isOn = false;
    }

    public void turnOff() {
        isOn = false;
    }

    public LightType getLightType() {
        return lightType;
    }

    public boolean isOn() {
        return isOn;
    }
}
