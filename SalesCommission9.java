import java.util.Scanner;

/**
 * Created by DIPAK on 2/26/2017.
 */
public class SalesCommission9
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Sales Id no:");
        int num = s.nextInt();

        System.out.println("Sales Name:");
        String num1 = s.nextLine();

        System.out.println("Sales Amount:");
        int num2 = s.nextInt();

        if (num2 >= 50000)
        {
            System.out.println(num2 * 35 / 100);
        } else if (num2 >= 30000)
            {
            System.out.println(num2 * 20 / 100);

            } else if (num2 >= 20000)
                {
                  System.out.println(num2 * 10 / 100);

                 } else if (num2 >= 10000)
                         {
                          System.out.println(num2 * 5 / 100);

                         } else
                               {
                                System.out.println(num2 * 2 / 100);
                                }


    }
}
