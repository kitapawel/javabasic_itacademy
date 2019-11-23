package Week7.ATM;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Account {
    private static long accountNoCounter = 0;
    private Card accountCard;

    private Long accountNumber;
    private BigDecimal balance;


    public abstract BigDecimal topUp(BigDecimal amount);
    public abstract BigDecimal withdraw(BigDecimal amount);

    public Account(Card card) {
        accountNumber = accountNoCounter + 1;
        accountNoCounter++;
        balance = BigDecimal.ZERO;
        accountCard = card;

    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
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
