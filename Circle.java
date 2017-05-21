/**
 * Created by DIPAK on 2/19/2017.
 */
public class Circle {


    static final double PI = 3.14;

    public void radius(double r) {

        double area;
        area = PI * r * r;

        System.out.println("If radius " +r+ " Then Area= " + area);
    }

        public static void main(String args[]) {

        Circle c1 = new Circle();
        c1.radius(2.0);
    }
}

