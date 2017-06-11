package threads;

/**
 * Created by ovidiu on 16-Feb-17.
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        for(int i=0; i<=50; i++){
            if(i%10 == 0){
                System.out.println("In my thread: "+i);
            }

            try {
                Thread.sleep(100);

            } catch (InterruptedException e){

            }
        }
        //  super.run();
    }
}
