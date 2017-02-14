import java.util.Scanner;

/**
 * Created by nina on 11.12.2016.
 */
public class PowerOfTwo {
    public static void main(String args[]){

        Scanner console = new Scanner(System.in);

        int n = console.nextInt();

        for(double i = 2; i< n; i++){
            for(double j = 2; j < i; j++){
                if(i/j==j){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
