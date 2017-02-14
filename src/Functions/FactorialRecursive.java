package Functions;

/**
 * Created by nina on 13.12.2016.
 */
public class FactorialRecursive {
    public static void main(String args[]){
        System.out.print(factorial(5, 1));
    }

    public static int factorial(int number, int fact){
        if(number == 1){
            return fact;
        }

        int incr = number-1;

       return factorial(incr, fact*number);
    }
}
