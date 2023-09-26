package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAttribute {

//    public void loginTest1()
//    {
//        System.out.println("Admin" + "admin123");
//    }
//    public void loginTest2()
//    {
//        System.out.println("asdf" + "jklh");
//    }
//    public void loginTest3()
//    {
//        System.out.println("qwer" + "uiop");
//    }
//    public void loginTest4()
//    {
//        System.out.println("zxcv" + "bnmv");
//    }
//
    @Test(dataProvider = "Login_Data")
    public void login(String username, String password)
    {
        System.out.println(username + password);
    }



    @DataProvider(name = "Login_Data")
    Object[][] loginData()
    {
        Object[][] data={{"admin","admin123"},{"ad","yz"}};
                return data;
    }


    @Test(dataProvider = "logOut",dataProviderClass = DataProvider2.class)
    public void logOut(String username, String password)
    {
        System.out.println(username + password);
    }



}
