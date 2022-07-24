package borsato.dio.bank;

import borsato.dio.banco.interfaces.IAccount;
import borsato.dio.banco.models.Account;
import borsato.dio.banco.models.CheckingAccount;
import borsato.dio.banco.models.SavingsAccount;

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
