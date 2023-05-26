package LOGIC.pkg_Staff;

public class StaffAdministrator extends Staff implements InterfaceSalary{

    //Salary Bonus 100%
    @Override
    public double salaryBonus() {
        return super.getSalary() ;
    }

    
    
}
