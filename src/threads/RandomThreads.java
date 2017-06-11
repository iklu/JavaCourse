package threads;

/**
 * Created by ovidiu on 16-Feb-17.
 */
public class RandomThreads extends Thread{
    @Override
    public void run() {
        for(int i=0; i<5; i++){

            try {
                Thread.sleep(100);

            } catch (InterruptedException e){

            }
        }
        //  super.run();
    }
}
