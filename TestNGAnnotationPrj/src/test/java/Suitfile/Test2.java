package Suitfile;

import org.testng.annotations.*;

public class Test2 {
    @BeforeSuite
    public void method5()
    {
        System.out.println("Before Suite");
    }
    @BeforeClass
    public void method3()
    {
        System.out.println("Before Class in Test2");
    }
    @Test(priority = 1)
    public void two()
    {
        System.out.println("Test2 method name two");
    }
    @AfterClass
    public void method4()
    {
        System.out.println("After Class in Test2");
    }
    @AfterSuite
    public void method6()
    {
        System.out.println("After Suite in Test2");
    }

}
