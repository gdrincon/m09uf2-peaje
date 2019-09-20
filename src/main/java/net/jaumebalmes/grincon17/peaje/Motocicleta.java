package net.jaumebalmes.grincon17.peaje;

public class Motocicleta extends Vehiculo{
    private boolean copilot;

    public Motocicleta(boolean copilot) {
        super();
        this.copilot = copilot;
    }

    public boolean isCopilot() {
        return copilot;
    }

    public void setCopilot(boolean copilot) {
        this.copilot = copilot;
    }
}
