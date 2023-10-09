package utils;

import java.io.FileInputStream;
import java.util.Properties;

import java.io.IOException;

public class ConfigReader {
    private Properties properties;

    public ConfigReader() {
        properties = new Properties();

        String userDir = System.getProperty("user.dir");

        try {
            // Load the configuration file
            FileInputStream input = new FileInputStream(userDir + "\\src\\test\\configs\\config.properties");
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception appropriately (e.g., log the error, throw a custom exception)
        }
    }

    public String getBaseURI() {
        return properties.getProperty("baseURI");
    }

    public String getApiKey() {
        return properties.getProperty("apiKey");
    }

}
