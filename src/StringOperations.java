import java.util.Scanner;

/**
 * Created by nina on 18.12.2016.
 */
public class StringOperations {
    public static void main(String args[]){
        Scanner console = new Scanner(System.in);

        System.out.print("Introduce a word: ");
        String s1 = console.nextLine();

        String s2 = "cuvant";

        if(s1.equals(s2)){
            System.out.printf("String %s and %s are equals."  ,s1,s2);
        }

        System.out.println();

        s2 = "Cuvant";

        if(s1.equalsIgnoreCase(s2)){
            System.out.printf("String %s and %s are equals."  ,s1,s2);
        }

        System.out.println();

        int n =3;

        System.out.println("Char at position "+n+" is "+s1.charAt(n));

        System.out.println("The length of the word "+s1+" is " +s1.length());

        int n1=2;
        int n2 =4;

        String substr = s1.substring(n1,n2);

        System.out.println("Substring "+s1+" from "+n1+ " to "+n2+ " is "+substr);

        s2 = "In propozitia asta se gaseste cuvantul asta";

        System.out.println("Index of" + s2.indexOf(s1));

        //compared to
        System.out.println(s1.compareTo(s2));
    }
}
