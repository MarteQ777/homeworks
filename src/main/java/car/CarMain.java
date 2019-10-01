package car;

public class CarMain {
    public static void main(String[] args) {
        final Car audi = new Audi("SQ7", 450,false);
        final Car corolla = new Corolla("Corolla", 170);
        final Car clio = new Clio("Clio", 225, false);

        final ParkingLot<Car> parkingLot = new ParkingLot<>();

        audi.startEngine();
        clio.startEngine();
        corolla.startEngine();

        parkingLot.parkCar(audi);
        parkingLot.parkCar(clio);
        parkingLot.parkCar(corolla);

        parkingLot.removeBrokenCars();
  //     audi.startEngine();
  //     System.out.println(audi.getEngineType());
  //     clio.startEngine();
  //     System.out.println(clio.getEngineType());
  //    corolla.startEngine();
  //      System.out.println(corolla.getEngineType());
  //    corolla.startEngine();
  //    corolla.startEngine();
    }
}
