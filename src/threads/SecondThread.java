package threads;

/**
 * Created by ovidiu on 16-Feb-17.
 */
public class SecondThread extends Thread {
    @Override
    public void run() {
        for(int i=0; i<50; i++){
            System.out.println("In Second thread: "+i);
        }
        //  super.run();
    }
}
