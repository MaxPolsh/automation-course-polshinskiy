package org.example.homework.hw10;

public class TestUrl {
    private String protocol;
    private String domain;
    private String port;
    private String path;
    private String param;
    private String key;
    private String value;


    public static class Builder{
        private TestUrl url;

        public Builder() {
            url = new TestUrl();
        }

        public Builder withProtocol(String protocol) {
            url.protocol = protocol;
            return this;
        }

        public Builder withDomain(String domain) {
            url.domain = domain;
            return this;
        }

        public Builder withPort(String port) {
            url.port = port;
            return this;
        }

        public Builder withPath(String path) {
            url.path = path;
            return this;
        }

        public Builder withParam(String param) {
            url.param = param;
            return this;
        }

        public Builder withParam(String key, String value) {
            url.key = key;
            url.value = value;
            return this;
        }

        public TestUrl build() {
            return url;
        }
    }

    public static void main(String[] args) {
        TestUrl url = new TestUrl.Builder()
                .withProtocol("protocol")
                .withDomain("domain")
                .withPort("port")
                .withPath("path")
                .withParam("param")
                .withParam("key", "value")
                .build();

        System.out.println(url);
    }
}


