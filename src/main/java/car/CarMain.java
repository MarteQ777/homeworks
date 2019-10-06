package car;



public class CarMain {
    public static void main(String[] args) {
        final Car audi = new Audi("SQ7", 450,false);
        final Car corolla = new Corolla("Corolla", 170, false);
        final Car clio = new Clio("Clio", 225, false);

        final ParkingLot<Car> parkingLot = new ParkingLot<>();
        final Mechanic mechanic = new Mechanic("Gilbertus", "Albans");


        parkingLot.parkCar(audi);
        parkingLot.parkCar(clio);
        parkingLot.parkCar(corolla);

        audi.startEngine();
        clio.startEngine();
        corolla.startEngine();

        parkingLot.removeBrokenCars2(mechanic);

    }
}
