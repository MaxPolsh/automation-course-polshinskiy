package org.example.website.bugsmanager;

import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class Tests extends BugsManagerTestBase {

    @Test

    public void firstBug(){

        assertEquals("First Bug",bugsManagerWebSite.bugList("First Bug"));
    }

    @Test

    public void addDialog(){

        logger.log("Create a new bug");
        webDriver.findElement(By.linkText("Add in form")).click();
    }
}
