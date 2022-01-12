package org.myProject;
import org.testng.annotations.*;


public class AnnotationsTest {

    @BeforeSuite
    public void BeforeSuite() {
        System.out.println("BeforeSuite");
    }

    @BeforeTest
    public void BeforeTest() {
        System.out.println("BeforeTest");
    }

    @BeforeClass
    public void BeforeClass() {
        System.out.println("BeforeClass");

    }

    @BeforeGroups("SMOKE")
    public void beforeGroups() {
        System.out.println("BeforeGroups");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BeforeMethod");

    }

    @Test(groups = "feature")
    public void runTest1() {
        System.out.println("Test - runtest1");
}
    @AfterMethod
    public void afterMethod() {
        System.out.println("AfterMethod");

    }

    @AfterGroups("SMOKE")
    public void afterGroups() {
        System.out.println("AfterGroups");
    }

    @AfterClass

    public void AfterClass() {
        System.out.println("AfterClass");
    }

    @AfterTest(groups = "feature")
    public void runTest2() {
        System.out.println("Test - runtest2");

    }

    @AfterSuite
    public void AfterSuite() {
        System.out.println("AfterSuite");
    }
}