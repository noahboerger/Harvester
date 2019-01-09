import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class Harvester implements IHarvester {

    boolean isRunning;

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


    private BordComputer bordComputer;


    public Harvester() {
        engine = new Engine("BMW", 5);
        drone = new Drone();
        bordComputer = new BordComputer();

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
        if (isRunning) {
            this.leftFrontTurnSignal.turnOn();
            this.leftRearTurnSignal.turnOn();
            leftRearTurnSignal.turnOff();
            leftFrontTurnSignal.turnOff();
        }
    }

    @Override
    public void turnRight() {
        if (isRunning) {
            rightFrontTurnSignal.turnOn();
            rightRearTurnSignal.turnOn();
            rightRearTurnSignal.turnOff();
            rightFrontTurnSignal.turnOff();
        }
    }

    @Override
    public void startHarvester() {
        engine.start();
        rightFrontLight.turnOn();
        leftFrontLight.turnOn();
        rightBackLight.turnOn();
        leftBackLight.turnOn();
        engine.faster();
        isRunning = true;
    }

    @Override
    public void stopHarvester() {
        endHarvesting();
        leftBrakeLight.turnOn();
        rightBrakeLight.turnOn();
        engine.stop();
        rightFrontLight.turnOff();
        leftFrontLight.turnOff();
        rightBackLight.turnOff();
        leftBackLight.turnOff();
        leftBrakeLight.turnOff();
        isRunning = false;
    }

    @Override
    public void startHarvesting() {
        if (isRunning) {
            rightBeam.turnOn();
            leftBeam.turnOn();
            cuttingLeft.setOn(true);
            cuttingInnerLeft.setOn(true);
            cuttingInnerRight.setOn(true);
            cuttingRight.setOn(true);
        }
    }

    @Override
    public void endHarvesting() {
        if (isRunning) {
            rightBeam.turnOff();
            leftBeam.turnOff();
            cuttingLeft.setOn(false);
            cuttingInnerLeft.setOn(false);
            cuttingInnerRight.setOn(false);
            cuttingRight.setOn(false);
        }
    }

    @Override
    public List<ScannedWheat> sendDrone(IField field) {
        if(isRunning) {
            List<ScannedWheat> scannedWheatList = drone.scanField(field);
            bordComputer.setScannedWheatList(scannedWheatList);
            return scannedWheatList;
        }else {
            return null;
        }
    }

    @Override
    public Wheat getWheatAt(Position position) {
        if(isRunning) {
            return bordComputer.getScannedWheatAt(position).getWheat();
        } else {
            return null;
        }
    }

    @Override
    public TreeSet<ScannedWheat> getScannedWheatSet() {
        return bordComputer.getScannedWheatSet();
    }
}
