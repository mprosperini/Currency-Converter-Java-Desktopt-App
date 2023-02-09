/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myfirstjava.bankproject;

/**
 *
 * @author saberx
 */
public class Account {

//ATTRIBUTES
    User owner = new User();          //nulll
    private double balance;                         //0.0
    String agency;                           //null
    int number;                               //0

//GET BALANCE
    double getBalance() {
        System.out.println(balance);
        return balance;
    }

//DEPOSIT
    void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposit sucesfull \n Your balance is " + this.balance);
    }
    
//WITHDRAW
    void withdraw(double amount) {
        if (this.balance > amount) {
            this.balance -= amount;
            System.out.println("Withdraw sucesfull \n Your balance is " + this.balance);
        } else {
            System.out.println("Insufficient balance \n Your balance is " + this.balance);
        }
    }

//TRANSFER
    boolean transfer(double amount, Account accname_id) {
        if (this.balance > amount) {
            this.balance -= amount;
            accname_id.deposit(amount);
            return true;
        } else {
            System.out.println("Insufficient balance");
            System.out.println("Your balance is " + balance);
            return false;
        }
    }
    
    //GET ATTRIBUTES FROM ACCOUNT
    void getAttributesValue (Account accountName) {
        System.err.println("User; " + accountName.owner);
        System.err.println("User; " + accountName.balance);
        System.err.println("User; " + accountName.agency);
        System.err.println("User; " + accountName.number);
    }

}
