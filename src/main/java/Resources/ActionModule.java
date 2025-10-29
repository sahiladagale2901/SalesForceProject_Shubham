package Resources;

import org.openqa.selenium.WebElement;

import java.time.Duration;

public class ActionModule extends BaseClass {

    public void actionSendKeys(WebElement ele, String text) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        ele.sendKeys(text);
    }

    public String actionGetText(WebElement ele) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        return ele.getText();
    }

    public void checkURL(String expected, String actual) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        if (!expected.equals(actual)) {
            throw new AssertionError(" Expected is not equal to actual" + expected + "\n" + actual);
        }
    }
}
