package org.example.infrastructure.logger;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class TestLogger {

    private int step = 0;

    protected String formatMessage(String msg){
        step++;

        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:SSS");
        String time = sdf.format(new Date());

        String testName = Thread.currentThread().getName();
        return step + ") " + time + " [" + testName + "] " + msg;
    }

    public abstract void log(String msg);


}
