package olimpicData;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OlimpicDataStatistics {

    public List<String> findAllCountriesWithAtLeastOneGoldMedal(List<OlimpicsData> olimpicsData) {
        return olimpicsData.stream()
                .filter(o1 -> o1.getGoldMedals() >= 1)
                .map(OlimpicsData::getCountryShortName)
                .collect(Collectors.toList());

    }

    public List<String> findAllCountriesWithAtLeastOneMedalOfAnyKind(final List<OlimpicsData> olimpicsData) {

        return olimpicsData.stream()
                .filter(olimpicsData1 -> olimpicsData1.getGoldMedals() >= 1 || olimpicsData1.getSilverMedals() >= 1 || olimpicsData1.getBronzeMedals() >= 1)
                .map(OlimpicsData::getCountryShortName)
                .collect(Collectors.toList());
    }


    public String findCountryWithMostGoldMedals(final List<OlimpicsData> olimpicsData) {
        return olimpicsData.stream()
                .sorted((olimpicsData1, olimpicsData2) -> (olimpicsData2.getGoldMedals() - olimpicsData1.getGoldMedals()))
                .findFirst()
                .get()
                .getCountryShortName();
    }

  public List<String> properCountryWithMostMedals(final List<OlimpicsData> olimpicData){
      return olimpicData.stream()
              .collect(Collectors.groupingBy(this::totalMedals))
              .entrySet().stream().max(Comparator.comparing(Map.Entry::getKey))
              .map(entry -> entry.getValue().stream().map(OlimpicsData::getCountryShortName)
                      .collect(Collectors.toList())).orElse(Collections.emptyList());
  }

    public String findCountryWithMost4thPlaces(final List<OlimpicsData> olimpicsData){
        return olimpicsData.stream()
                .sorted((o1, o2) -> o2.getFourthPlace() - o1.getFourthPlace())
                .findFirst()
                .get()
                .getCountryShortName();
    }


    public List<String> countriesWithMoreSilverMedalsThanGoldMedals(final List<OlimpicsData> olimpicsData) {
        return olimpicsData.stream()
                .filter(olimpicsData1 -> olimpicsData1.getSilverMedals() > olimpicsData1.getGoldMedals())
                .map(OlimpicsData::getCountryShortName)
                .collect(Collectors.toList());
    }

    public List<String> countriesWithMoreBronzeThanSilverAndMoreSilverThanGold(final List<OlimpicsData> olimpicsData) {
        return olimpicsData.stream()
                .filter(olimpicsData1 -> olimpicsData1.getBronzeMedals() > olimpicsData1.getSilverMedals())
                .filter(olimpicsData1 -> olimpicsData1.getSilverMedals() > olimpicsData1.getGoldMedals())
                .map(OlimpicsData::getCountryShortName)
                .collect(Collectors.toList());
    }

    public List<String> reverseSortedListOfCountriesWithSilverMedals(final List<OlimpicsData>olimpicsData){
        return olimpicsData.stream()
                .sorted((o1, o2) -> o2.getSilverMedals() - o1.getSilverMedals())
                .map(OlimpicsData::getCountryShortName)
                .collect(Collectors.toList());
    }
    public String findCountryWithMostAmountOfPoints(final List<OlimpicsData> olimpicsData){
       return olimpicsData.stream()
                .sorted((o1, o2) -> o2.getPointsFromMedals() - o1.getPointsFromMedals())
                .findFirst()
                .get()
                .getCountryShortName();
    }
    private int totalMedals(final OlimpicsData olimpicsData){
        return olimpicsData.getGoldMedals() + olimpicsData.getSilverMedals() + olimpicsData.getBronzeMedals();
    }






    }



