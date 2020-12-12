package org.example.infrastructure;

public class ConfigurationManager {
    public static String getEnvironmentVariableOrDefault(String envVar, String defaulValue){
        return System.getenv(envVar) != null && !System.getenv(envVar).isBlank() ?
                System.getenv(envVar) : defaulValue;

    }
}
