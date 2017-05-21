import java.util.Scanner;

/**
 * Created by DIPAK on 2/27/2017.
 */
public class TypeAnyTwoNumber13
{
    public static void main(String[] args)
    {
        Scanner s =new Scanner(System.in);
        System.out.println("Type any two number");
        int num1 = s.nextInt();
        System.out.println();
        int num2 =s.nextInt();
        System.out.println();
        System.out.println("Enter any symbol(+ - * / :");
        char s1 = s.next().charAt(0);

        if (s1=='+')
            {
            int add = num1+num2;
            System.out.println(add);
            }else if (s1=='-')
                 {
                int sub =num1-num2;
                System.out.println(sub);
                }else if (s1=='*')
                    {
                        int devi =num1*num2;
                        System.out.println(devi);
                    }else if (s1=='/')
                       {
                           int multi = num1/num2;
                           System.out.println(multi);
                       }else
                           {
                              System.out.println("Invalid symbol");
                            }




    }
}
