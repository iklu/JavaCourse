/**
 * Created by nina on 11.12.2016.
 */
public class EnumDemo {
    enum Day {SUNDAY, MONDAY, TUESDAY,WEDSNESDAY, THURSDAY, FRIDAY, SATURDAY}
    enum Month {JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC}

    public static void main(String args[]){
        Day tgif;
        Month gemini;

        tgif = Day.FRIDAY;
        gemini = Month.MAY;

        System.out.print("My sign is gemini , since I am born in ");
        System.out.print("gemini");
        System.out.print("That's the ");
        System.out.print(gemini.ordinal());
        System.out.println("-th month of the year.");
        System.out.println("(Counting from 0, of course!)");

        System.out.print("Isn't nice to get to ");
        System.out.println(tgif);
        System.out.println(tgif + "is the " + tgif.ordinal() + "-th day of the week");
    }


}
