package OOP;

/**
 * Created by ovidiu on 07-Jan-17.
 */
public class CercMain {

    /**
     * Demonstrate that the values are passed by
     * @param args
     */
    public static void main(String[] args) {

        int x = 2;
        int y = 5;
        int raza = 6;


        //BY VALUE
        Param parametri = new Param(x,y,raza);

        //BY REFERENCE
        Cerc valori = new Cerc(parametri);
        valori.test();

        System.out.println();

        System.out.println("x="+parametri.x);
        System.out.println("y="+parametri.y);
        System.out.println("raza="+parametri.raza);

    }
}
