package org.example.infrastructure;

public class ConfigurationManager {
    private static ConfigurationManager singleton = new ConfigurationManager();
    private ConfigurationManager(){

    }
    public static ConfigurationManager getInstance(){
        return singleton;
    }

    public static String getTestEnv(String envVar, String defaulValue){
        return System.getenv(envVar) != null && !System.getenv(envVar).isBlank() ?
                System.getenv(envVar) : defaulValue;
    }

    public static String getTestBrowser(String testBrowser, String defaulValue){
        return System.getenv(testBrowser) != null && !System.getenv(testBrowser).isBlank() ?
                System.getenv(testBrowser) : defaulValue;
    }
}

