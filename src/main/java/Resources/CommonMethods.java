package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CommonMethods {

    public static String readPropertyFile(String fileName, String key) throws IOException {
        FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\Resources\\" + fileName + ".properties");

        Properties prop = new Properties();
        prop.load(file);

        return prop.getProperty(key);
    }
}
