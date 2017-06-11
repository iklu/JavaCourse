package arrays;

/**
 * Created by ovidiu on 08-Jan-17.
 */
public class TwoDimensionalArrays {

    public static void main(String[] args) {
        double totalProfit;
        double[][]  profit;
        profit = new double[25][12];
        int store,month;
        totalProfit = 0;
        for(store = 0; store < 12; store++){
            for(month = 0; month < 12; month++){
                totalProfit = profit[store][month];
                System.out.println(totalProfit);
            }
        }
    }
}
