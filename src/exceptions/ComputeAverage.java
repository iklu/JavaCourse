package exceptions;

import java.util.Scanner;

/**
 * Created by ovidiu on 08-Jan-17.
 */
public class ComputeAverage
{
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String str; //user input;
        double number;
        double total = 0;
        double avg;
        int count = 0;
        System.out.println("Enter your number, press return to end.");
        while(true){
            System.out.print("? ");
            str = console.nextLine();
            if(str.equals("")){
                break;
            }
            try{
                number = Double.parseDouble(str);
                total = total + number;
                count = count + 1;
                System.out.println("Total = " + total );
            }catch(NumberFormatException e){
                System.out.println("Not a legal number! Try again.");
            }

        }

    }
}
