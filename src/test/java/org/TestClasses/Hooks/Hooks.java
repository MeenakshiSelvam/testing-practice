package org.TestClasses.Hooks;

import org.testng.annotations.*;

public class Hooks {


    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("Before Suite");
    }

    @BeforeTest
    public void beforeTest()
    {
        System.out.println("Before Test");
    }

    @BeforeClass
    public void beforeClass()
    {
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("Before Method");
    }


    @BeforeGroups({"smoke"})
    public void beforeGroups()
    {
        System.out.println("Before Group - Smoke");
    }

    @Test(groups = {"smoke"})
    public void Test1()
    {
        System.out.println("Test1");
    }

    @Test
    public void Test2()
    {
        System.out.println("Test2");
    }

    @AfterMethod
    public void afterMethod()
    {
        System.out.println("after Method");
    }



    @AfterGroups({"smoke"})
    public void AfterGroups()
    {
        System.out.println("After Groups - Smoke");
    }

    @AfterClass
    public void afterClass()
    {
        System.out.println("After Class");
    }

    @AfterTest
    public void afterTest()
    {
        System.out.println("After Test");
    }


    @AfterSuite
    public void afterSuite()
    {
        System.out.println("After Suite");
    }



}
