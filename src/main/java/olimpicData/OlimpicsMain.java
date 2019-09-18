package olimpicData;

import java.io.IOException;
import java.util.List;

public class OlimpicsMain {

    public static void main(String[] args) throws IOException {

    final String filePath = args[0]; // żeby plik był argumentem wejścia do programu - klikasz powyżej w nazwę pliku przy młotku
                                        // klikasz edit configuration i w program arguments dodajesz ścieżkę + nazwa pliku \
    final String outputFile = args[1];

    final OlimpicsDataService olimpicsDataService = new OlimpicsDataService();

    final List<OlimpicsData> olimpicsDataList = olimpicsDataService.processDataFromFile(filePath);

    final OlimpicDataStatistics olimpicDataStatistics = new OlimpicDataStatistics();

    final OlimpicsDataWriter olimpicsDataWriter = new OlimpicsDataWriter();

    olimpicsDataWriter.safe2File(outputFile, olimpicsDataList);




    }

    }

