package MVCBicycle;

public class BicycleController {
    private Bicycle model;
    private BicycleView view;

    public BicycleController(Bicycle model, BicycleView view) {
        this.model = model;
        this.view = view;
    }

    public void setCadence(int cadence) {
        model.setCadence(cadence);
    }

    public int getCadence() {
        return model.getCadence();
    }

    public void setGear(int gear) {
        model.setGear(gear);
    }

    public int getGear() {
        return model.getGear();
    }

    public void setSpeed(int speed) {
        model.setSpeed(speed);
    }

    public int getSpeed() {
        return model.getSpeed();
    }

    public void updateView() {
        view.printBicycleDetails(model.getCadence(), model.getGear(), model.getSpeed());
    }
}