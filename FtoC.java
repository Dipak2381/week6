/**
 * Created by DIPAK on 2/19/2017.
 */
public class FtoC {

    //C : ( f-32)*5/9

    public void temp(int f) {
        double c;

        c = (f - 32) * 5 / 9;

        System.out.println("If Temp " + f + " F = " + c + " C ");
    }
       public static void main(String args[]){
        FtoC temp1 = new FtoC();
        temp1.temp(200);
    }

}
