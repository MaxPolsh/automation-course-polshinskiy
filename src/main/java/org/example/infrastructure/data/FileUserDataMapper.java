package org.example.infrastructure.data;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class FileUserDataMapper extends AbstractUserDataMapper {


    public FileUserDataMapper(String filename) {
        File file = new File("users.txt");

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            String line = "";
            while ((line = br.readLine()) != null){

                List<String> parts = Arrays.asList(line.split(","));

                for (int i = 0; i < users.length; i++) {
                    if (users[i] == null) {
                        users[i] = new User(parts.get(0), parts.get(1), parts.get(2), parts.get(3));
                        break;
                    }
                }
            }

            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
