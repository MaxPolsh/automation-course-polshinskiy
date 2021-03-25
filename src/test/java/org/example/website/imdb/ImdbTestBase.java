package org.example.website.imdb;

import org.example.infrastructure.base.TestBase;
import org.example.website.imdb.pages.ImdbWebSite;

public class ImdbTestBase extends TestBase {

    protected ImdbWebSite imdb;

    @Override
    protected void beforeTest() {

        logger.log("Open website");
        webDriver.get("https://www.imdb.com/");

        imdb = new ImdbWebSite(webDriver);

    }
}
