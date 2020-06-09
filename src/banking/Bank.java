package banking;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Bank {


    private static final Bank bankInstance = new Bank();
    public static Bank getBank(){
        return bankInstance;
    }
    private static final double SAVINGS_RATE = 3.5;

    private List customers = new ArrayList();


    private Bank(){

    }

    public void addCustomer(String f, String l){
        customers.add(new Customer(f, l));
    }

    public Customer getCustomer(int customer_index) {
        return (Customer) customers.get(customer_index);
    }

    public int getNumberOfCustomers(){
        return customers.size();
    }

    public Iterator getCustomers() {
        return customers.iterator();
    }

}
