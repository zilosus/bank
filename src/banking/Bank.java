package banking;
import java.util.Set;
import java.util.HashSet;

public class Bank {

    Set<String> customers = new HashSet<>();

    public Bank(){
        customers.add("Jan1 Kowalski1");
        customers.add("Jan1 Kowalski2");
        customers.add("Jan1 Kowalski3");
        customers.add("Jan1 Kowalski4");
        customers.add("Jan1 Kowalski5");
    }

    public void addCustomer(String f, String l){
       customers.add(f+" "+l);
    }

    public void getCustomer(){
        System.out.println(customers);
    }

    public int getNumberOfCustomers(){
        return customers.size();
    }

}
