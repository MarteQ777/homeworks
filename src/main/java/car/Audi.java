package car;

import java.util.Random;

public class Audi implements Car {

    private String model;
    private int horsePower;
    private static final EngineType DIESEL = EngineType.DIESEL;
    private boolean broken;

    public Audi(String model, int horsePower, boolean broken) {
        this.model = model;
        this.horsePower = horsePower;
        this.broken = broken;
    }


    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getHorsePower() {
        return horsePower;
    }

    @Override
    public EngineType getEngineType() {
        return EngineType.DIESEL;
    }

    @Override
    public boolean isBroken() {
        if (broken) {
            return broken;
        }
        broken = new Random().nextBoolean();
        return broken;
    }


    @Override
    public void startEngine() {
        System.out.println("Ignition");
        isBroken();
        if (broken) {
            System.out.println("Engine`s dead. Do not try to start it again. Tow car or call mechanic");
        } else {
            System.out.println("Engine is on");

        }

    }
}
