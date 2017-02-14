package OOP;

/**
 * Created by nina on 20.12.2016.
 */
public class MainReferences
{


    public static void main(String[] args) {
        Planet a = new Planet(10, 20);
        Planet b = new Planet(30, 40);

        Planet c = a;

        c.mass = 17;

        a.next = b;

        double d = b.next.mass;

        System.out.println("A = " +a);
        System.out.println("B = " +b);
        System.out.println("C = " +c);

        System.out.println(

        );
    }
}
