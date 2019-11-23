package Week7.ATM;

public class BankomatTester {

    public static void main(String[] args) {
        Bank bank1 = new Bank ("Pekao");
        Bank bank2 = new Bank ("Mbank");

        BankRegistry.registerBank(bank1);
        BankRegistry.registerBank(bank2);
        System.out.println(BankRegistry.getByName("Mbank"));
        System.out.println(BankRegistry.getByName("Pekao"));
        System.out.println(BankRegistry.getByName("MBank"));

        Account account1 = new DebitAccount(new Card("001","Mbank", 1));
        Account account2 = new DebitAccount(new Card("002","Pekao", 2));
        Account account3 = new DebitAccount(new Card("003", "Pekao",3));
        bank1.addAccount(account1);
        bank1.addAccount(account2);
        bank2.addAccount(account3);


        System.out.println(account1.getAccountNumber());
        System.out.println(account2.getAccountNumber());


        ATM atm1 = new ATMWithdrawal("ATM1");
        atm1.insertCard();
        atm1.insertCard();
        atm1.endSession();
        atm1.insertCard();

    }

}
