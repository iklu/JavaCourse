package banking_app;

/**
 * Created by ovidiu on 02-Feb-17.
 */
public class Current extends Account implements Printable{
    private boolean overdraft;

    public Current(String description, double balance, String IBAN, boolean overdraft) {
        setDescription(description);
        setBalance(balance);
        setIBAN(IBAN);
        setOverdraft(overdraft);
    }

    public boolean isOverdraft() {
        return overdraft;
    }

    public void setOverdraft(boolean overdraft) {
        this.overdraft = overdraft;
    }
    public void print(){
        System.out.print(
           "Description = " + getDescription() + "\n" +
           "IBAN = " + getIBAN() + "\n" +
           "Balance = " + getBalance() + "\n" +
           "Overdraft = " + isOverdraft() + "\n"
        );
    }
}
