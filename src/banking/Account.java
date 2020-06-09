package banking;

public class Account {
    protected double balance = 0;

    public Account(double init_balance){
        balance = init_balance;
    }

    public double getBalance(){
        return balance;
    }

    public boolean deposit(double amt){
        if (amt >= 0){
            balance += amt;
            return true;
        }
        else{
            return false;
        }
    }

    public void withdraw(double amt) throws OverdraftException {
        if (amt <= balance){
            balance -= amt;
        }
        else{
            throw new OverdraftException("Insufficient funds", amt - balance);
        }
    }
}
