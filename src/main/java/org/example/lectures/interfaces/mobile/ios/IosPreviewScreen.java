package org.example.lectures.interfaces.mobile.ios;


import org.example.lectures.interfaces.mobile.app.PreviewScreen;

public class IosPreviewScreen implements PreviewScreen {

    @Override
    public void clickSaveButton() {
        System.out.println("ios click export button");
    }

    @Override
    public void clickSaveToLocalAlbum() {
        System.out.println("ios click save to album");

    }

    @Override
    public void clickShareButton() {
        System.out.println("ios click share button");

    }
}
