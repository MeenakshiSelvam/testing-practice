package org.example;

import org.testng.annotations.Test;

import javax.swing.*;

public class PriorityAttributes {
    //executes ascending order or alpha order always, if we want  to change order use priority (default-0).
    @Test(priority = 2)
    public void A()
    {
        System.out.println("Method A");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {}

    }

    @Test(priority = 1)
    public void D()
    {
        System.out.println("Method D");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {}

    }

    @Test(priority = 3)
    public void B()
    {
        System.out.println("Method B");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {}
    }

    @Test(priority = 0)
    public void C()
    {
        System.out.println("Method C");

        try {
            Thread.sleep(5000);
        } catch (Exception e) {}
    }

}
