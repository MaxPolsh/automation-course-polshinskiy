package org.example.infrastructure;

public class TestBase {
    protected TestLogger logger;
    protected String webDriver;

    private WebDriverManager wdm;

    public void setUp(){
        // new test logger
        logger = new TestLogger();

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


}
