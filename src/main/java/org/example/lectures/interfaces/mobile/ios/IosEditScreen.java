package org.example.lectures.interfaces.mobile.ios;


import org.example.lectures.interfaces.mobile.app.EditScreen;

public class IosEditScreen implements EditScreen {

    @Override
    public void applyFilter() {
        System.out.println("ios apply filter");
    }

    @Override
    public void clickSaveButton() {
        System.out.println("ios click save");

    }
}
