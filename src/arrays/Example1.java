package arrays;

/**
 * Created by ovidiu on 08-Jan-17.
 */
public class Example1 {
    public static void main(String[] args) {
        int[] A;

        A = new int[5];

        double total;
        double average;
        int i;
        total = 0;
        for(i = 0; i< A.length; i++){
            total = total + A[i];
            System.out.println(total);
        }

    }
}
