package org.TestClasses;

import PageObjectModel.DashboardPage;
import PageObjectModel.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HardAssertions {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
    }


    @Test
    public void loginTest1() {
        loginPage.fillUsername("Admin");
        loginPage.fillPassword("admin123");
        loginPage.clickLogin();

        //dashboardPage.verifyDashboard();

        try {
            Thread.sleep(5000);
        } catch (Exception e){}

        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "Url mis-matching!");

        //actual and expected.
        Assert.assertEquals( driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index",
                "Url missmatching!!!");



    }

    @Test
    public void loginTest2() {
        loginPage.fillUsername("abcdsfdasfd");
        loginPage.fillPassword("abcd123");
        loginPage.clickLogin();

        // dashboardPage.verifyDashboard(); //instead of this method call,we can use assert functions to verify dashboard.

        try {
            Thread.sleep(5000);
        } catch (Exception e){}


//        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"Url MisMatching");
//        Assert.assertFalse(driver.getCurrentUrl().contains("dashboard"),"Url Mismatching");
        Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index","url mis-matching");
        //Assert.assertNotEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index","Url-misMatching");

// it shows error only if its false.


    }


    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}
