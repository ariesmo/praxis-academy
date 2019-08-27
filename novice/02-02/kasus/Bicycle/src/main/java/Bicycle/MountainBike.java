package Bicycle;

class Bicycle {
    public int cadence;
    public int gear;
    public int speed;

    public Bicycle(int startCadence, int startSpeed, int startGear ) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }

    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public int getCadence() {
        return cadence;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void applyBrake(int decrement){
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }
}

public class MountainBike extends Bicycle {
    public int seatHeight;

    public MountainBike(int startHeight, int startCadence, int startSpeed, int startGear){
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    public static void main(String[] args) {
        MountainBike mount = new MountainBike(0, 10, 20, 30);
        System.out.println("Height : " + mount.seatHeight);
        System.out.println("Cadence : " + mount.cadence);
        System.out.println("Speed : " + mount.speed);
        System.out.println("Gear : " + mount.gear);
    }
}