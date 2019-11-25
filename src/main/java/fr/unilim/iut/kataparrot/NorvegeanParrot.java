package fr.unilim.iut.kataparrot;

public class NorvegeanParrot extends Parrot{
    public static final double VALEUR_MINIMALE = 24.0;
    private double voltage;


    public NorvegeanParrot(double voltage) {
        this.voltage = voltage;
    }

    @Override
    public double getSpeed() {
        return getBaseSpeed(voltage);
    }

    private double getBaseSpeed(double voltage) {
        return Math.min(VALEUR_MINIMALE, voltage * BASE_SPEED);
    }
}

