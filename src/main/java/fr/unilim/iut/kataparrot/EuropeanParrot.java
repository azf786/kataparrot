package fr.unilim.iut.kataparrot;

public class EuropeanParrot extends Parrot {
    public EuropeanParrot(ParrotTypeEnum _type, int numberOfCoconuts, double voltage, boolean isNailed) {
        super(_type, numberOfCoconuts, voltage, isNailed);
    }
    public EuropeanParrot(){
        super(ParrotTypeEnum.EUROPEAN, 0, 0, false);
    }

    @Override
    public double getSpeed() {
        return super.getBaseSpeed();
    }
}
