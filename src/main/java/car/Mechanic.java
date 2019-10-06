package car;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;

@Slf4j
public class Mechanic {

    final private String imie;
    final private String nazwisko;

    public Mechanic(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void tryFixCar(Car car) {
        if (car.getBroken() == true) {
            System.out.println(car.getModel() + " Wezwano mechanika " + imie + " " + nazwisko);
            log.info(this.imie + " " + this.nazwisko + " został wezwany do próby naprawy pojazdu " + car.getModel());
            boolean napraw = new Random().nextBoolean();
            if (napraw == true) {
                car.fixCar();
                System.out.println("Mechanik " + imie + " " + nazwisko + " Droga Pani naprawiłem Pani " + car.getModel() + " , można śmiało jechac w podróż");
                log.info(car.getModel() + " został naprawiony przez mechanika " + this.imie + this.nazwisko);
            } else {
                System.out.println("Mechanik " + imie + " " +  nazwisko + " No nie udało mi się kochaniutka, pani " + car.getModel() + " , trzeba odcholować z parkingu");
                log.warn(car.getModel() + " nie został naprawiony przez " + this.imie +" "+ this.nazwisko + ". Pojazd wymaga odcholowania.");
            }

        }
    }
}


