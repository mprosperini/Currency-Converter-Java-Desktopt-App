package LOGIC.pkg_Staff;

import LOGIC.pkg_HumanData.HumanData;

public abstract class Staff extends HumanData{

// ---- ---- ---- ---- ---- ---- ----- ATTRIBUTES ---- ---- ---- ---- ---- ---- ---- ---- //
    private double salary;
    private static double totSalaryPaid ;
// ---- ---- ---- ---- ---- ---- ----- CONSTRUCTORS ---- ---- ---- ---- ---- ---- ---- ---- //
     public Staff () {
        
    }
// ---- ---- ---- ---- ---- ---- ----- SETTERS ---- ---- ---- ---- ---- ---- ---- ---- //
    public void setSalary(double salary) {
        this.salary = salary;
    }

// ---- ---- ---- ---- ---- ---- ----- GETTERS ---- ---- ---- ---- ---- ---- ---- ---- //
    public double getSalary() {
        return salary;
    }

    public static double getTotSalaryPaid() {
        return totSalaryPaid;
    }
// ---- ---- ---- ---- ---- ---- ----- OTHER METHODS---- ---- ---- ---- ---- ---- ---- ---- //    
   public abstract double salaryBonus() ;

    public double paysalary () {
        totSalaryPaid += salary + salaryBonus();
        return salary + salaryBonus() ;
    }
}
