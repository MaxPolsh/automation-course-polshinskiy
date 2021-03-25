package org.example.infrastructure.config;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private ConfigurationManager(){

    }
    public static ConfigurationManager getInstance(){
        if (instance == null)
            instance = new ConfigurationManager();
        return instance;
    }

    public String getRunOn() {return getEnvironmetVariableOrDefault("runOn", "local");}

    public String getTestEnv(){
        return getEnvironmetVariableOrDefault("envVar", "production");
    }

    public String getTestBrowser(){
        return getEnvironmetVariableOrDefault("envVar", "chrome");
    }

    public String getTestLogger() {
        return getEnvironmetVariableOrDefault("testLogger","std");
    }

    private String getEnvironmetVariableOrDefault(String envVar, String defaulValue){
        return System.getenv(envVar) != null && !System.getenv(envVar).isBlank() ?
                System.getenv(envVar) : defaulValue;
    }

    public String getMobilePlatform() {
        return getEnvironmetVariableOrDefault("mobilePlatform","iOS");
    }
}

