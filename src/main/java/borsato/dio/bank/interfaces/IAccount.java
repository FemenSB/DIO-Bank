/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package borsato.dio.bank.interfaces;

import borsato.dio.bank.models.Account;

/**
 *
 * @author Femen
 */
public interface IAccount {
    void withdraw(float amount);
    
    void deposit(float amount);
    
    void transfer(Account acc, float amount);
    
    void printStatement();
}
