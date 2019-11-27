package Week7.ATM;

import Week7.ATM.accounts.Account;
import Week7.ATM.accounts.CreditAccount;
import Week7.ATM.accounts.DebitAccount;
import Week7.ATM.atms.atmWithdraw;
import java.math.BigDecimal;

public class BankomatTester {

    public static void main(String[] args) {
        Bank bank1 = new Bank ("Pekao");
        Bank bank2 = new Bank ("Mbank");

        BankRegistry.registerBank(bank1);
        BankRegistry.registerBank(bank2);

        Account debitAccount = new DebitAccount();
        Account creditAccount = new CreditAccount(BigDecimal.valueOf(1000));
        bank1.addAccount(debitAccount);
        bank1.addAccount(creditAccount);

        System.out.println(debitAccount.getAccountNumber());
        System.out.println(creditAccount.getAccountNumber());

        Card debitCard = new Card("123", bank1.getName(), debitAccount.getAccountNumber());
        Card creditCard = new Card("234", bank1.getName(), creditAccount.getAccountNumber());

        System.out.println(debitAccount.toString());

        debitCard.topUp(BigDecimal.valueOf((1000)));
        creditAccount.topUp(BigDecimal.valueOf(1001));

        System.out.println(debitAccount.toString());
        System.out.println(debitCard.toString());

        //create accounts
        //create banks
        //create cards. put account numbers into cards
        //put bank names into cards
        //register accounts in banks
        //register banks in bank registrator
        //
        //create different ATMs (bankomat, wplatomat, bankomat+wplatomat)
        // try to top-up, withdraw different cards with different bankomats

        System.out.println("===End of initialization testing block===");
        atmWithdraw atm1 = new atmWithdraw();
        atm1.insertCard(debitCard);
        atm1.topUp(BigDecimal.valueOf(100));
        System.out.println(debitAccount.toString());
        atm1.withdraw(BigDecimal.valueOf(300));
        System.out.println(debitAccount.toString());
        atm1.insertCard(creditCard);
        atm1.insertCard(creditCard);
        atm1.topUp(BigDecimal.valueOf(500));
        System.out.println(creditAccount.toString());
        atm1.withdraw(BigDecimal.valueOf(10000));
        System.out.println(creditAccount.toString());
        atm1.withdraw(BigDecimal.valueOf(1000));
        System.out.println(creditAccount.toString());
        System.out.println("Credit balance: " + creditCard.checkBalance());
        System.out.println("Debit balance: " + debitCard.checkBalance());
    }

}
