package org.example;

import org.testng.annotations.DataProvider;

public class DataProvider2 {

    @DataProvider
    Object[][] logOut()
    {
        Object[][] data={{"Log","out"},{"ab","cd"}};
        return data;
    }

}
