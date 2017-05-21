import java.util.Scanner;

/**
 * Created by DIPAK on 2/26/2017.
 */
public class OddEven1
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter any number:");
        int num= scan.nextInt();
        int result =num%2;
        System.out.println(result);
        if (num < 0)
        {
            System.out.println("Invaid number");
        }
        if (result==00)

        {
            System.out.println("Number is even");
        }
        else

        {
            System.out.println(" Number is odd");
        }


    }
}
