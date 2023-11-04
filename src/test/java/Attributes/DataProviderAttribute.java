package Attributes;

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


    // we can give function name if there is no dataprovider's name.
    //if there is name for dataprovider then we have to give that name to test(dataprovider).
    //name has high preference.
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



    //we can execute the Test from different class or from different package Class DataProvider.
    //so we can use different classess's data provider.
    // if we are calling  dataprovider in same class then we should use 'dataProvider' attribute.
    // if we are calling dataprovider in different classes from same package or different package
       // then we should use 'dataproviderClass' attribute.
    @Test(dataProvider = "logOut",dataProviderClass = DataProvider2.class)
    public void logOut(String username, String password)
    {
        System.out.println(username + password);
    }



}
