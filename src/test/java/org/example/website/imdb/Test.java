package org.example.website.imdb;

import static org.junit.Assert.assertEquals;

public class Test extends ImdbTestBase{

    @org.junit.Test
    public void testCommonRating() {

        logger.log("Enter");
        imdb.navbar().searchInput().sendKeys("Silicon Valley");

        logger.log("Choose first option");
        imdb.navbar().itemWithName("Silicon Valley").click();

        logger.log("Check title");
        assertEquals ("Кремниевая долина",imdb.showPage().info().title().getText().trim());


        logger.log("Check rating");
        assertEquals ("8,5",imdb.showPage().info().ratingValue().getText().trim());
    }
}
