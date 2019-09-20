package net.jaumebalmes.grincon17.peaje;

public class Camion extends Vehiculo {
    private double weight;

    public Camion(double weight) {
        super();
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


}
