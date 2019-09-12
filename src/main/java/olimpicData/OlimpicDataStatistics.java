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
        //do zrobienia
        return null;

    }
 //  public int findCountryWithMostGoldMedals(List<OlimpicsData> olimpicsData) {
 //      return olimpicsData.stream()
 //            .

// }
    public List<String> countriesWithMoreSilverMedalsThanGoldMedals (List<OlimpicsData> olimpicsData){
       return olimpicsData.stream()
                .filter(olimpicsData1 -> olimpicsData1.getSilverMedals()>olimpicsData1.getGoldMedals())
                .map(OlimpicsData::getCountryShortName)
                .collect(Collectors.toList());
    }

    public List<String> countriesWithMoreBronzeThanSilverAndMoreSilverThanGold (List<OlimpicsData> olimpicsData){
        return olimpicsData.stream()
                .filter(olimpicsData1 -> olimpicsData1.getBronzeMedals()>olimpicsData1.getSilverMedals())
                .filter(olimpicsData1 -> olimpicsData1.getSilverMedals()>olimpicsData1.getGoldMedals())
                .map(OlimpicsData::getCountryShortName)
                .collect(Collectors.toList());
    }
    public List<Integer> reverseSortedListOfCountriesWithSilverMedals (List<OlimpicsData> olimpicsData){
       return olimpicsData.stream()
                .map(OlimpicsData::getSilverMedals)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList()); // tu mi zwraca posortowane ilości zamiast nazwy krajów
    }
    public Long totalAmountOfMedals (List<OlimpicsData> olimpicsData){
        final long count = olimpicsData.stream()
                .map(OlimpicsData::getGoldMedals).count();
        return count;

    }

}

