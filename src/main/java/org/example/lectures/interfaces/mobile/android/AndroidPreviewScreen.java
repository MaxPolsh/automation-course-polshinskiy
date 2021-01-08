package org.example.lectures.interfaces.mobile.android;


import org.example.lectures.interfaces.mobile.app.PreviewScreen;

public class AndroidPreviewScreen implements PreviewScreen {

    @Override
    public void clickSaveButton() {
        System.out.println("==> Android click export button");
    }

    @Override
    public void clickSaveToLocalAlbum() {
        System.out.println("==> Android click save to album");

    }

    @Override
    public void clickShareButton() {
        System.out.println("==> Android click share button");

    }
}
