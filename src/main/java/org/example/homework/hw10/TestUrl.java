package org.example.homework.hw10;

import java.util.HashMap;
import java.util.Map;

public class TestUrl {

    private String protocol = "";
    private String domain = "";
    private String port = "";
    private String path = "";
    private Map<String, String> params = new HashMap();

    private TestUrl() {
    }

    public String getProtocol() {
        return protocol;
    }

    public String getDomain() {
        return domain;
    }

    public String getPort() {
        return port;
    }

    public String getPath() {
        return path;
    }

    public Map <String, String> getParams() {
        return params;
    }

    public static class Builder {

        private TestUrl testUrl;

        public Builder() {
            testUrl = new TestUrl();
        }

        public Builder withProtocol(String protocol) {
            testUrl.protocol = protocol;
            return this;
        }

        public Builder withDomain(String domain) {
            testUrl.domain = domain;
            return this;
        }

        public Builder withPort(String port) {
            testUrl.port = port;
            return this;
        }

        public Builder withPath(String path) {
            testUrl.path = path;
            return this;
        }

        public Builder withParam(String param) {
            testUrl.params.put(param, "");
            return this;
        }

        public Builder withParam(String key, String value) {
            testUrl.params.put(key, value);
            return this;
        }

        public Builder withParams(Map<String, String> params) {
            testUrl.params.putAll(params);
            return this;
        }

        public TestUrl getTestUrl() {
            return testUrl;
        }

        public String build() {
            String url = "";

            if (!testUrl.protocol.endsWith("://"))
                url += testUrl.protocol + "://";

            url += testUrl.domain;

            if (!testUrl.port.isEmpty() && !testUrl.port.startsWith(":"))
                url += ":" + testUrl.port;
            else
                url += testUrl.port;

            if (!testUrl.path.isEmpty() && !testUrl.path.startsWith("/"))
                url += "/" + testUrl.path;
            else
                url += testUrl.path;


            if (!testUrl.params.isEmpty()){

                url += "?";

                for (Map.Entry<String, String> entry: testUrl.params.entrySet()){

                    if ( entry.getValue().isBlank()){

                        url += entry.getKey() + "&";

                    } else {

                        url += entry.getKey() + "=" + entry.getValue() + "&";
                    }

                }
            }


            return url;
        }
    }
}


