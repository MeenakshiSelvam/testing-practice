package org.example;

import org.testng.annotations.Test;

public class InvocationAttribute {

    @Test(invocationCount = 2)
    public void Text1()
    {
        System.out.print("Twinkle  ");
    }



    @Test(invocationCount = 1)
    public void Text2()
    {
        System.out.print("Little  ");
    }

    @Test()
    public void Text4()
    {
        System.out.print("Star");
    }
}
