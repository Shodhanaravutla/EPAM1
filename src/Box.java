import java.util.Scanner;

public class Box {
    /*Box(int l,int b,int h)
    {
        System.out.println("volume:"+(l*b*h));
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter length breadth and height of box:");
        int l=s.nextInt();
        int b=s.nextInt();
        int h=s.nextInt();
        Box ob= new Box(l,b,h);
    }*/
    Box()
    {
        System.out.println("enter length breadth and height of box:");
        int l=10;
        int b=20;
        int h=30;
        System.out.println("volume:"+(l*b*h));
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        Box ob= new Box();
    }

}
