package threads;

/**
 * Created by ovidiu on 16-Feb-17.
 */
public class Test {
    public static void main(String[] args) {

        System.out.println("Start of main method.");

        MyThread myThread = new MyThread();
        myThread.start();

        SecondThread secondThread = new SecondThread();
        secondThread.start();


        System.out.println("End of main method");
    }
}
