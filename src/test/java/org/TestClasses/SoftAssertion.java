package org.TestClasses;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
    @Test
    public void softAssertFunc()
    {

        //softAssert is used to execute all statements even if its failed.
        //without asssertall we can only see the executed statements.
        //with assertall we can see the failed asserts.
        SoftAssert softAssert = new SoftAssert();
        System.out.println("Welcome To");
        softAssert.assertEquals("India","India","Failed-1");
        softAssert.assertEquals("91","90","Failed-2");
        System.out.println("My Country");

        //with assertall() only shows failed asserts.
        softAssert.assertAll();


    }
}
