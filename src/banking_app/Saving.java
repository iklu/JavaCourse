package banking_app;

/**
 * Created by ovidiu on 02-Feb-17.
 */
public class Saving extends Account implements Printable {
    private double interest;

    public Saving(String description, double balance, String IBAN, double interest) {
        setDescription(description);
        setBalance(balance);
        setIBAN(IBAN);
        setInterest(interest);
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }
    public void print(){
        System.out.print(
                "Description = " + getDescription() + "\n" +
                        "IBAN = " + getIBAN() + "\n" +
                        "Balance = " + getBalance() + "\n" +
                        "Overdraft = " + getInterest() + "\n"
        );
    }
}
