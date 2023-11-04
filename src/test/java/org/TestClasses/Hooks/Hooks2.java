package org.TestClasses.Hooks;

import PageObjectModel.DashboardPage;
import PageObjectModel.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Hooks2 {

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
    }

    @Test
    public void loginTest2() {
        loginPage.fillUsername("abcdsfdasfd");
        loginPage.fillPassword("abcd123");
        loginPage.clickLogin();


    }


    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}
