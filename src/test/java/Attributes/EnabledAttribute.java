package Attributes;

import org.testng.annotations.Test;

public class EnabledAttribute {


    @Test(enabled = true)
    public void msg1()
    {
        System.out.println("Method A");
    }

    //enable false - not execute.
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
