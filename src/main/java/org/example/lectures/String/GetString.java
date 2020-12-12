package org.example.lectures.String;

import org.example.infrastructure.ConfigurationManager;

public class GetString {
    public static void main(String[] args) {
        System.out.println(ConfigurationManager.getEnvironmentVariableOrDefault("PATH", "1234"));
    }
}
