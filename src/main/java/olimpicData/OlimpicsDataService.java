package olimpicData;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class OlimpicsDataService {


    private static final int EXPECTED_LINE_LENGHT =5;
    private static final int MINIMUM_LINE_LENGHT = 4;
    private static final int FOURTH_PLACE_AMOUNT_WHEN_NOT_GIVEN = 0;
    private static final int COUNTRY_INDEX = 0;
    private static final int GOLD_MEDALS_AMOUNT = 1;
    private static final int SILVER_MEDALS_AMOUNT = 2;
    private static final int BRONZE_MEDALS_AMOUNT = 3;

    public List<OlimpicsData> processDataFromFile(final String filePath) throws IOException {

        return Files.readAllLines(Paths.get(filePath)).stream()
                .map(this::mapToOlimpicsData)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());
    }

    private Optional<OlimpicsData> mapToOlimpicsData(final String fileLine) {
        if (fileLine.isEmpty()) {
            return Optional.empty();
        }

        final String[] splitLine = fileLine.split(",");
        if (splitLine.length < MINIMUM_LINE_LENGHT) {
            throw new RuntimeException("Data lenght is not enought"); // tu możesz przerobić na własny wyjątek jak się będziesz nudził
        }

        int fourthplace;
        if (splitLine.length == EXPECTED_LINE_LENGHT) {
            fourthplace = Integer.parseInt(splitLine[4]);
        } else {
            fourthplace = FOURTH_PLACE_AMOUNT_WHEN_NOT_GIVEN;
        }

    //   int[] integerValuesOfSplittedLines = Arrays.stream(splitLine)
    //           .mapToInt(Integer::parseInt)
    //           .toArray();

   //  final int GOLD_MEDALS = Integer.parseInt(splitLine[1]);
   //  final int SILVER_MEDALS = Integer.parseInt(splitLine[2]);
   //  final int BRONZE_MEDALS = Integer.parseInt(splitLine[3]);

        return Optional.of(OlimpicsData.builder()
                .countryShortName(splitLine[COUNTRY_INDEX].substring(1,4))
                .goldMedals(Integer.parseInt(splitLine[GOLD_MEDALS_AMOUNT]))
                .silverMedals(Integer.parseInt(splitLine[SILVER_MEDALS_AMOUNT]))
                .bronzeMedals(Integer.parseInt(splitLine[BRONZE_MEDALS_AMOUNT]))
                .fourthPlace(fourthplace)
                .build());
    }
    }

