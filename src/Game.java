import java.util.Scanner;

/**
 * Created by nina on 08.12.2016.
 */
public class Game {
    public static void main(String args[]){
        Scanner console = new Scanner(System.in);
        int n = 1;
        int ok = 7;
        int i = 1;
        while(true){
            System.out.print("Enter a number:");
            n = console.nextInt();
            i++;
            if(n<ok){
                System.out.println("number to small");
            } else if(n>ok) {
                System.out.println("number to big");
            } else if(n == ok) {
                System.out.println("Right number");
                System.out.println("Retries = " + i);
                break;
            }
        }
    }

}
