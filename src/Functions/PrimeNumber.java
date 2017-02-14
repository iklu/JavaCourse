package Functions;

import java.util.Scanner;

/**
 *
 * Sum only the prime numbers
 * Created by nina on 13.12.2016.
 */
public class PrimeNumber {
    public static void main(String args[]){
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        isNumberPrime(n);

        int contor = 0;
        int sum = 0;
        int number=1;

        while(contor < n){
            if(isNumberPrime(number)){
                sum+=number;
                contor++;
            }
            number++;
        }
        System.out.print(sum);
    }

    public static boolean isNumberPrime(int number){
        for(int i=2; i< number; i++){
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
