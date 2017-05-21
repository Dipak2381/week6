

import java.util.Scanner;

/**
 * Created by DIPAK on 2/27/2017.
 */
public class Mark
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number");
        int n = s.nextInt();
        int i, j;

      for (i=1; i<=n;i++)
      {

           for (j=1; j<=n; j++)
           {
               if(j<=i)
           System.out.print("*");
           }
          System.out.println(" ");
       }



    }
}