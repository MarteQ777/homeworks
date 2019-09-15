package olimpicData;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OlimpicDataStatistics {

    public List<String> findAllCountriesWithAtLeastOneGoldMedal(List<OlimpicsData> olimpicsData) {
        return olimpicsData.stream()
                .filter(o1 -> o1.getGoldMedals() >= 1)
                .map(OlimpicsData::getCountryShortName)
                .collect(Collectors.toList());

    }

    public List<String> findAllCountriesWithAtLeastOneMedalOfAnyKind(List<OlimpicsData> olimpicsData) {

        return olimpicsData.stream()
                .filter(olimpicsData1 -> olimpicsData1.getGoldMedals() >= 1 || olimpicsData1.getSilverMedals() >= 1 || olimpicsData1.getBronzeMedals() >= 1)
                .map(OlimpicsData::getCountryShortName)
                .collect(Collectors.toList());
    }


    public String findCountryWithMostGoldMedals(List<OlimpicsData> olimpicsData) {
        return olimpicsData.stream()
                .sorted((olimpicsData1, olimpicsData2) -> (olimpicsData2.getGoldMedals() - olimpicsData1.getGoldMedals()))
                .findFirst()
                .get()
                .getCountryShortName();
    }
    public String findCountryWithMostMedalsInTotal(List<OlimpicsData> olimpicData){
        return olimpicData.stream()
                .sorted((o1, o2) -> o2.getSilverMedals() + o2.getBronzeMedals() + o2.getGoldMedals() - o1.getSilverMedals() + o1.getGoldMedals() + o1.getBronzeMedals())
                .findFirst()
                .get()
                .getCountryShortName();
    }


    public List<String> countriesWithMoreSilverMedalsThanGoldMedals(List<OlimpicsData> olimpicsData) {
        return olimpicsData.stream()
                .filter(olimpicsData1 -> olimpicsData1.getSilverMedals() > olimpicsData1.getGoldMedals())
                .map(OlimpicsData::getCountryShortName)
                .collect(Collectors.toList());
    }

    public List<String> countriesWithMoreBronzeThanSilverAndMoreSilverThanGold(List<OlimpicsData> olimpicsData) {
        return olimpicsData.stream()
                .filter(olimpicsData1 -> olimpicsData1.getBronzeMedals() > olimpicsData1.getSilverMedals())
                .filter(olimpicsData1 -> olimpicsData1.getSilverMedals() > olimpicsData1.getGoldMedals())
                .map(OlimpicsData::getCountryShortName)
                .collect(Collectors.toList());
    }

  // public List<Integer> reverseSortedListOfCountriesWithSilverMedals(List<OlimpicsData> olimpicsData) {
  //     return olimpicsData.stream()
  //             .filter(olimpicsData1 -> olimpicsData1)
  //             .sorted(Comparator.reverseOrder())
  //
  //             .collect(Collectors.toList()); // tu mi zwraca posortowane ilości zamiast nazwy krajów
  // }

    public int totalAmountOfMedals(List<OlimpicsData> olimpicsData) {
        return olimpicsData.stream()
                .collect(Collectors.summingInt(olimpicsData1 -> olimpicsData1.getGoldMedals() + olimpicsData1.getSilverMedals() + olimpicsData1.getBronzeMedals()));


    }

}

