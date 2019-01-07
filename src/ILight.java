public interface ILight {
    void turnOn();

    void turnOff();

    boolean isOn();

    LightType getLightType();
}
