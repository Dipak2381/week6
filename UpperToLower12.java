import java.util.Scanner;

/**
 * Created by DIPAK on 2/27/2017.
 */
public class UpperToLower12
{
    public static void main(String[] args)
    {
        Scanner s =new Scanner(System.in);
        System.out.println("INPUT ANY ALPHABET IN UPPER CASE:");
        String name = s.next();

        String result=name.toLowerCase();

        System.out.println(result);
    }
}
