package samplecodes;

import java.sql.SQLOutput;
public class EmployeeDetails {
    int empid;
    String ename;
    int salary;
    int deptno;

    public void display() {

        System.out.println(empid);
        System.out.println(ename);
        System.out.println(salary);
        System.out.println(deptno);
    }

    public static void main(String[] args) {
        EmployeeDetails emp1 = new EmployeeDetails();
        emp1.empid = 001;
        emp1.ename = "Madhu";
        emp1.salary = 5000;
        emp1.deptno = 40;
        emp1.display();


        EmployeeDetails emp2 = new EmployeeDetails();
        emp2.empid = 002;
        emp2.ename="Dhruv";
        emp2.salary = 5400;
        emp2.deptno = 73;

        emp2.display();

        EmployeeDetails emp3 = new EmployeeDetails();
        emp3.empid = 003;
        emp3.ename="Naveen";
        emp3.salary = 10000;
        emp3.deptno = 14;
        emp3.display();
    }


}
