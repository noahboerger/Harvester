import java.util.LinkedList;

public class Harvester implements IHarvester {

    private IEngine engine;
    private IDrone drone;

    private Cutting cuttingLeft;
    private Cutting cuttingInnerLeft;
    private Cutting cuttingInnerRight;
    private Cutting cuttingRight;

    private ILight leftFrontTurnSignal;
    private ILight rightFrontTurnSignal;
    private ILight leftRearTurnSignal;
    private ILight rightRearTurnSignal;

    private ILight leftBrakeLight;
    private ILight rightBrakeLight;

    private ILight reversingLight;

    private ILight leftFrontLight;
    private ILight rightFrontLight;

    private ILight leftBeam;
    private ILight rightBeam;

    private ILight leftBackLight;
    private ILight rightBackLight;


    private BordComputer bordcomputer;


    public Harvester() {
        engine = new Engine("BMW", 5);
        drone = new Drone();

        cuttingLeft = new Cutting();
        cuttingInnerLeft = new Cutting();
        cuttingInnerRight = new Cutting();
        cuttingRight = new Cutting();

        leftFrontTurnSignal = new Light(LightType.TURN_SIGNAL);
        rightFrontTurnSignal = new Light(LightType.TURN_SIGNAL);
        leftRearTurnSignal = new Light(LightType.TURN_SIGNAL);
        rightRearTurnSignal = new Light(LightType.TURN_SIGNAL);

        leftBrakeLight = new Light(LightType.BRAKE_LIGHT);
        rightBrakeLight = new Light(LightType.BRAKE_LIGHT);

        reversingLight = new Light(LightType.REVERSING_LIGHT);

        leftFrontLight = new Light(LightType.FRONT_LIGHT);
        rightFrontLight = new Light(LightType.FRONT_LIGHT);

        leftBeam = new Light(LightType.HIGH_BEAM);
        rightBeam = new Light(LightType.HIGH_BEAM);

        leftBackLight = new Light(LightType.BACK_LIGHT);
        rightBackLight = new Light(LightType.BACK_LIGHT);
    }

    @Override
    public void turnLeft() {
        this.leftFrontTurnSignal.turnOn();
        this.leftRearTurnSignal.turnOn();
        leftRearTurnSignal.turnOff();
        leftFrontTurnSignal.turnOff();
    }

    @Override
    public void turnRight() {
        rightFrontTurnSignal.turnOn();
        rightRearTurnSignal.turnOn();
        rightRearTurnSignal.turnOff();
        rightFrontTurnSignal.turnOff();
    }

    @Override
    public void startHarvesting(LinkedList<ScannedWheat> wheatList) {
        engine.start();
        bordcomputer = new BordComputer(wheatList);
        bordcomputer.getScannedWheatAtPos(new Position(1,2));
        engine.faster();
        engine.slower();

    }

    @Override
    public void endHarvesting() {
        engine.stop();
    }

    @Override
    public LinkedList<ScannedWheat> sendDrone(IField field) {
        drone.setActualField(field);
        return drone.scanField();
    }


}
