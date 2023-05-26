package LOGIC.pkg_Staff;

public class StaffJuniors extends Staff implements InterfaceSalary {

    //Salary Bonus 20%
    @Override
    public double salaryBonus() {
        return super.getSalary() * 0.20;
    }

}
