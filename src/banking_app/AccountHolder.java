package banking_app;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ovidiu on 02-Feb-17.
 */
public class AccountHolder implements Printable {
    private String name;
    private List<Account> accounts;

    public AccountHolder(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public void addAccount(Account account) {

        if (accounts == null) {
            accounts = new ArrayList<>();
        }
        if(alreadyHasCurrentAccount(account))
            throw new OnlyOneCurrentAccountException("You are allowed to have only one current account!!");

        accounts.add(account);
    }

    private boolean alreadyHasCurrentAccount(Account account) {
        if(account instanceof Current){
            for (Account a : accounts) {
                if(a instanceof Current){
                    return true;
                }
            }
        }
        return false;
    }

    public void print() {
        System.out.println("Name " + getName()+ "\n");
        for (Account a : accounts) {
            a.print();
            System.out.println();
        }
    }

}
