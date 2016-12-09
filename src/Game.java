import java.util.Scanner;

/**
 * Created by nina on 08.12.2016.
 */
public class Game {
    public static void main(String args[]){
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();

        int ok = 7;



        for(int i=0; i<ok; i++){
            if(n<i){
                System.out.print("number to small");
            } else {
                System.out.print("number to big");
            }

        }
    }

}
