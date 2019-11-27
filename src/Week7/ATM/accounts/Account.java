package Week7.ATM.accounts;

import Week7.ATM.Card;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Account {
    private static long accountNumberCounter = 0;

    private Long accountNumber;
    protected BigDecimal balance;

    public Account() {
        accountNumber = accountNumberCounter + 1;
        accountNumberCounter++;

        balance = BigDecimal.ZERO;
    }

    public abstract BigDecimal topUp(BigDecimal amount);

    public abstract BigDecimal withDraw(BigDecimal amount);

    public Long getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(accountNumber, account.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber);
    }
}