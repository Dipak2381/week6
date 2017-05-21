import java.util.Scanner;

/**
 * Created by DIPAK on 3/3/2017.
 */
public class Mark1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter no:");
        int n = s.nextInt();
        int i, j;
        for (i = 1; i <= n; i++) {

            for (j = 1; j <= n; j++)
            {
             if(i==1||i==n||j==1||j==n)
                System.out.print("*");
              else
                 System.out.print(" ");
            }
            System.out.println();
        }
    }
}