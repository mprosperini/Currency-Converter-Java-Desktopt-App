package LOGIC;

import LOGIC.pkg_Accounts.Accounts;
import LOGIC.pkg_Accounts.CheckingAccounts;
import LOGIC.pkg_Accounts.SavingAccounts;
import LOGIC.pkg_Clients.Clients;
import LOGIC.pkg_Clients.NaturalClients;
import PERSISTENCE.ControllerPersistence;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class ControllerLogic {

    ControllerPersistence ControllerPersis = new ControllerPersistence();

    public void save(String mail, String nationalid, String firstname, String lastname, String phone, String gender, String account, Date birthdate) {

        Clients client1 = new NaturalClients();
        Accounts acc1 = null;

        if (account == "Saving Account") {
            acc1 = new SavingAccounts(client1);
        } else if (account == "Checking Account") {
            acc1 = new CheckingAccounts(client1);
        }

        client1.setBirthdate(birthdate);
        client1.setMail(mail);
        client1.setName(firstname);
        client1.setLastname(lastname);
        client1.setId(nationalid);
        client1.setPhone(phone);
        client1.setSex(gender);

        JOptionPane optionPane = new JOptionPane("Save Sucesfull! \nYou have now a " + acc1.getClass().getSimpleName());
        optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        JDialog dialog = optionPane.createDialog("Save Sucesfull! Saving Acc");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);

        ControllerPersis.save(client1);

    }

}
