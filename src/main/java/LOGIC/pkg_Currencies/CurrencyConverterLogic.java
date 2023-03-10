package LOGIC.pkg_Currencies;

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
    
   

    public void checkingFields(String cmbTO, String cmbFROM, String amount) {

        if (cmbTO == "-") {
            JOptionPane.showMessageDialog(null, "Please select the currency FROM you want to  convert");
        } else if (cmbFROM == "-") {
            JOptionPane.showMessageDialog(null, "Please select the currency you want TO get");
        } else if (amount.matches("\"^(\\\\d+)(?:\\\\.(\\\\d{1,2}))?$\"") == false) {
            JOptionPane.showMessageDialog(null, "No Text Allowed to convert currency");
        } else if (cmbTO != "-" && cmbFROM != "-" && amount.matches("^(\\d+)(?:\\.(\\d{1,2}))?$") == true)  {
                        JOptionPane.showMessageDialog(null, "All good");
        }
    }

    public double convertToUsd(String currencySelected, double amount) {
        try {
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
            } else if (currencySelected == "USD") {
                amountToUsd = (amount * usd) / 1;
            } else if (currencySelected == "-") {
                System.out.println("FROM NO PUEDE ESTAR VACIO");
            }
        } catch (Exception e) {
        }
        return amountToUsd;
    }

    public double convertTo(String currencyDesired, double amountToUsd) {
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
