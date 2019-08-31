package zadania_streamy_generyki;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;


public class OlimpicsDataService {

//  public List<OlimpicsData> processDataFromFile(final String filePath) throws IOException {

//      List<OlimpicsData> olimpicsDataList =  Files.readAllLines(Paths.get(filePath))
//              .stream()
//              .map(this::mapToOlimpicsData)
//              .collect(Collectors.toList());
//      for (OlimpicsData olimpicsData: olimpicsDataList
//           ) {
//          System.out.println(olimpicsData);

//      }
//      return olimpicsDataList;
    }

//public OlimpicsData mapToOlimpicsData(final String fileLine) {

//    final String[] fileSplit = fileLine.split(",");

//    int fourthplace;
//    if (fileSplit.length == 5) {
//        fourthplace = Integer.parseInt(fileSplit[4]);
//    } else {
//        fourthplace =
//    }
// //  return;

