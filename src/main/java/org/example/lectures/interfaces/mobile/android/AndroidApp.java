package org.example.lectures.interfaces.mobile.android;


import org.example.lectures.interfaces.mobile.app.*;

public class AndroidApp implements MobileApp {

    @Override
    public Toolbar toolbar() {
        return new AndroidToolbar();
    }

    @Override
    public MainScreen mainScreen() {
        return new AndroidMainScreen();
    }

    @Override
    public EditScreen editscreen() {
        return new AndroidEditScreen();
    }

    @Override
    public PreviewScreen previewScreen() {
        return new AndroidPreviewScreen();
    }
}
