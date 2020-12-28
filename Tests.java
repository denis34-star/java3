package lesson7;

public class Tests {
    @BeforeSuite
    public void before() {
        System.out.println("before");
    }
    @Test(priority = 4)
    public void method1() {
        System.out.println("method1 : priority 4");
    }
    @Test(priority = 2)
    public void method2() {
        System.out.println("method2 : priority2");
    }
    @Test(priority = 6)
    public void method3() {
        System.out.println("method3 : priority 6");
    }
    @Test(priority = 6)
    public void method4() {
        System.out.println("method4 : priority 6");
    }
    @Test(priority = 3)
    public void method5() {
        System.out.println("method5 : priority 3");
    }
    @Test(priority = 0)
    public void method6() {
        System.out.println("method6 : priority 5  default");
    }
    @AfterSuite
    public void after() {
        System.out.println("after");
    }
}
