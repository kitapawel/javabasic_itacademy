package Week7.ATM.accounts;

import Week7.ATM.Card;

import java.math.BigDecimal;

public class CreditAccount extends Account {
    private BigDecimal creditLimit;

    public CreditAccount(BigDecimal creditLimit) {
        super();
        this.creditLimit = creditLimit;
    }

    @Override
    public BigDecimal topUp(BigDecimal amount) {
        if(balance.add(amount).compareTo(BigDecimal.ZERO) > 0) {
            System.out.println("Final balance will be more than 0! Current balance is: " + balance);
        } else {
            balance = balance.add(amount);
        }
        return balance;
    }

    @Override
    public BigDecimal withDraw(BigDecimal amount) {
        if (balance.subtract(amount).compareTo(creditLimit) > 0) {
            balance = balance.subtract(amount);
        } else {
            System.out.println("Credit limit " + creditLimit + " reached. Current balance: " + balance);
        }
        return balance;
    }
}