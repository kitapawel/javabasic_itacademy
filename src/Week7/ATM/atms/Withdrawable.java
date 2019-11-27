package Week7.ATM.atms;

import java.math.BigDecimal;

public interface Withdrawable {
    BigDecimal withdraw(BigDecimal amount);
}
