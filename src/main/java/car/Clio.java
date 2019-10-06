package car;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;

@Slf4j
public class Clio implements Car {

    private String model;
    private int horsePower;
    private static final EngineType GASSOLINE_TURBO = EngineType.GASOLINE_TURBO;
    private boolean broken;

    public Clio(String model, int horsePower, boolean broken) {
        this.model = model;
        this.horsePower = horsePower;
        this.broken = broken;
    }

    public boolean getBroken() {
        return broken;
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
        return EngineType.GASOLINE_TURBO;
    }

    @Override
    public boolean isBroken() {
        if (broken) {
            log.warn(this.model + " Przy odpalaniu padł silnik");
            return broken;

        }
        broken = new Random().nextBoolean();
        if (broken) {
            System.out.println(this.getModel() + " No i dupa, przy odpalaniu padł silnik ");
            log.warn(this.model + " Przy odpalaniu padł silnik");
        } else {
            System.out.println(this.getModel() + " Swietnie, silnik wystartował");
            log.info(this.model + " Pojazd uruchomiony");
        }
        return broken;
    }

    public void setBroken(boolean broken) {
        this.broken = broken;
    }

    @Override
    public void startEngine() {
        System.out.println(this.getModel() + " Zapłon");
        isBroken();
    }

    @Override
    public void fixCar() {
        if (broken) {
            setBroken(false);
        }
    }
}