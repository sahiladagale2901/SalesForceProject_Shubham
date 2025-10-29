package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {

    public WebDriver driver;
    By username = By.id("username");
    By password = By.id("password");
    By loginButton = By.id("Login");
    By warningMessage = By.id("error");
    By tryForFree = By.id("signup_link");

    public LoginPageObject(WebDriver driver2) {
        this.driver = driver2;
        PageFactory.initElements(driver,this);
    }

    public WebElement userName() {
        return driver.findElement(username);
    }

    public WebElement passWord() {
        return driver.findElement(password);
    }

    public WebElement loginButton() {
        return driver.findElement(loginButton);
    }

    public WebElement warningMessage() {
        return driver.findElement(warningMessage);
    }

    public WebElement tryForFree() {
        return driver.findElement(tryForFree);
    }


    @FindBy(id="username")
    private WebElement userName;

    public void enterUserName(String user_Name){
        userName.sendKeys(user_Name);
    }

}
