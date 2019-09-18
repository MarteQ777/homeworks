package olimpicData;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class OlimpicsDataWriter {

        public void safe2File(final String path, List<OlimpicsData> olimpicsData) throws IOException {
        BufferedWriter bufferedWriter = null;
            try {
                bufferedWriter = new BufferedWriter(new FileWriter(path));
                bufferedWriter.write(buildingStringWithStatistics(olimpicsData));

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (bufferedWriter != null){
                    bufferedWriter.close();
                }
            }
        }
        public String buildingStringWithStatistics(List<OlimpicsData> olimpicsData){
            OlimpicDataStatistics olimpicDataStatistics = new OlimpicDataStatistics();

            final StringBuilder sb = new StringBuilder();

           String string2File = sb
                   .append("Countries with at least one gold medal " + olimpicDataStatistics.findAllCountriesWithAtLeastOneGoldMedal(olimpicsData))
                   .append("\n")
                   .append("Countries with at least one medal of any kind " + olimpicDataStatistics.findAllCountriesWithAtLeastOneMedalOfAnyKind(olimpicsData))
                   .append("\n")
                   .append("Country that won most gold medals " + olimpicDataStatistics.findCountryWithMostGoldMedals(olimpicsData))
                   .append("\n")
                   .append("Countries that won most medals of any kind " + olimpicDataStatistics.findAllCountriesWithAtLeastOneGoldMedal(olimpicsData))
                   .append("\n")
                   .append("Countries with at least one gold medal" + olimpicDataStatistics.properCountryWithMostMedals(olimpicsData))
                   .append("\n")
                   .append("Country with most 4th places" + olimpicDataStatistics.findCountryWithMost4thPlaces(olimpicsData))
                   .append("\n")
                   .append("Countries with more silver than gold medals" + olimpicDataStatistics.countriesWithMoreSilverMedalsThanGoldMedals(olimpicsData))
                   .append("\n")
                   .append("Countries with more bronze than silver medals and more silver than gold" + olimpicDataStatistics.countriesWithMoreBronzeThanSilverAndMoreSilverThanGold(olimpicsData))
                   .append("\n")
                   .append("List of countries that won most silver medals reverse sorted " + olimpicDataStatistics.reverseSortedListOfCountriesWithSilverMedals(olimpicsData))
                   .append("\n")
                   .append("Countries with most amount of points " + olimpicDataStatistics.findCountryWithMostAmountOfPoints(olimpicsData))
                   .append("\n")
                   .toString();
           return string2File;
        }
}
