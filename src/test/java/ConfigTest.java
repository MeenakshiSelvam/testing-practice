import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigTest {


    @Test
    public void configFromFile() throws IOException {


        // reading config file
        FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
//          FileInputStream env = new FileInputStream("src/test/resources/env.properties");


        // loading properties to 'properties' object
        Properties properties = new Properties();
        properties.load(fis);
//        properties.load(env);

        // reading and writing property values
        System.out.println(properties.getProperty("orange.url"));
        System.out.println(properties.getProperty("username.admin"));
        System.out.println(properties.getProperty("password.admin"));
        System.out.println(properties.getProperty("username.user"));
        System.out.println(properties.getProperty("password.user"));
        properties.setProperty("password.user", "user@123");
        System.out.println(properties.getProperty("password.user"));


        // saving all the properties to property file
        FileOutputStream fos = new FileOutputStream("src/test/resources/config.properties");
        properties.store(fos, "new file");

    }
}