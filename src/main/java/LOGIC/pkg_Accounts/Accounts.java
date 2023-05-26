package LOGIC.pkg_Accounts;

import LOGIC.pkg_Accounts.Exceptions.InsuficientFundsException;
import LOGIC.pkg_Clients.Clients;

public abstract class Accounts {

// ---- ---- ---- ---- ---- ---- ----- ATTRIBUTES ---- ---- ---- ---- ---- ---- ---- ---- //
    private Clients owner;
    protected double balance;
    //protected String agency;
    //protected String number;
    private static int totalAcc;

// ---- ---- ---- ---- ---- ---- ----- CONSTRUCTOR ---- ---- ---- ---- ---- ---- ---- ---- //
    Accounts( Clients owner) {
        /*try {
            int tempNum = Integer.parseInt(agency);
            if (tempNum > 0) {
                this.agency = agency;
            } else {
                System.out.println("Agency number, cant be a number equal or less than 0 \n Agency number will be temporily 999 until change");
                this.agency = "999";
            }
        } catch (Exception e) {
            this.agency = agency;
        }*/

        totalAcc++;
    }
// ---- ---- ---- ---- ---- ---- ----- GETTERS ---- ---- ---- ---- ---- ---- ---- ---- //  

    static int getTotalAcc() {
        System.out.print("The number of accounts created is ");
        return totalAcc;
    }

    public double getBalance() {
        System.out.println("Your balance is :" + balance + "\n");
        return balance;
    }

    void getAttributesValue() {
        System.out.println("Owner: " + this.owner);
        System.out.println("Balance: " + this.balance);
        //System.out.println("Agency: " + this.agency);
        //System.out.println("Number: " + this.number + "\n");
    }
    
// ---- ---- ---- ---- ---- ---- ----- SETTERS ---- ---- ---- ---- ---- ---- ---- ---- //  

    //public void setAgency(String agency) {
    //    this.agency = agency;
    //}

    //public void setNumber(String number) {
    //    this.number = number;
    //}
// ---- ---- ---- ---- ---- ---- ----- OTHER METHODS ---- ---- ---- ---- ---- ---- ---- ---- //    
//DEPOSIT

    void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposit sucesfull \n Your balance is " + this.balance + "\n");
    }

//WITHDRAW
    void withdraw(double amount) {
        if (amount > this.balance) {
            throw new InsuficientFundsException("Insufficient balance \n Your balance is " + this.balance + "\n");
        } else {
            this.balance -= amount;
            System.out.printf("Withdraw sucesfull \n Your balance is %.2f" , this.balance);
        }
    }
    
//TRANSFER

    boolean transfer(double amount, Accounts accname_id
    ) {
        if (this.balance > amount) {
            this.balance -= amount;
            accname_id.deposit(amount);
            return true;
        } else {
            System.out.println("Insufficient balance \n Your balance is " + balance + "\n");
            return false;
        }
    }

}
