package org.example.lectures.String;

import org.example.infrastructure.ConfigurationManager;

public class GetString {
    public static void main(String[] args) {
        System.out.println(ConfigurationManager.getTestEnv("PATH", "1234"));
        System.out.println(ConfigurationManager.getTestBrowser("Chrome", "EE"));
    }
}
