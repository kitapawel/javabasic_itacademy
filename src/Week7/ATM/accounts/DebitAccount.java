package Week7.ATM.accounts;

import Week7.ATM.Card;

import java.math.BigDecimal;

public class DebitAccount extends Account {

    @Override
    public BigDecimal topUp(BigDecimal amount) {
        balance = balance.add(amount);
        return balance;
    }

    @Override
    public BigDecimal withDraw(BigDecimal amount) {
        if (balance.compareTo(amount) > 0) {
            balance = balance.subtract(amount);
        } else {
            System.out.println("There are not enough of money to withdraw. Current balance: " + balance);
        }
        return balance;
    }
}
