package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardDependencyAttribute {

        @Test()
        public void Open()
        {
            System.out.println("Amazon Site is opened");
            try {
                Thread.sleep(5000);
            } catch (Exception e) {}

        }
        @Test(dependsOnMethods = {"register"})
        public void login()
        {
            System.out.println("Login Amazon");
            try {
                Thread.sleep(5000);
            } catch (Exception e) {}
            Assert.fail("Intentionally failed");

        }
        @Test(dependsOnMethods = {"Open"})
        public void register()
        {
            System.out.println("Register On Amazon");
            try {
                Thread.sleep(5000);
            } catch (Exception e) {}

        }
        @Test(dependsOnMethods = {"login"})
        public void purchase()
        {
            System.out.println("Purchasing on Amazon");
            try {
                Thread.sleep(5000);
            } catch (Exception e) {}

        }
        @Test(dependsOnMethods = {"login"})
        public void addToCart()
        {
            System.out.println("Added to Cart on Amazon");
            try {
                Thread.sleep(5000);
            } catch (Exception e) {}

        }
        @Test(dependsOnMethods = {"purchase"})
        public void makePayment()
        {

        }



}
