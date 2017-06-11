package OOP;

/**
 * Created by ovidiu on 07-Jan-17.
 */
public class Cerc {
    int x, y , raza;

    public Cerc(Param param) {
        param.x = 200;
        param.y = 55;
        param.raza = 6666;


    }

    public void test(){
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("raza="+raza);
    }
}
