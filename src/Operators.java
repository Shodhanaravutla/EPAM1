public class Operators {
    public static void main(String[] args) {
        int a= 10;
        int b =5;
        // unary operators
        System.out.println(a++);//10 (11)
        System.out.println(++a);//12
        System.out.println(a--);//12 (11)
        System.out.println(--a);//10
        //Arithmetic Operators
        System.out.println(a+b);//15
        System.out.println(a-b);//5
        System.out.println(a*b);//50
        System.out.println(a/b);//2
        System.out.println(a%b);//0
        //Left Shift Operator
        System.out.println(10<<2);
        //Right Shift Operator
        System.out.println(10>>2);
        // logical and bitwise operators
        int c=20;
        System.out.println(a<b&&a<c);//false && true = false
        System.out.println(a<b&a<c);//false & true = false
    }
}
