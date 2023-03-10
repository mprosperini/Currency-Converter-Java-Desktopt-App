package LOGIC.pkg_Clients;

import LOGIC.pkg_Accounts.SavingAccounts;
import LOGIC.pkg_Accounts.Accounts;

public class TESTClientsPAQ3 {

    public static void main(String[] args) {

        Clients A = new JuridicalClients();
        Clients B = new NaturalClients();
        Clients C = new NaturalClients();
        Clients D = new NaturalClients();

        Accounts acc34 = new SavingAccounts(B);

    }

}
