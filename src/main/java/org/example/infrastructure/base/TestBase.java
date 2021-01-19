package org.example.infrastructure.base;

import org.example.infrastructure.config.ConfigurationManager;
import org.example.infrastructure.logger.FileTestLogger;
import org.example.infrastructure.logger.StdTestLogger;
import org.example.infrastructure.logger.TestLogger;
import org.example.infrastructure.wdm.DefaultWebDriverManager;

public abstract class TestBase {
    protected TestLogger logger;
    protected String webDriver;

    private DefaultWebDriverManager wdm;

    public void setUp(){
        // new test logger
        logger = getLogger();

        //start browser
        wdm = new DefaultWebDriverManager();
        webDriver = wdm.getWebDriver();

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
