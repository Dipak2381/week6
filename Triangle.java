/**
 * Created by DIPAK on 2/19/2017.
 */
public class Triangle {

    public static void area( double b, double h){
        double a;
        a = (h*b)/2;

        System.out.println("if height H="+h+" and the base B="+b+ " of the triangle A= " +a);

    }
    public static void main(String args[]) {
        Triangle.area(5,7);// static to static called to .class name
    }


}
