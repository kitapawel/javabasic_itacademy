package Week7.ATM;

import java.math.BigDecimal;


public class Card {
    private String pin;
    private String cardNumber;
    private String bankName;
    private long accountNumber;

    public Card(String cardNumber, String bankName, long accountnumber) {
        this.cardNumber = cardNumber;
        this.bankName = bankName;
        this.accountNumber = accountnumber;
        pin = "0000";
    }

    public boolean checkPin(String enteredPin){
        return pin.equals(enteredPin);
    }

    public void changePin(String oldPin, String newPin){
        if (checkPin(oldPin)) {
            pin = newPin;
        }  else {
            System.out.println("Wrong PIN!");
        }
    }

    public BigDecimal checkBalance() {
        Account account = getCardAccount();
        if (account != null) {
            return account.getBalance();
        }
        return null;
    }

    private Account getCardAccount() {
        Bank bank = BankRegistry.getByName(bankName);
        if (bank != null) {
            return bank.getByNumber(accountNumber);
        }
        return null;
    }

    public BigDecimal topUp(BigDecimal amount) {
        Account account = getCardAccount();
        if(account != null) {
            return account.topUp(amount);
        }
        return null;
    }

    public BigDecimal withDraw(BigDecimal amount) {
        Account account = getCardAccount();
        if(account != null) {
            return account.withdraw(amount);
        }
        return null;
    }
}
