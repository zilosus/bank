package banking;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Customer {
    private String firstName = "";
    private String lastName = "";
    private List acct = new ArrayList();
   // private Account acct;


    public Customer(String f, String l){
        firstName = f;
        lastName = l;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount(int account_index) {
        return (Account) acct.get(account_index);
    }

    public void addAccount(Account Account){
        acct.add(Account);
    }

    public int getNumOfAccounts(){
        return acct.size();
    }

    public Iterator getAccounts() {
        return acct.iterator();
    }
}
