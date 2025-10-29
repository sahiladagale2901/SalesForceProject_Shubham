package Resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {
    public WebDriver driver;

    public void browserInitilization() throws Exception {

        String nameOfBrowser = CommonMethods.readPropertyFile("browser", "browserName");

//        FileInputStream file = new FileInputStream(System.getProperty("user.dir") +"\\src\\main\\java\\Resources\\browser.properties");
//
//        Properties prop = new Properties();
//        prop.load(file);
//        String nameOfBrowser = prop.getProperty("browserName");


        if (nameOfBrowser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (nameOfBrowser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (nameOfBrowser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else {
            throw new Exception("Invalid browser name in browser.properties file");
        }

    }

}
