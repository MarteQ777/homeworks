package kalkulatorjednazmienna;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        double liczba = 0;
        boolean czynny = false;
        while (!czynny) {

            System.out.println("Wprowadź działanie i liczbę");
            System.out.println("Dostępne operacje: dodawanie, odejmowanie, mnozenie, dzielenie, wyczysc 0");

            Scanner scanner = new Scanner(System.in);
            String polecenie = scanner.nextLine();

            String[] parts = polecenie.split(" ");
            String part1 = parts[0];
            String part2 = parts[1];

            int liczbaOperacyjna = Integer.parseInt(part2);

            switch (part1) {
                case "dodawanie":
                    liczba = liczba + liczbaOperacyjna;
                    System.out.println(liczba);
                    break;
                case "odejmowanie":
                    liczba = liczba - liczbaOperacyjna;
                    System.out.println(liczba);
                    break;
                case "mnozenie":
                    liczba = liczba * liczbaOperacyjna;
                    System.out.println(liczba);
                    break;
                case "dzielenie":
                    liczba = liczba / liczbaOperacyjna;
                    System.out.println(liczba);
                    break;
                case "wyczysc":
                    liczba = 0;
                    System.out.println("Licznik wyzerowany");
                    break;

                default:
                    czynny = true;
                    break;
            }

        }


    }
}
