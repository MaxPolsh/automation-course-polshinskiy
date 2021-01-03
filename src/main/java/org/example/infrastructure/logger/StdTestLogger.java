package org.example.infrastructure.logger;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StdTestLogger extends TestLogger {



     @Override
     public void log(String msg){

         System.out.println(formatMessage(msg));

     }

}
