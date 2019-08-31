package zadania_streamy_generyki;

import java.io.IOException;
import java.util.List;

public class OlimpicsMain {

    public static void main(String[] args) throws IOException {

    final String filePath = args[0]; // żeby plik był argumentem wejścia do programu - klikasz powyżej w nazwę pliku przy młotku
                                        // klikasz edit configuration i w program arguments dodajesz ścieżkę + nazwa pliku \

    final OlimpicsDataService olimpicsDataService = new OlimpicsDataService();

    //final List<OlimpicsData> olimpicsDataList = olimpicsDataService.processDataFromFile(filePath);

    final OlimpicDataStatistics countriesWithAtLeastOneGoldMedal = new OlimpicDataStatistics();


   // countriesWithAtLeastOneGoldMedal.findAllCountriesWithAtLeastOneGoldMedal(olimpicsDataList)
   //         .forEach(System.out::println);


    }

    }


