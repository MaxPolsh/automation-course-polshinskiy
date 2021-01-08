package org.example.lectures.interfaces.mobile.ios;


import org.example.lectures.interfaces.mobile.app.*;

public class IosApp implements MobileApp {

    @Override
    public Toolbar toolbar() {
        return new IosToolbar();
    }

    @Override
    public MainScreen mainScreen() {
        return new IosMainScreen();
    }

    @Override
    public EditScreen editscreen() {
        return new IosEditScreen();
    }

    @Override
    public PreviewScreen previewScreen() {
        return new IosPreviewScreen();
    }
}
