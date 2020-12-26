package org.example.infrastructure;

public class TestServer {
    public static String getUrl(){
        switch (ConfigurationManager.getInstance().getTestEnv()){
            case "local":
                return "http://localhost:8080";
            case "dev":
                return "http://dev.mysite.com";
            case "staging":
                return "http://staging.mysite.com";
            case "test":
                return "http://test.mysite.com";
            case "production":
                return "http://production.mysite.com";
            default:
                return "http://mysite.com";


        }
    }
}
