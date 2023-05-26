package LOGIC.pkg_CurrencyConverter;

import javax.swing.JOptionPane;

public class CurrencyConverterLogic {

    public double usd = 1;
    public double mxn = 0.06;
    public double cop = 0.00021;
    public double ves = 0.041;
    public double eur = 1.05;
    public double gbp = 1.18;
    public double jpy = 0.0073;
    public double cad = 0.73;

    public double amountToUsd;
    public double amountConverted;

    public double ConvertTxtFromToDouble(String txtFrom_String) {
        double txtFrom_Double;
        
        if(!txtFrom_String.matches("^\\d*\\.?\\d*$")){
        JOptionPane.showMessageDialog(null, "Please write only numbers with up to 2 decimals");
        txtFrom_Double = 0;
        }
//        else if (!txtFrom_String.matches("^(\\d+)(?:\\.(\\d{1,2}))?$")) {
//            JOptionPane.showMessageDialog(null, "Please write only numbers with up to 2 decimals");
//            txtFrom_Double = 0;
//        }
        else {
            txtFrom_Double = Double.parseDouble(txtFrom_String);
        }
        return txtFrom_Double;
    }

    public boolean checkingFields(String cmbTO, String cmbFROM, double txtFrom_Double) {
        boolean x = false;
        if (cmbFROM == "-") {
            JOptionPane.showMessageDialog(null, "Select the currency `FROM` you want to  convert");
        }
        if (cmbTO == "-") {
            JOptionPane.showMessageDialog(null, "Select the currency you want `TO` get");
        }
        if (cmbFROM != "-" && cmbTO != "-" && txtFrom_Double != 0) {
            //JOptionPane.showMessageDialog(null, "Convertion Sucesfull!");
            x = true;
        }
        return x;
    }

    public double convertToUsd(String currencySelected, double amount) {
        if (currencySelected == "MXN") {
            amountToUsd = (amount * mxn) / 1;
        } else if (currencySelected == "COP") {
            amountToUsd = (amount * cop) / 1;
        } else if (currencySelected == "VES") {
            amountToUsd = (amount * ves) / 1;
        } else if (currencySelected == "EUR") {
            amountToUsd = (amount * eur) / 1;
        } else if (currencySelected == "GBP") {
            amountToUsd = (amount * gbp) / 1;
        } else if (currencySelected == "JPY") {
            amountToUsd = (amount * jpy) / 1;
        } else if (currencySelected == "CAD") {
            amountToUsd = (amount * cad) / 1;
        } else {
            amountToUsd = (amount * usd) / 1;
        }
        return amountToUsd;
    }

    public double convertToDesiredCurrency(String currencyDesired, double amountToUsd) {
        if (currencyDesired == "MXN") {
            amountConverted = amountToUsd / mxn;
        } else if (currencyDesired == "COP") {
            amountConverted = amountToUsd / cop;
        } else if (currencyDesired == "VES") {
            amountConverted = amountToUsd / ves;
        } else if (currencyDesired == "EUR") {
            amountConverted = amountToUsd / eur;
        } else if (currencyDesired == "GBP") {
            amountConverted = amountToUsd / gbp;
        } else if (currencyDesired == "JPY") {
            amountConverted = amountToUsd / jpy;
        } else if (currencyDesired == "CAD") {
            amountConverted = amountToUsd / cad;
        } else {
            amountConverted = amountToUsd / usd;
        }
        return amountConverted;
    }

}
