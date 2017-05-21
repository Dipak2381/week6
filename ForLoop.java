import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by DIPAK on 2/25/2017.
 */
public class ForLoop
{
    public static void main(String args[])
    {
        for (int i = 1; i <=5 ; i++)
        {
            System.out.println();
            for (int j = 1; j <=i ; j++)
            {
                System.out.print(j);
            }
        }

    }

}
