package Week7.ATM;

import java.math.BigDecimal;

public class CreditAccount extends Account {

    private BigDecimal creditLimit;

    public CreditAccount(BigDecimal creditLimit, Card card) {
        super(card);
        this.creditLimit = creditLimit;
    }

    @Override
    public BigDecimal topUp(BigDecimal amount) {
        return null;
    }

    @Override
    public BigDecimal withdraw(BigDecimal amount) {
        return null;
    }
}
