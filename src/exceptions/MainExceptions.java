package exceptions;

import java.io.IOException;
import java.util.Scanner;

public class MainExceptions {

    public static void main(String[] args) throws Exception{

        double a;
        double b;
        double rez;
        int n=5;

        try{

            Scanner s = new Scanner(System.in);

            //a
            System.out.print("a=");
            String aString = s.next();
            a = isNumber(aString);

            //b
            System.out.print("b=");
            String bString = s.next();
            b = isNumber(bString);

            //operation a and b
            System.out.print("op=");
            String op = s.next();

            Integer.toString(n*n).length();

            rez = evaluate(a,b, op);
            System.out.println("Rez=" + rez);

        }catch (IllegalArgumentException e){
            System.out.print(e.getMessage());
        }
    }

    /**
     *
     *
     * @param a
     * @param b
     * @param op
     * @return
     */
    public static double evaluate(double a , double b, String op){

        double rez = 0;

        if ("+".equals(op)) {
            rez=   a + b;
        } else if ("-".equals(op)) {
            rez = a - b;
        } else {
            throw new IllegalArgumentException("Operatorul " + op + " nu este recunoscut");
        }
        return rez;
    }

    /**
     *
     * @param input
     * @return
     */
    public static double isNumber(String input){
        for( int i=0; i<input.length(); i++ ) {
            if(  !Character.isDigit(input.charAt(i))) {
               throw new IllegalArgumentException("Textul "+ input+ " nu este un numar.");
            }
        }
        return Double.parseDouble(input);
    }
}