import java.util.Scanner;

/**
 * Created by DIPAK on 2/25/2017.
 */
public class TestIfElse
{
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
      //  String name=scanner.nextLine();
     //   String village=scanner.
       Scanner country = new Scanner(System.in);
        System.out.println("please enter city name=");
        String cityName = country.nextLine();

        if (cityName.equals("London"))
            {
            System.out.println("IM IN UK");
            } else if (cityName.equals("tokyo"))
             {
             System.out.println("IM IN JAPAN");
             }else if (cityName.equals("new york"))
                 {
                  System.out.println("usa");

                  }else if(cityName.equals("new delhi"))
                   {
                       System.out.println("india");

                    }else

        System.out.println("wrong cityname or country is not in nato");
    }
}
