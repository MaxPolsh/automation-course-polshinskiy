package org.example.infrastructure.logger;

import java.io.File;
import java.io.FileWriter;

public class FileTestLogger extends TestLogger{

    private String filename;

    public FileTestLogger(String filename) {
        this.filename = filename;
    }

    @Override
    public void log(String msg) {
        try {

            File f = new File(filename);
            FileWriter fw = new FileWriter(f,true);

            fw.write(formatMessage(msg) + "\n");
            fw.flush();
            fw.close();

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
