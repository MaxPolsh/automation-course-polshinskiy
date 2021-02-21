package org.example;

import java.io.*;

public class FileUserDataMapper extends AbstractUserDataMapper {


    public FileUserDataMapper(String filename) {
        File file = new File("users.txt");

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            String line = "";
            while ((line = br.readLine()) != null){

                String[] parts = line.split(",");
                users.add(new User(parts[0], parts[1], parts[2], parts[3]));
            }

            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
