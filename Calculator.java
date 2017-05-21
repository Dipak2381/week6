import java.util.concurrent.Callable;

/**
 * Created by DIPAK on 2/18/2017.
 */
public class Calculator {

    int ans;

    public void addition(int a, int b) {
        ans = a + b;
        System.out.println("The addition of " + a + " + " + b + " = " + ans);
    }

    public void subtraction(int a, int b) {
        ans = a - b;
        System.out.println("The subtraction of " + a + " - " + b + " = " + ans);
    }

    public static void multiplication(double a, double b) {     //alternative method to called instances varible t
        // static method via object create,
                                                                //Calculator t = new Calculator();
                                                                //t.multiplication(a:10 b:10);
                                                                //System.out.println
                                                                 // ("The t.multiplication of " + a + " * " + b + " = " + result);

        double result;
        result = a * b;
        System.out.println("The multiplication of " + a + " * " + b + " = " + result);
    }

    public static void division(double a, double b) {
        double result;
        result = a / b;
        System.out.println("The division of " + a + " / " + b + " = " + result);
    }

    public static void main(String args[]) {
        Calculator add = new Calculator();// instant variable/method called by object name
        add.addition(10, 10);
                                            // instant variable/method called by object name
        add.subtraction(20, 10);
        Calculator.multiplication(6, 7);//static variable/method called by .class name
        Calculator.division(5, 2);//static variable/method called by .class name


    }


    }

