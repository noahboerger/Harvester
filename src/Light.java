public class Light implements ILight {

    private boolean isOn;
    private LightType lightType;

    public Light(LightType lightType) {
        this.lightType = lightType;
        isOn = false;
    }

    @Override
    public void turnOn() {
        isOn = false;
    }

    @Override
    public void turnOff() {
        isOn = false;
    }

    @Override
    public LightType getLightType() {
        return lightType;
    }

    @Override
    public boolean isOn() {
        return isOn;
    }
}
