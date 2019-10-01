package car;


import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;


public class ParkingLot<T extends Car> {

    private Logger logger;
    private List<T> parkedCars = new ArrayList<>();

    ParkingLot() {

    }

    public void parkCar(final T car) {
        parkedCars.add(car);
    }

    public void removeBrokenCars() {
        final int carsBeforeRomoval = parkedCars.size();
        parkedCars = parkedCars.stream()
                .filter(car -> !car.isBroken())
                .collect(Collectors.toList());
        final int carsAfterRemoval = carsBeforeRomoval - parkedCars.size();
        System.out.println("Number of cars removed " + carsAfterRemoval);
        // logger.info("Number of cars removed" + carsAfterRemoval);
    }

}
