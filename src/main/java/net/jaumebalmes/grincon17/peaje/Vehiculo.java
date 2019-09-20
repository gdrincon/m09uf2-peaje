package net.jaumebalmes.grincon17.peaje;

public class Vehiculo {
    private double speed;
    private int numAxis;
    private int numWheels;

    public Vehiculo(){

    }
    public Vehiculo(double speed, int numAxis, int numWheels) {
        this.speed = speed;
        this.numAxis = numAxis;
        this.numWheels = numWheels;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getNumAxis() {
        return numAxis;
    }

    public void setNumAxis(int numAxis) {
        this.numAxis = numAxis;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }
}
