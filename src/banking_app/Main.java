package banking_app;

import java.util.List;

/**
 * Created by ovidiu on 02-Feb-17.
 */
public class Main {
    public static void main(String[] args) {

        AccountHolder john = new AccountHolder("john Doe");

        Account currAccount = new Current("John current account", 100, "RO123", false);
        Account AliceSavings = new Saving("Alice saving account", 255, "RO52550", 15.00);
        Account TomSavings = new Saving("Tom saving account", 565656, "RO646555", 80.00);

        Account currAccount2 = new Current("John second current account", 665656, "RO12dfdf3", false);


        john.addAccount(currAccount);
        john.addAccount(AliceSavings);
        john.addAccount(TomSavings);
        john.addAccount(currAccount2);

        john.print();
    }
}
