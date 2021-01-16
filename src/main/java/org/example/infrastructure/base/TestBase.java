package org.example.infrastructure.base;

import org.example.infrastructure.config.ConfigurationManager;
import org.example.infrastructure.logger.FileTestLogger;
import org.example.infrastructure.logger.StdTestLogger;
import org.example.homework.hw9.WebDriverManager;
import org.example.infrastructure.logger.TestLogger;

public abstract class TestBase {
    protected TestLogger logger;
    protected String webDriver;

    private WebDriverManager wdm;

    public void setUp(){
        // new test logger
        logger = getLogger();

        //start browser
        wdm = new WebDriverManager();
        webDriver = wdm.getBrowser();

        logger.log("Open testing website");

        beforeTest();

    }

    public void cleanUp(){
        afterTest();

        //close browser
        wdm.destroyBrowser(webDriver);


    }

    protected void beforeTest(){}

    protected void afterTest(){}

    private TestLogger getLogger() {
        return ConfigurationManager.getInstance().getTestLogger().equals("std") ?
                new StdTestLogger() : new FileTestLogger("report" + System.currentTimeMillis() + ".txt");
    }


}
