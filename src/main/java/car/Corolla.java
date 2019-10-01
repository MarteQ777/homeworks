package car;

import java.util.Random;

public class Corolla implements Car {

    private String model;
    private int horsePower;
    private static final EngineType GASSOLINE_NATURALLY_ASPIRATED = EngineType.GASOLINE_NATURRALY_ASPIRATED;
    private boolean broken = false;

    public Corolla(String model, int horsePower) {
        this.model = model;
        this.horsePower = horsePower;

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
        return EngineType.GASOLINE_NATURRALY_ASPIRATED;
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
        if (broken) {
            System.out.println("Engine is broken. You need to tow away car or call mechanic");
        } else {
            isBroken();
            if (broken) {
                System.out.println("Engine`s dead. Do not try to start it again. Tow car or call mechanic");
            } else {
                System.out.println("Engine is on");

            }

        }
    }
}

