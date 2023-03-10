package LOGIC.pkg_Staff;

import LOGIC.pkg_HumanData.HumanData;

public class TestPAQ2 {

    public static void main(String[] args) {
        
        Staff clas1 = new StaffJuniors ();
        Staff clas2 = new StaffJuniors ();
        Staff clas3 = new StaffSeniors ();
        
        clas1.setSalary(10);
        clas2.setSalary(100);
        clas3.setSalary(1000);

        System.out.println(clas1.paysalary());
        System.out.println(Staff.getTotSalaryPaid());
        System.out.println(clas2.paysalary());        
        System.out.println(Staff.getTotSalaryPaid());
        System.out.println(clas3.paysalary());
        
        System.out.println(Staff.getTotSalaryPaid());
        
        clas1.paysalary();
        clas2.paysalary();
        clas3.paysalary();
        
        System.out.println(clas1.paysalary());
        
        clas1.setSex("MASC");
        System.out.println(clas1.getSex());
        
        
        
        HumanData clas5 = new StaffAdministrator();
        clas5.getSex();
        
        
        
       Staff clas6 = new StaffAdministrator();
       clas6.getSalary();
       
       Staff.getTotSalaryPaid();
        
        
        
        
    }
}
