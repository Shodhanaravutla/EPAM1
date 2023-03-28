public class Simple {
     public double volume (int l,int b,int h)
    {
        double volume= l*b*h;
        return volume ;
    }
    public static void main(String[] args) {

        Simple box=new Simple();
       double  volume= box.volume(10,10,30);
       if(volume>5000)
       {
           System.out.println("volume is greater than 5000");
       }
        else if(volume==6000)
        {
            System.out.println("volume is equal to 6000");
        }
        else if(volume == 3000)
       {
           System.out.println("volume is equal to 3000");
       }
        else
           System.out.println("volume is less than 5000");
    }
}
