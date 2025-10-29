package LoginTestCases;

import PageObjects.LoginPageObject;
import PageObjects.SignUpPageObject;
import Resources.BaseClass;
import Resources.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignUpTestCase extends BaseClass {

    @BeforeMethod
    public void browserLaunch() throws Exception {
        browserInitilization();
        driver.get(CommonMethods.readPropertyFile("common", "url"));
        driver.manage().window().maximize();
    }

    @Test
    public void signUp() {
        LoginPageObject lp = new LoginPageObject(driver);
        lp.tryForFree().click();

        SignUpPageObject sp = new SignUpPageObject(driver);
        sp.userFirstName().sendKeys("Test");
        sp.userLastName().sendKeys("Automation");
        sp.userTitle().sendKeys("QA Engineer");
        sp.nextBtn().click();
    }

    @AfterMethod
    public void browserClose() {
        driver.close();
    }
}
