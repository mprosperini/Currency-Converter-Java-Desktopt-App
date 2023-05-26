package LOGIC.pkg_Accounts;

import LOGIC.pkg_Accounts.Exceptions.InsuficientFundsException;
import LOGIC.pkg_Clients.Clients;

public class CheckingAccounts extends Accounts {

    public CheckingAccounts(Clients owner) {
        super(owner);
    }
    
    //2% Commisions when retire
    @Override
        void withdraw(double amount) {
        double commision = 0.02 ;
        if (amount > this.balance) {
            throw new InsuficientFundsException("Insuficient balance to proceed with this operation\n"
                                            + " Take in consideration you need to pay " + commision*100+"%"
                                            + "\n  on commision when iniciating a  withdraw");
        } else {
            this.balance = this.balance - amount - (commision * amount  );
            System.out.printf("Withdraw sucesfull \n Your balance is %.2f" , this.balance);
            System.out.print("\n");
        }
    }


    
}
