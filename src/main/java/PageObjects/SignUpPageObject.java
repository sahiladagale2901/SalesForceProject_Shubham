package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObject {

    public WebDriver driver;

    public SignUpPageObject(WebDriver driver1) {
        this.driver = driver1;
    }

    By userFirstName = By.name("UserFirstName");

    By userLastName = By.name("UserLastName");
    By userTitle = By.name("UserTitle");
    By nextBtn = By.xpath("//*[@data-page-cntrl='next']");


    public WebElement userFirstName() {
        return driver.findElement(userFirstName);
    }

    public WebElement userLastName() {
        return driver.findElement(userLastName);
    }

    public WebElement userTitle() {
        return driver.findElement(userTitle);
    }

    public WebElement nextBtn() {
        return driver.findElement(nextBtn);
    }


}
