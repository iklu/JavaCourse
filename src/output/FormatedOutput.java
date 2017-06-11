package output;

/**
 * Created by ovidiu on 08-Jan-17.
 */
public class FormatedOutput {


    public static void main(String[] args) {
        double money = 25;

        //float with FORMAT SPECIFIER : "%1.5f"
        System.out.printf("%1.5f", money);

        int number  = 6;

        //add 3 spaces before Integer FORMAT SPECIFIER
        System.out.printf("%3d", number);
        //add 3 spaces after
        System.out.printf("%-3d", number);
        System.out.printf("%d", number);

        String word = "panhouse";

        //This format specifier can be use with any value type
        //The number 20 from the FORMAT SPECIFIER represents the minimum characters if not satisfied spaces will be included
        System.out.printf("Where is the  %20s", word);




    }
}
