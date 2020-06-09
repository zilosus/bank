package banking;

public class CheckingAccount extends Account {
    private static final double NO_PROTECTION = -1.0;

    private double overdraftProtection;

    public CheckingAccount(double bal, double protect) {
        super(bal);
        overdraftProtection = protect;
    }
    public CheckingAccount(double bal) {
        this(bal, NO_PROTECTION);
    }

    public void withdraw(double amount) throws OverdraftException {
        if ( balance < amount ) {
            double overdraftNeeded = amount - balance;

            if ( overdraftProtection == NO_PROTECTION ) {
                throw new OverdraftException("No overdraft protection", overdraftNeeded);
            } else {
                if ( overdraftProtection < overdraftNeeded ) {
                    throw new OverdraftException("Insufficient funds for overdraft protection",
                            overdraftNeeded);
                } else {
                    balance = 0.0;
                    overdraftProtection = overdraftProtection - overdraftNeeded;
                }
            }

        } else {
            balance = balance - amount;
        }
    }
}
