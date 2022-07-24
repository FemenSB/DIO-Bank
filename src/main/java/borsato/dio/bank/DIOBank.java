package borsato.dio.bank;

import borsato.dio.bank.interfaces.IAccount;
import borsato.dio.bank.models.Account;
import borsato.dio.bank.models.CheckingAccount;
import borsato.dio.bank.models.SavingsAccount;

/**
 *
 * @author Femen
 */
public class DIOBank {

    public static void main(String[] args) {
        IAccount acc1 = new CheckingAccount("John Doe");
        IAccount acc2 = new SavingsAccount("Jane Doe");
        
        acc1.deposit(400f);
        acc1.transfer((Account) acc2, 400f);
        acc1.withdraw(150f);
        acc1.withdraw(50f);
        
        acc1.printStatement();
        acc2.printStatement();
    }
}
