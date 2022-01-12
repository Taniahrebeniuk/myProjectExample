package org.myProject;

import org.testng.annotations.*;

public class FirstTest {

    @BeforeGroups
public void beforeGroups() {
        System.out.println("Before groups");
    }
    @BeforeMethod
    public void beforeMethodPrecondition() {
        System.out.println("This is before method");
    }

    @Test (groups = "smoke", dataProvider = "" )
    public void testSomeTest1() {
        System.out.println("Hello World1!");
    }

    @Test(groups = "smoke")
    public void TestSomeTest2() {
        System.out.println("Hello World2!");
    }

    @Test(groups = "smoke")
    public void TestSomeTest3() {
        System.out.println("Hello World3!");
    }

    @AfterMethod
    public void AfterMethodPostcondition() {
        System.out.println("This is after method");

    }
@AfterGroups
    public void AfterGroups() {
    System.out.println("After groups");
}
}