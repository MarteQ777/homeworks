package ofertaSprzedaży;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<OfertaSprzedaży> listaOfert = new ArrayList<>();

        listaOfert.add(new OfertaSprzedaży("Kurczak", 2.33));
        listaOfert.add(new OfertaSprzedaży("Grzyby", 3.42));
        listaOfert.add(new OfertaSprzedaży("Kołacz", 2.12));
        listaOfert.add(new OfertaSprzedaży("Paluszki rybne", 5.42));
        listaOfert.add(new OfertaSprzedaży("Banany", 3.87));


        listaOfert.sort(Comparator.comparingDouble(OfertaSprzedaży::getCena));
        for (OfertaSprzedaży ofertasprzedaży : listaOfert
        ) {
            System.out.println(ofertasprzedaży);
        }
        System.out.println("-----------------------------------------------------------");

        listaOfert.sort(Comparator.comparingDouble(OfertaSprzedaży::getCena).reversed());
        for (OfertaSprzedaży ofertasprzedaży : listaOfert
        ) {
            System.out.println(ofertasprzedaży);
        }
        System.out.println("_________________________________________");
        listaOfert.sort(Comparator.comparing(OfertaSprzedaży::getNazwaProduktu));
        for (OfertaSprzedaży ofertasprzedaży : listaOfert
        ) {
            System.out.println(ofertasprzedaży);
        }
        System.out.println("-----------------------------");
        listaOfert.sort(Comparator.comparing(OfertaSprzedaży::getNazwaProduktu).reversed());
        for (OfertaSprzedaży ofertasprzedaży : listaOfert
        ) {
            System.out.println(ofertasprzedaży);
        }
    }
}
