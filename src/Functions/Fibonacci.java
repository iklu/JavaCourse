package Functions;

/**
 * Created by nina on 13.12.2016.
 */
public class Fibonacci {
    public static void main(String args[]){

    }

    public static int fibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }
}
