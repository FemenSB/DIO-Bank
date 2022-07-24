package borsato.dio.bank.models;

import borsato.dio.bank.exceptions.InsufficientBalanceException;
import borsato.dio.bank.interfaces.IAccount;

/**
 *
 * @author Femen
 */
public abstract class Account implements IAccount {
    private static int idCounter = 0;
    private static String defaultBranch = "0000-1";
    private String accountType;
    
    protected String holderName;
    protected String accNumber;
    protected String branch;
    protected float balance;
    
    public Account(String holderName, String accountType) {
        accNumber = String.format("|%04d|", idCounter++);
        branch = defaultBranch;
        balance = 0f;
        this.holderName = holderName;
        this.accountType = accountType;
    }
    
    @Override
    public void printStatement() {
        System.out.println("==== Statement ====");
        System.out.println("Holder: " + holderName);
        System.out.println("Account number: " + accNumber + " - Branch: " + branch);
        System.out.println("Acount type: " + accountType);
        System.out.println("Balance: " + balance);
        
    }
    
    public void addMoney(float amount) {
        balance += amount;
    }
    
    abstract protected void subtractMoney(float amount) throws InsufficientBalanceException;
    
    @Override
    public void withdraw(float amount) {
        try {
            subtractMoney(amount);
            System.out.println("$" + amount + " withdrawn");
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
    
    @Override
    public void deposit(float amount) {
        try {
            addMoney(amount);
            System.out.println("$" + amount + " deposited");
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }    
    }
    
    @Override
    public void transfer(Account acc, float amount) {
        try {
            subtractMoney(amount);
            acc.addMoney(amount);
            System.out.println("$" + amount + " transfered to " + acc.holderName);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
