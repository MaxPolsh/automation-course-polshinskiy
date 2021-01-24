package org.example.infrastructure.data;

import java.io.*;

public class FileUserDataMapper extends AbstractUserDataMapper {


    public FileUserDataMapper(String filename) {
        File file = new File("users.txt");

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            String line = "";
            while ((line = br.readLine()) != null){

                String[] parts = line.split(",");

                for (int i = 0; i < users.length; i++) {
                    if (users[i] == null) {
                        users[i] = new User(parts[0], parts[1], parts[2], parts[3]);
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
