import java.util.Scanner;

/**
 * Created by DIPAK on 2/25/2017.
 */
public class Test2
     {
        public static void t2()
        {
            Scanner scan = new Scanner(System.in);
           System.out.println("please enter any number=");
           int num= scan.nextInt();
            int result =num%2;
            System.out.println(result);
           if (num < 0)
           {
               System.out.println("invaid number");
           }
              if (result==00)

                   {
                    System.out.println(" the number is even=");
                   }
                     else

                   {
                    System.out.println("The number is odd=");
                   }

     }

     public static void main(String[] args)
     {
         Test2.t2();
     }
}