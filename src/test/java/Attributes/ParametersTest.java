package Attributes;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {


    @Test
    @Parameters({"title","hghj","count"})
    public void generalBook(String title, @Optional("default author") String author,@Optional String count)

    {
        System.out.println("Book Title is " + title);
        System.out.println("Book Author :" + author);
        System.out.println("No of General books "+ count);
    }

    @Test
    @Parameters({"CBname"})
    public void courseBook(String Cname)
    {
        System.out.println("course book :" + Cname);
    }

    @Test
    @Parameters({"KBname","count"})
    public void kidsBook(String Kname, String count)
    {
        System.out.println("Kids Book name is "+ Kname);
        System.out.println("Kids Books Count is " + count);
    }

}
