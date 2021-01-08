package org.example.lectures.interfaces.mobile.android;


import org.example.lectures.interfaces.mobile.app.EditScreen;

public class AndroidEditScreen implements EditScreen {

    @Override
    public void applyFilter() {
        System.out.println("==> Android apply filter");
    }

    @Override
    public void clickSaveButton() {

        System.out.println("==> Android click save button");

    }
}
