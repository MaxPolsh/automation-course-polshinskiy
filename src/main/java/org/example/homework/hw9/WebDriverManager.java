package org.example.homework.hw9;

import org.example.infrastructure.config.ConfigurationManager;

public class WebDriverManager {
    public String getBrowser(){

        switch (ConfigurationManager.getInstance().getTestBrowser()) {
            case "chrome":
                return "Google Chrome";
            case "firefox":
                return "Mozilla Firefox";
            case "edge":
                return "Microsoft Edge";
            default:
                return "";


        }
    }
    public void destroyBrowser(String browser){
        if (browser != null)
            System.out.println("Closing browser:" + browser);
    }
}
