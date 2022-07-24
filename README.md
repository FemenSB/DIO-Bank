# DIO._ Bank challenge

Project made for the Santander Bootcamp Fullstack Developer by DIO._ to explore concepts of object orientation, such as inheritance and polymorphism.

## Inheritance

All accounts inherit the abstract class Account, wich implements the IAccount interface and other methods. The interface specifies methods for withdraw, deposit, transfer and printing a bank statement.

## Polymorphism

The class Account declares a method to subtract money from the balance, which is overridden considering that checking accounts have access to credit and savings accounts don't.