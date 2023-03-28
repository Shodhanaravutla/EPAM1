import java.util.Scanner;

public class Exception {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter n value:");
        int n=sc.nextInt();
        try
        {
            int d=n/0;
        }
        catch(java.lang.Exception e)
        {
            System.out.println("arithmetic Exception");
        }
        System.out.println("try catch block");
    }
}
