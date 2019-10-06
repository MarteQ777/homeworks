package car;


import lombok.Data;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;


import javax.print.attribute.standard.DateTimeAtCreation;
import java.sql.Date;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Slf4j
public class ParkingLot<T extends Car> {

    private List<T> parkedCars = new ArrayList<>();

    public ParkingLot() {

    }

    public List<T> getParkedCars() {
        return parkedCars;
    }


    public void parkCar(final T car)
    {
        parkedCars.add(car);
    }
    public void removeBrokenCars() {
        final int carsBeforeRomoval = parkedCars.size();
        System.out.println("Wszystkich pojazdów zaparkowanych jest: " + parkedCars.size());

        parkedCars = parkedCars.stream()
                .filter(car -> !car.getBroken())
                .collect(Collectors.toList());
        final int carsAfterRemoval = carsBeforeRomoval - parkedCars.size();
        System.out.println("Laweta musiała zabrać z parkingu " + carsAfterRemoval);
        log.warn("Ilość pojazdów zepsutych, nie naprawionych i przez to odholowanych " + carsAfterRemoval);


    }
    public void removeBrokenCars2(final Mechanic mechanic){
        parkedCars.stream()
                .filter(car -> car.getBroken())
                .forEach(mechanic::tryFixCar);
        removeBrokenCars();
    }
}
