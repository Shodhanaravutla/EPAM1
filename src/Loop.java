import java.util.Scanner;
public class Loop {
    /*public static void main(String[] args )
    {
        Scanner s = new Scanner(System.in);
        int i;
        System.out.println("enter i value :");
        i=s.nextInt();

        while(i<=5)
        {
            System.out.println("HELLO!");
            i=i+1;
        }
    }*/
    /*public static void main(String[] args )
    {
        Scanner s = new Scanner(System.in);
        int i;
        System.out.println("enter i value :");
        i=s.nextInt();
        for(int j=i;j<10;j++)
        {
            System.out.println("HELLO!");
            //i=i+1;
        }
    }*/
    public static void main(String[] args )
    {
        Scanner s = new Scanner(System.in);
        int i;
        System.out.println("enter i value :");
        i=s.nextInt();

        do
        {
            System.out.println("HELLO!");
            i=i+1;
        }while(i<=5);
    }

}
