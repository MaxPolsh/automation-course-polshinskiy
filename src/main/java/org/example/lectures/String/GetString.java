package org.example.lectures.String;

import org.example.infrastructure.ConfigurationManager;

public class GetString {
    public static void main(String[] args) {
        System.out.println(ConfigurationManager.getInstance().getTestEnv());
        System.out.println(ConfigurationManager.getInstance().getTestBrowser());
    }
}
