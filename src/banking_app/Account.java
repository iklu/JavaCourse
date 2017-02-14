package banking_app;

/**
 * Created by ovidiu on 02-Feb-17.
 */
public abstract class Account implements Printable{

    private String IBAN;
    private double balance;
    private String description;

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
