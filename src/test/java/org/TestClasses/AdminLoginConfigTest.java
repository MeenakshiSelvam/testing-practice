package org.TestClasses;

import PageObjectModel.DashboardPage;
import PageObjectModel.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class AdminLoginConfigTest {

    @Test
    public void adminLogin() throws IOException {

        Properties prop = new Properties();
        FileReader file = new FileReader("src/test/resources/config.properties");
        prop.load(file);

        WebDriver driver = new ChromeDriver();


        String Seconds = prop.getProperty("waitSeconds");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(Seconds)));



      //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(prop.getProperty("waitSeconds"))));
      //  driver.get(" driver.get(\"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login\");
        driver.get(prop.getProperty("orange.url"));

        LoginPage loginPage = new LoginPage(driver);
        DashboardPage dashboardPage = new DashboardPage(driver);

        loginPage.fillUsername(prop.getProperty("username.admin"));
        loginPage.fillPassword(prop.getProperty("password.admin"));
        loginPage.clickLogin();

        dashboardPage.verifyDashboard();


    }

}

