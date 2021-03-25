package org.example.website.makeup;

import org.example.infrastructure.base.TestBase;
import org.example.website.makeup.components.MakeUpUAWebsite;

public class MakeUpUATestBase extends TestBase {

    protected MakeUpUAWebsite makeUp;

    @Override
    protected void beforeTest() {
        webDriver.get("https://makeup.com.ua/");

        makeUp = new MakeUpUAWebsite(webDriver);
    }
}
