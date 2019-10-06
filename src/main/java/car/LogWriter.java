package car;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LogWriter {

    BufferedWriter logWriter;

    {
        try {
            logWriter = new BufferedWriter(new FileWriter("logs.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
