package Week7.ATM;

import java.util.HashSet;
import java.util.Set;

public class BankRegistry {
    private static Set<Bank> banks = new HashSet<>();

    private BankRegistry(){
    }

    public static void registerBank (Bank bank){
        banks.add(bank);
    }

    public static Bank getByName(String bankName){
        for (Bank bank : banks) {
            if (bank.getName().equals(bankName)){
                return bank;
            }
        }
        return null;
    }

}
