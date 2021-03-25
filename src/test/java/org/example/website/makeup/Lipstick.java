package org.example.website.makeup;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Lipstick extends MakeUpUATestBase{
    @Override
    protected void beforeTest() {
        super.beforeTest();
    }

    @Test

    public void testByRedLipstick(){

        logger.log("Choose make up category");
        makeUp.menu().showSubCategories("Макияж");

        logger.log("Open lips subcategory");
        makeUp.menu().openSubCategory("Макияж","Губы");


        logger.log("Open product 'Yves'");
        makeUp.categoryPage()
                .getBlock("Самые широкие")
                .openProduct ("Yves Saint");


        logger.log("Click button 'Buy'");
        makeUp.productPage().clickByButton();

        logger.log("Click button 'Checkout'");
        makeUp.shoppingCardPage().clickCheckout();

        logger.log("Check Sum");

        assertEquals ("816",makeUp.checkoutPage().getTotalSum());
        assertEquals ("816",makeUp.checkoutPage().getTotalTotalSum());

    }
}
