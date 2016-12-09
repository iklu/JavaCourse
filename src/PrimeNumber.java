import java.util.Scanner;

/**
 * Created by nina on 08.12.2016.
 */
public class PrimeNumber {
    public static void main(String args[]){

        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        checkifprime(n);

    }

    public static void checkifprime(int n) {

        for (int i = 2; i < n; i++) {
            boolean isPrime = check(i);
            if (isPrime)
                System.out.println( " " +i + " ");
        }
    }

    public static boolean check(int i){

        boolean isPrime = true;

        for (int j = 2; j < i; j++) {
            System.out.println(i + "%" +j + " = " + i%j);
            if (i % j == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
}
