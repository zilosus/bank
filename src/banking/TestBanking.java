package banking;


public class TestBanking {
    public static void main(String[] args) {
        Account konto = new Account(500);
        System.out.println(konto.getBalance());
        System.out.println(konto.deposit(200));
        System.out.println(konto.getBalance());
        System.out.println(konto.withdraw(100));
        System.out.println(konto.getBalance());
        Customer klient = new Customer("Jan", "Kowalski");
        System.out.println(klient.getFirstName());
        System.out.println(klient.getLastName());
        System.out.println(klient.getAccount());
        klient.setAccount(konto);
        System.out.println(klient.getAccount());
    }
}
