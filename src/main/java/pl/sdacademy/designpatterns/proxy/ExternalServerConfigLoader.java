package pl.sdacademy.designpatterns.proxy;

import java.util.Random;

public class ExternalServerConfigLoader implements ConfigLoader {
    private String configuration;
    private String serverURL;

    public ExternalServerConfigLoader(String serverURL) {
        this.serverURL = serverURL;
    }

    @Override
    public String load() {
        System.out.println("Getting configuration from " + serverURL);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        configuration = "Config value from server url: " + new Random().nextInt();
        return configuration;
    }
}
