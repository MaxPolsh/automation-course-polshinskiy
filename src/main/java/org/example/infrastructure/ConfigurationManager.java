package org.example.infrastructure;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private ConfigurationManager(){

    }
    public static ConfigurationManager getInstance(){
        if (instance == null)
            instance = new ConfigurationManager();
        return instance;
    }

    public String getTestEnv(){
        return getEnvironmetVariableOrDefault("envVar", "defaulValue");
    }

    public String getTestBrowser(){
        return getEnvironmetVariableOrDefault("envVar", "defaulValue");
    }

    private String getEnvironmetVariableOrDefault(String envVar, String defaulValue){
        return System.getenv(envVar) != null && !System.getenv(envVar).isBlank() ?
                System.getenv(envVar) : defaulValue;
    }
}

