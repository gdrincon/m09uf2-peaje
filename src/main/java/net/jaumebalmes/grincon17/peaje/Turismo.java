package net.jaumebalmes.grincon17.peaje;

public class Turismo extends Vehiculo{
    private int numRows;

    public Turismo(int numRows) {
        super();
        this.numRows = numRows;
    }

    public int getNumRows() {
        return numRows;
    }

    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }
}
