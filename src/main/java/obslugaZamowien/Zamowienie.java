package obslugaZamowien;

import java.util.Scanner;

public class Zamowienie {
    Pozycja[] pozycje;
    private int maxRozmiar;

    public Zamowienie(int maxRozmiar) {
        this.maxRozmiar = maxRozmiar;
    }

    public Zamowienie() {
        maxRozmiar = 10;
    }

    public static void main(String[] args) {

        System.out.println("Do zapłaty " + obliczWartosc(dodajPozycje()));
    }

    public static int ileRzeczyKupujesz() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile rzeczy kupujesz?");
        int iloscRzeczy;
        iloscRzeczy = scanner.nextInt();
        while (iloscRzeczy > 10) {
            System.out.println("Za dużo, maksymalnie 10 rzeczy na raz.");
            iloscRzeczy = scanner.nextInt();
        }
        return iloscRzeczy;

    }

    public static Pozycja[] dodajPozycje(){


        int iloscPozycji = ileRzeczyKupujesz();
        Scanner scanner = new Scanner(System.in);

        String nazwaTowaru;
        double iloscSztuk;
        double cenaSztuki;

        Pozycja[] listaPozycji = new Pozycja[iloscPozycji];

        for (int i = 0; i < iloscPozycji; i++) {

            System.out.println("Podaj pozycję");

            nazwaTowaru = scanner.next();

            System.out.println("Ile sztuk?");
            iloscSztuk = scanner.nextDouble();
            while (iloscSztuk>100){
                System.out.println("Nie mam takiej ilości tego towaru. Proszę podać mniejszą ilość");
                iloscSztuk = scanner.nextDouble();
            }

            System.out.println("Podaj cenę");
            cenaSztuki = scanner.nextDouble();

            listaPozycji[i] = new Pozycja(nazwaTowaru, iloscSztuk, cenaSztuki);
            System.out.println("Zapisałem, poprawnie");
        }

        return listaPozycji;
    }

    public static double obliczWartosc(Pozycja[] listaPozycji) {
        double kwotaLacznie = 0;

        System.out.println("Zamówienie");

        for (int i = 0; i < listaPozycji.length; i++) {
            System.out.println(listaPozycji[i].toString());
            kwotaLacznie = kwotaLacznie + listaPozycji[i].obliczWarosc();


        }
        return kwotaLacznie;

    }
}
