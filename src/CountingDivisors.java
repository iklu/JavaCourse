import java.util.Scanner;

/**
 * Created by ovidiu on 07-Jan-17.
 */
public class CountingDivisors {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter a positive number = ");

        int N = console.nextInt();

        while(true){
            if(N>0){
                break;
            }
            System.out.print("Is not a positive number, enter new = ");
            N = console.nextInt();
        }

        int divisorCounter = 0;

        for (int i = 1; i < N; i++){
            if(N%i==0){
                divisorCounter++;
            }
        }







    }

}
