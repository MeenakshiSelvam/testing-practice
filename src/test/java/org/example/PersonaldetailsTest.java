package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class PersonaldetailsTest {
    @Test
    public void Details() {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        LoginPage login = new LoginPage(driver);
        login.fillUsername("Admin");
        login.fillPassword("admin123");
        login.clickLogin();



        MyInfoPage info = new MyInfoPage(driver);
        info.fillFirstname("Abinav");
        info.fillLastname("Thashvin");
        info.enterEmpid("12");
//        info.enterNationality("Indian");
        //   info.fillDob("20122001");
        info.clickMale();
        info.clickSave();


    }
}
