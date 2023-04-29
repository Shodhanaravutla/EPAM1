public class ImpInterface {
    public static void main(String[] args) {
        TestInterface testInterface=(str,value )->
        {
            System.out.println(str);
            System.out.println(value);
        };
        testInterface.testMethod("Automation", 50);
    }
    // old method(java 7)
   /* public void testMethod()
    {
        System.out.println("test");
    }*/
}
