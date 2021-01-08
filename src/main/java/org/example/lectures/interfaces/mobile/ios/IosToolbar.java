package org.example.lectures.interfaces.mobile.ios;


import org.example.lectures.interfaces.mobile.app.Toolbar;

public class IosToolbar implements Toolbar {


    @Override
    public void clickBackButton() {
        System.out.println("==> ios click back button");
    }
}
