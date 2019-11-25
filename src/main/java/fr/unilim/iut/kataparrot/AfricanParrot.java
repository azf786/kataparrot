package fr.unilim.iut.kataparrot;



public class AfricanParrot extends Parrot {

    public static final double LOAD_FACTOR = 9.0;
    public static final int VALEUR_MINIMALE = 0;
    protected int numberOfCoconuts = 0;

    public AfricanParrot(int numberOfCoconuts) {
        this.numberOfCoconuts = numberOfCoconuts;
    }
    @Override
    public double getSpeed() {
        return Math.max(VALEUR_MINIMALE, BASE_SPEED - LOAD_FACTOR * numberOfCoconuts);
    }

}
