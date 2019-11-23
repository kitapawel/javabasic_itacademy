package Week7.ATM;

import java.util.Scanner;

public abstract class ATM {
    private String name;
    private boolean isCardInserted = false;

    public ATM(String name) {
        this.name = name;
    }

    public void insertCard(){
        if (!isCardInserted) {
            cardInsertion();
        } else {
            System.out.println("There is already a card inserted.");
        }
    }

    private void cardInsertion(){
        Scanner myInput = new Scanner(System.in);
        System.out.println("Please insert a card to the ATM (provide card number): ");
        long cardNumber = myInput.nextLong();
        isCardInserted= true;
        //check card number against all cards in the system
        //check pin
        //connect with account
    }

    public void endSession(){
        System.out.println("Card has been removed from the ATM.");
        isCardInserted = false;
    }
}
