package Week7.ATM;

import java.math.BigDecimal;

public class DebitAccount extends Account {

    public DebitAccount(Card card) {
        super(card);
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
