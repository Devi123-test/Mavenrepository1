package Suitfile;

import org.testng.annotations.*;

public class Test1 {

    @BeforeClass
    public void method5()
    {
        System.out.println("Before class in Test1");
    }

    @BeforeTest
    public void method3()
    {
        System.out.println("Before Test");
    }


    @BeforeMethod
    public void method1()
    {
        System.out.println("Before Method");
    }
    @Test (priority = 1)
    public void two()    { System.out.println("Test two executed ");    }

    @Test (priority = 2)
    public void one()
    {
        System.out.println("Test one executed ");
    }
    @Test (priority = 3)
    public void aone()
    {
        System.out.println("Test aone executed ");
    }

    @AfterMethod
    public void method2()
    {
        System.out.println("After Method");
    }
    @AfterTest
    public void method4()
    {
        System.out.println("After Test");
    }

    @AfterClass
    public void method6()
    {
        System.out.println("After Class in Test1");
    }


}
