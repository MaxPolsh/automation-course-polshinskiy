package org.example.lectures.interfaces.mobile.android;


import org.example.lectures.interfaces.mobile.app.MainScreen;

public class AndroidMainScreen implements MainScreen {


    @Override
    public void clickChooseImageButton() {
        System.out.println("==> Android choose image");
    }

    @Override
    public void selectImage() {
        System.out.println("\"==> Android select image");

    }
}
