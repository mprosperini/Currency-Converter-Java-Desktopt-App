/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.myfirstjava.bankproject;

/**
 *
 * @author saberx
 */
public class Bankproject {

    public static void main(String[] args) {
        Account account1 = new Account ();         
//        System.out.println(account1.agency);
//        System.out.println(account1.balance);
//        System.out.println(account1.number);
//        System.out.println(account1.owner);
//        System.out.println(account1.owner.Phone);
//        System.out.println(account1.owner.Phone);
        account1.getAttributesValue(account1);

        account1.deposit(100);
        account1.withdraw(10);

        account1.getBalance();
        //System.out.println( "ACC1 balance" + account1.balance);
        
        
        Account account2 = new Account ();
        account2.deposit(10);
        account2.withdraw(5);
        account2.transfer(5, account1);
        
        
        User user1 = new User ();
        account1.owner =user1;
        
        System.out.println(account1.owner);
        System.out.println(user1);

        
    }
}
