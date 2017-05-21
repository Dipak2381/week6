/**
 * Created by DIPAK on 2/19/2017.
 */
public class Smallest

{

    public static void number(int a,int b,int c)
    {

        if (a< b & a < c)

            System.out.println(" the smallest no " + a);
        else if (b < a & b < c)

            System.out.println(" the smallest no " + b);
        else if (c < a & c < b)
            System.out.println(" the smallest no " + c);
    }

    public static void main (String args [])
    {
        Smallest.number( 10,20,30);
    }


}
