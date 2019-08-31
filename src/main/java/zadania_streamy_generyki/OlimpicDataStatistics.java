package zadania_streamy_generyki;

import java.util.List;
import java.util.stream.Collectors;

public class OlimpicDataStatistics {

    public List<String> findAllCountriesWithAtLeastOneGoldMedal(List<OlimpicsData> olimpicsData) {
      return   olimpicsData.stream()
                .filter(o1 -> o1.getGoldMedals() >= 1)
              .map(OlimpicsData::getCountryShortName)
                .collect(Collectors.toList());

    }
}

