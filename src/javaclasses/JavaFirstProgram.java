package javaclasses;

import java.util.List;

public class JavaFirstProgram {
    public  String studentName="Java",studentAddress;
    public  static   double totalAverege=1.0;
    public final int MAX_ROOM_CAPACITY;//when we use final keyword then the declaration should be in uppercase
    JavaFirstProgram()
    {
        MAX_ROOM_CAPACITY=100;
    }
    static public void main(String[] testAutomation)
    {
       int studentNo= 30;//local variable
        System.out.println("Hello Java");

    }
}
// local variables under stack area
// heap
// class and static