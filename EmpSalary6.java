import java.util.Scanner;

/**
 * Created by DIPAK on 2/26/2017.
 */
public class EmpSalary6
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Employer  Id Number:");
        int a = s.nextInt();

        System.out.println("Employer  Name:");
        String b = s.nextLine();

        System.out.println("Employer  Salary:");
        double c = s.nextDouble();

        double hra = c*10/100;
        double da = c*8/100;
        double ta = c*9/100;
        double pf = c*20/100;

         double d = (hra+da+ta-pf);
         double ts;
         ts =c+d;
       // System.out.println("gross salary=");
        System.out.println("gross salary: " +ts);

    }
}
