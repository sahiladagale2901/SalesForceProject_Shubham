package LoginTestCases;

import PageObjects.LoginPageObject;
import Resources.ActionModule;
import Resources.BaseClass;
import Resources.CommonMethods;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;
import java.time.Duration;

public class LoginPage extends BaseClass {

    //    CommonMethods commonMethods = new CommonMethods();
    private LoginPageObject lp;
    private ActionModule actionModule;

    @BeforeClass
    public void browserLaunch() throws Exception {
        browserInitilization();
        driver.get(CommonMethods.readPropertyFile("common", "url"));
        driver.manage().window().maximize();
    }


    @Test
    public void invalidCredentials() throws IOException {
        String username = CommonMethods.readPropertyFile("common", "username");
        String password = CommonMethods.readPropertyFile("common", "password");
        lp = new LoginPageObject(driver);
//        lp.userName().sendKeys(username);

        lp.enterUserName(username);
        lp.passWord().sendKeys(password);
    }

    @Test(dependsOnMethods = {"invalidCredentials"})
    public void fetchWarningMessage() {
        lp = new LoginPageObject(driver);
        lp.loginButton().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String error = lp.warningMessage().getText().trim();

        Assert.assertEquals(error, "Error: Please check your username and password. If you still can't log in, contact your Salesforce administrator.");
    }

    @Test
    public void actionMoudlePractice(){
        actionModule =new ActionModule();
        actionModule.actionSendKeys(lp.passWord(),"Password");
    }


    @AfterClass
    public void browserClose() {
        driver.close();
    }
}
