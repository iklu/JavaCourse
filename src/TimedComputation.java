/**
 * Created by nina on 11.12.2016.
 */
public class TimedComputation {
    public static void main(String args[]){
        long startTime;
        long endTime;
        double time;

        startTime = System.currentTimeMillis();

        double width, height, hypotenuse;

        width = 42.0;
        height = 17.0;
        hypotenuse = Math.sqrt(width*width + height*height);
        System.out.print("A triangle with sides 42 adn 17 has the hypotenuse ");
        System.out.print(hypotenuse);

        System.out.println("\nMathematically, sin(x)*sin(x) +" + "cos(x)*cos(x) -1 should be 0");
        System.out.println("Let's check this for x = 1:");

        endTime = System.currentTimeMillis();
        time = (endTime - startTime) / 1000.0;
        System.out.print("\nRun time in seconds was: ");
        System.out.println(time);
    }
}
