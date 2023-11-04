package Attributes;

import org.testng.annotations.Test;

public class GroupAttribute {

    @Test(groups = {"smoke"})
    public void method1()

    {
        System.out.println("Test1");
    }

    @Test(groups = {"regression"})
    public void method2()
    {
        System.out.println("Test2");
    }

    @Test(groups = {"regression", "smoke"})
    public void method3()
    {
        System.out.println("Test3");
    }


}
