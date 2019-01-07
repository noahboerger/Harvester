public interface IEngine {
    void start();

    void stop();

    boolean faster();

    boolean slower();

    String getManufacturer();
}
