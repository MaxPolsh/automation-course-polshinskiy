package org.example.infrastructure;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestLogger {

    private int step = 1;

     public void log(String messege){

         SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:SSS");
         String time = sdf.format(new Date());

         String testName = Thread.currentThread().getName();

         System.out.println(step + ") " + time + " [" + testName + "] " + messege);
         step++;
     }

}
