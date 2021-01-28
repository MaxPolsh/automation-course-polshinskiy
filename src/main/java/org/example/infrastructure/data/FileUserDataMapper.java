package org.example.infrastructure.data;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileUserDataMapper extends AbstractUserDataMapper {


    public FileUserDataMapper(String filename) {
        File file = new File("users.txt");

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            String line = "";
            while ((line = br.readLine()) != null){

                String[] parts = line.split(",");

                for (int i = 0; i < users.size(); i++) {
                    if (users == null) {
                        User u = new User(parts[0],parts[1], parts[2], parts[3]);
                        users.add(i,u);
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
