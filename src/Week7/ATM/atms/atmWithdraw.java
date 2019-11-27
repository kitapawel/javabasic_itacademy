package Week7.ATM.atms;

import java.math.BigDecimal;

public class atmWithdraw extends AbstractATM implements Withdrawable, TopUppable {
    @Override
    public BigDecimal withdraw(BigDecimal amount) {
        if (isCardInserted){
            card.withDraw(amount);
        }
        return null;
    }

    @Override
    public BigDecimal topUp(BigDecimal amount) {
        if (isCardInserted){
            card.topUp(amount);
        }
        return null;
    }
}
