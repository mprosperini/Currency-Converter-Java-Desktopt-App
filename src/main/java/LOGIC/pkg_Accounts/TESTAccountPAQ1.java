package LOGIC.pkg_Accounts;

import LOGIC.pkg_Clients.Clients;
import LOGIC.pkg_Clients.JuridicalClients;
import LOGIC.pkg_Clients.NaturalClients;

public class TESTAccountPAQ1 {

    public static void main(String[] args) {

        Clients A = new NaturalClients();
        Clients B = new JuridicalClients();

        Accounts acc1 = new CheckingAccounts(A);
        Accounts acc2 = new SavingAccounts( B);


        acc1.balance = 100;
        acc1.withdraw(98);

        acc2.balance = 100;
        acc2.withdraw(50);        


    }

}
