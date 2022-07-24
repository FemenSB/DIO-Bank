/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package borsato.dio.bank.models;

import borsato.dio.bank.exceptions.InsufficientBalanceException;

/**
 *
 * @author Femen
 */
public class CheckingAccount extends Account {

    private static float defaultMaxCredit = 150f;
    
    private float maxCredit;
    
    public CheckingAccount(String holderName) {
        super(holderName, "Checking");
        maxCredit = defaultMaxCredit;
    }
    
    @Override
    protected void subtractMoney(float amount) throws InsufficientBalanceException {
        
        if((balance + maxCredit) - amount < 0) {
            throw new InsufficientBalanceException();
        }
        
        balance -= amount;
    }
    
}
