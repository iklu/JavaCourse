import java.util.Scanner;

/**
 * Created by nina on 11.12.2016.
 */
public class MathOperations {
    public static void main(String args[]){

        Scanner console = new Scanner(System.in);

        System.out.print("Radical din ");
        double x = console.nextDouble();

        System.out.println(" este "+Math.sqrt(x));

        System.out.println("Valoare absoluta :");

        System.out.println(" este "+Math.abs(x));

        System.out.println("x ridicat la 2");
        System.out.print(Math.pow(x, 2));
    }
}
