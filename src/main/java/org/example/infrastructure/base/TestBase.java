package org.example.infrastructure.base;

import org.example.infrastructure.config.ConfigurationManager;
import org.example.infrastructure.data.FileUserDataMapper;
import org.example.infrastructure.logger.FileTestLogger;
import org.example.infrastructure.logger.StdTestLogger;
import org.example.infrastructure.logger.TestLogger;
import org.example.infrastructure.wdm.DefaultWebDriverManager;
import org.openqa.selenium.WebDriver;

public abstract class TestBase {
    protected TestLogger logger;
    protected WebDriver webDriver;

    protected FileUserDataMapper userData;

    private DefaultWebDriverManager wdm;

    public void setUp(){
        // new test logger
        logger = getLogger();
        userData = new FileUserDataMapper("users.txt");

        //start browser
        wdm = new DefaultWebDriverManager();
        webDriver = wdm.getWebDriver();

        logger.log("Open testing website");

        beforeTest();

    }

    public void cleanUp(){
        afterTest();

        //close browser
        wdm.destroyWebDriver(webDriver);


    }

    protected void beforeTest(){}

    protected void afterTest(){}

    private TestLogger getLogger() {
        return ConfigurationManager.getInstance().getTestLogger().equals("std") ?
                new StdTestLogger() : new FileTestLogger("report" + System.currentTimeMillis() + ".txt");
    }


}
