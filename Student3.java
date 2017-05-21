import java.util.Scanner;

/**
 * Created by DIPAK on 2/26/2017.
 */
public class Student3
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Name:");
        String name = s.nextLine();

        System.out.println("Rollno:");
        int roll = s.nextInt();

        System.out.println("sub(1)");
        int mark1 = s.nextInt();

        System.out.println("sub(2)");
        int mark2 = s.nextInt();

        System.out.println("sub(3)");
        int mark3 = s.nextInt();

        int total = mark1+mark2+mark3;
        double per = total/3;

      if(mark1 < 0 && mark2 <0 && mark3 <0)
      {
          System.out.println("Mark should between 0 to 100 ");
      }else {
          System.out.println("===================");
          System.out.println("MARK SHEET");
          System.out.println("===================");
          System.out.println("Name:"+name);
          System.out.println("===================");
          System.out.println("Rollno:"+roll);
          System.out.println("===================");
          System.out.println("English: "+mark1);
          System.out.println("Maths:"+mark2);
          System.out.println("Gujarati:"+mark3);

          System.out.println("total Mark:"+total);
          System.out.println("===================");
          System.out.println("per:"+per);
          System.out.println("===================");

          if (per >= 80) {
              System.out.println("Gread:A+");

          } else if (per >= 60) {
              System.out.println("Gread:A");
          } else if (per >= 50) {
              System.out.println("Gread:B");
          } else if (per >= 35) {
              System.out.println("Gread:c");
          } else {
              System.out.println("Reasult:Fail");
          }
          System.out.println("===================");
      }
    }
}
