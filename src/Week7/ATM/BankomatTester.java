package Week7.ATM;


import Week7.ATM.accounts.Account;
import Week7.ATM.accounts.CreditAccount;
import Week7.ATM.accounts.DebitAccount;

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

        //create accounts
        //create banks
        //create cards. put account numbers into cards
        //put bank names into cards
        //register accounts in banks
        //register banks in bank registrator
        //
        //create different ATMs (bankomat, wplatomat, bankomat+wplatomat)
        // try to top-up, withdraw different cards with different bankomats

    }

}
