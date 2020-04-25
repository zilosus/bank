package banking;

import java.util.HashSet;
import java.util.Set;

public class Customer {
    private String firstName = "";
    private String lastName = "";
    Set<String> acct = new HashSet<>();
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

    public int getAccount(){
        for(int i = 0; i < acct.size(); i++){
            System.out.println(i);
        }
        return 0;
    }

    public void addAccount(String Account){
        acct.add(Account);
    }

    public int getNumOfAccounts(){
        return acct.size();
    }

}
