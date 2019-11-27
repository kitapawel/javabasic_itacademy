package Week7.ATM.atms;

import Week7.ATM.Card;

public abstract class AbstractATM {
    protected Card card;
    protected boolean isCardInserted = false;

    public void insertCard(Card card) {
        if (!isCardInserted){
            this.card = card;
            isCardInserted = true;
            System.out.println("Inserted: "+ card.toString());
        } else {
            System.out.println("There may be a card in the ATM. Removing...");
            endSession();
        }

    }

    public void endSession() {
        card = null;
        isCardInserted = false;
    }

    public void changePin(String oldPin, String newPin) {
        if(card != null) {
            card.changePin(oldPin, newPin);
        } else {
            System.out.println("Insert card first!");
        }
    }
}