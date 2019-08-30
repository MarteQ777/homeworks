package obywatel;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RejestrObywateli {

    private Map<String, Obywatel> mapaObywateli = new HashMap();

    public void dodajObywatela(String pesel, String imie, String nazwisko) {
        this.mapaObywateli.put(pesel, new Obywatel(pesel, imie, nazwisko));
    }

    public List<Obywatel> znajdzObywatelaPoNazwisku(String nazwisko) {
        List<Obywatel> przefiltrowaniPoNazwisku = mapaObywateli.values()
                .stream()
                .filter(obywatel -> obywatel.getNazwisko().equalsIgnoreCase(nazwisko))
                .collect(Collectors.toList());
        for (Obywatel obywatel: przefiltrowaniPoNazwisku
             ) {
            System.out.println(obywatel);

        }

        return przefiltrowaniPoNazwisku;
    }

    public List<Obywatel> znajdzObywatelaPoPesel(String pesel) {
        List<Obywatel> znalezionyPoPesel = mapaObywateli.values()
                .stream()
                .filter(obywatel -> obywatel.getPesel().equals(pesel))
                .collect(Collectors.toList());
        return znalezionyPoPesel;
    }

    public List<Obywatel> znajdzObywateliUrodzonychPrzed(int rok) {
        int krotkirok = rok / 100;
        int pierwszeDwieCyfryRoku;
        int trzeciaCyfraRoku;
        List<Obywatel> wszyscyobywatele = mapaObywateli.values()
                .stream()
                .collect(Collectors.toList());
        for (Obywatel obywatel: wszyscyobywatele) {

            pierwszeDwieCyfryRoku = Integer.parseInt(obywatel.getPesel().substring(0,2));
           // System.out.println(pierwszeDwieCyfryRoku);
            trzeciaCyfraRoku = Integer.parseInt(obywatel.getPesel().substring(2,3));
            if (pierwszeDwieCyfryRoku>9 && trzeciaCyfraRoku<2){
                System.out.println(obywatel);
            }
        }

        return wszyscyobywatele;

    }
}

