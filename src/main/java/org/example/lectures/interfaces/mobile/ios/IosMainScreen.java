package org.example.lectures.interfaces.mobile.ios;


import org.example.lectures.interfaces.mobile.app.MainScreen;

public class IosMainScreen implements MainScreen {


    @Override
    public void clickChooseImageButton() {
        System.out.println("ios choose photo from gallery");
    }

    @Override
    public void selectImage() {

        System.out.println("ios select photo");

    }
}
