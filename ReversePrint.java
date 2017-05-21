/**
 * Created by DIPAK on 2/20/2017.
 */
public class ReversePrint {

    public static void main(String[] args) {

        String text = "1234567";

        for (int i = (text.length() - 1); i >= 0; i--) //for loop and while method

            System.out.print(text.charAt(i));
    }

}
