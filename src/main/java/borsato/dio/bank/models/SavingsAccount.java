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
public class SavingsAccount extends Account {

    public SavingsAccount(String holderName) {
        super(holderName, "Savings");
    }
    
    @Override
    protected void subtractMoney(float amount) throws InsufficientBalanceException {
        if(balance < amount) {
            throw new InsufficientBalanceException();
        }
        balance -= amount;
    }
    
}
