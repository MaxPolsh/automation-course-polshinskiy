package org.example.website.bugsmanager;

import org.example.infrastructure.base.TestBase;
import org.example.website.bugsmanager.pages.BugsManagerWebSite;

public class BugsManagerTestBase extends TestBase {

    protected BugsManagerWebSite bugsManagerWebSite;

    @Override
    protected void beforeTest() {
        logger.log("Open website");
        webDriver.get("https://bugsmanager.herokuapp.com/");

        bugsManagerWebSite = new BugsManagerWebSite(webDriver);
    }
}
