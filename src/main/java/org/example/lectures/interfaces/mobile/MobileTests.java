package org.example.lectures.interfaces.mobile;

import org.example.infrastructure.config.ConfigurationManager;
import org.example.infrastructure.logger.StdTestLogger;
import org.example.infrastructure.logger.TestLogger;
import org.example.lectures.interfaces.mobile.android.AndroidApp;
import org.example.lectures.interfaces.mobile.app.MobileApp;
import org.example.lectures.interfaces.mobile.ios.IosApp;

public class MobileTests {


    public static void main(String[] args){


        TestLogger logger = new StdTestLogger();



        logger.log("Open app");
        MobileApp app = getApp();

        logger.log("Click Select button photo");
        app.mainScreen().clickChooseImageButton();


        logger.log("Choose photo");
        app.mainScreen().selectImage();

        logger.log("Choose @ apply filter");
        app.editscreen().applyFilter();


        logger.log("Click Save button");
        app.editscreen().clickSaveButton();


        logger.log("Click Back button");
        app.toolbar().clickBackButton();

        logger.log("Choose @ apply another filter");
        app.editscreen().applyFilter();

        logger.log("Click Save button");
        app.editscreen().clickSaveButton();

        logger.log("Verify image");
        System.out.println("Verify");

        logger.log("Click Export button");
        app.previewScreen().clickSaveButton();

        logger.log("Click Save to album button");
        app.previewScreen().clickSaveToLocalAlbum();

        logger.log("Verify main screen is shown");
        System.out.println("Verify");



    }

    public static MobileApp getApp(){

        return ConfigurationManager.getInstance().getMobilePlatform().equals("IOS") ? new IosApp(): new AndroidApp();



    }
}
