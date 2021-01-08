package org.example.lectures.interfaces.mobile.android;

import org.example.lectures.interfaces.mobile.app.Toolbar;

public class AndroidToolbar implements Toolbar {

    @Override
    public void clickBackButton() {
        System.out.println("==> Android back button click");
    }
}
