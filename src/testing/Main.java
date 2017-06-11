package testing;

/**
 * Created by ovidiu on 16-Feb-17.
 */
public class Main
{
    static {
        System.out.print("A");
    }

    {
        System.out.print("B");
    }

    static {
        System.out.print("C");
    }

    {
        System.out.print("D");
    }

    public static void main(String[] args) {
        System.out.print("F");
        Main m = new Main();
    }


}
