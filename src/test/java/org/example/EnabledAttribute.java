package org.example;

import org.testng.annotations.Test;

public class EnabledAttribute {


    @Test(enabled = true)
    public void msg1()
    {
        System.out.println("Method A");
    }

    @Test(enabled = false)
    public void msg2()
    {
        System.out.println("Method B");
    }

    @Test
    public void msg3()
    {
        System.out.println("Method C");
    }
}
