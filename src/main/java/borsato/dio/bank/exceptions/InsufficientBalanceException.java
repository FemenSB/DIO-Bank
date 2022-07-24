/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package borsato.dio.bank.exceptions;

/**
 *
 * @author Femen
 */
public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException() {
        super("Balance is insufficient to complete this transaction");
    }
}
