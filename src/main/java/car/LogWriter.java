package car;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LogWriter {

   BufferedWriter logWriter = new BufferedWriter(new FileWriter("CarParkLogs.txt"));


    public LogWriter() throws IOException {
    }
}


