/**
 * Modify the previous program such that only multiples of three or five are considered in the sum, e.g. 3, 5, 6, 9, 10, 12, 15 for n=17
 * Created by nina on 11.12.2016.
 */
public class SumMultiple {
    public static void main(String args[]){
        int n = 17;
        for(int i=1; i<n; i++){
            if(i%3==0){
                System.out.print(i +" ");
            } else if(i%5 == 0) {
                System.out.print(i +" ");
            }
        }
    }
}
