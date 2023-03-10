package LOGIC.pkg_Staff;

public class StaffSeniors extends Staff implements InterfaceSalary {

    //Salary Bonus 50%
    @Override
    public double salaryBonus() {
        return super.getSalary() * 0.50;
    }

}
