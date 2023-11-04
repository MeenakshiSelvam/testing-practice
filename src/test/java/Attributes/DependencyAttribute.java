package Attributes;

import org.testng.annotations.Test;

public class DependencyAttribute {
    @Test(testName="Open Shopping App", suiteName = "Amazon Test Suite",description = "Open the Amazon app to shop online")
    public void OpenAmazonWebsite()
    {
        System.out.println("Amazon Site is opened");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {}

    }
    @Test(dependsOnMethods = {"registerOnAmazon"})
    public void loginOnAmazon()
    {
        System.out.println("Login Amazon");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {}

    }
    @Test(dependsOnMethods = {"OpenAmazonWebsite"})
    public void registerOnAmazon()
    {
        System.out.println("Register On Amazon");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {}

    }
    @Test(dependsOnMethods = {"loginOnAmazon"})
    public void purchaseOnAmazon()
    {
        System.out.println("Purchasing on Amazon");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {}

    }
    @Test(dependsOnMethods = {"loginOnAmazon"})
    public void addToCartOnAmazon()
    {
        System.out.println("Added to Cart on Amazon");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {}

    }
    @Test(dependsOnMethods = {"purchaseOnAmazon"})
    public void makePaymentOnAmazon()
    {
        System.out.println("Made Payment On Amazon");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {}
    }





    @Test
    public void openFlipkartWebsite()
    {
        System.out.println("Flipkart Site is Opened");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {}
    }
    @Test(dependsOnMethods = {"openFlipkartWebsite"})
    public void registerOnFlipkart()
    {
        System.out.println("Register on Fipkart");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {}
    }
    @Test(dependsOnMethods = {"registerOnFlipkart"})
    public void loginOnFlipkart()
    {
        System.out.println("Login on Flipkart");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {}
    }
    @Test(dependsOnMethods = {"loginOnFlipkart"})
    public void addToCartOnFlipkart()
    {
        System.out.println("Added to Cart on Flipkart");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {}
    }
    @Test(dependsOnMethods = {"loginOnFlipkart"})
    public void purchaseOnFlipkart()
    {
        System.out.println("Purchased On Flipkart");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {}
    }
    @Test(dependsOnMethods = {"purchaseOnFlipkart"})
    public void makePaymentOnFlipkart()
    {
        System.out.println("Made Payment on Flipkart");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {}
    }
}
