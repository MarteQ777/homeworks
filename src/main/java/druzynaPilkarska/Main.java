package druzynaPilkarska;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        DruzynaPilkarska druzynaPilkarska1 = new DruzynaPilkarska("ZPogoń", 22, 5, 4, 4, 12, 13);
        DruzynaPilkarska druzynaPilkarska2 = new DruzynaPilkarska("Legia", 22, 5, 3, 5, 13, 43);
        DruzynaPilkarska druzynaPilkarska3 = new DruzynaPilkarska("Arka", 22, 5, 3, 2, 2, 13);
        DruzynaPilkarska druzynaPilkarska4 = new DruzynaPilkarska("Wisła", 22, 2, 3, 7, 12, 13);
        DruzynaPilkarska druzynaPilkarska5 = new DruzynaPilkarska("Lechia", 16, 5, 3, 2, 12, 22);

        List<DruzynaPilkarska> tabela = new ArrayList<>();
        tabela.add(druzynaPilkarska1);
        tabela.add(druzynaPilkarska2);
        tabela.add(druzynaPilkarska3);
        tabela.add(druzynaPilkarska4);
        tabela.add(druzynaPilkarska5);

        List<DruzynaPilkarska> posortowane = tabela.stream()
                .sorted(Comparator.comparing(DruzynaPilkarska::getLiczbaPunktow, Comparator.reverseOrder())
                        .thenComparing(DruzynaPilkarska::getStrzelone, Comparator.reverseOrder())
                        .thenComparing(DruzynaPilkarska::getStracone)
                        .thenComparing(DruzynaPilkarska::getNazwa))
                .collect(Collectors.toList());

        for (DruzynaPilkarska druzynaPilkarska : posortowane
        ) {
            System.out.println(druzynaPilkarska);


        }


    }
}