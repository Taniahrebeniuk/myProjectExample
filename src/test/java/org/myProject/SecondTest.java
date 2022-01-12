package org.myProject;

import org.testng.annotations.Test;

public class SecondTest {

    @Test(groups = "sanity")
    public void testSomeTest4() {
        System.out.println("Hello World4!");
    }

    @Test(groups = "sanity")
    public void TestSomeTest5() {
        System.out.println("Hello World5!");
    }

    @Test(groups = "sanity")
    public void TestSomeTest6() {
        System.out.println("Hello World6!");
    }
}
