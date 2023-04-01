package javaclasses;

public class ConstructorsDemo {
    public  ConstructorsDemo()
    {
     System.out.println("NO arg Constructor");
    }
    // if we create same method as name as same above(public  ConstructorsDemo()) then it shows you the error ->constructor overloading

    public ConstructorsDemo(String name)
    {
        this();//inside the argument constructor we are reading the non argument  constructor
        System.out.println("Arg Constructor");

    }
    public static void main(String[] args)
    {
        ConstructorsDemo constructorsDemo=new ConstructorsDemo("java");
        //ConstructorsDemo constructorsDemo1=new ConstructorsDemo();
    }
}
