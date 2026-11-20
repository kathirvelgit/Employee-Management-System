package application;

import company.Employee;
import company.Developer;
import company.Manager;

public class Main {

    public static void main(String[] args) {

        // Creating Employee References

        Employee e1 = new Developer(101, "Arun", 50000);

        Employee e2 = new Manager(102, "Priya", 80000);

        // Display Developer Details

        e1.displayCompany();

        e1.displayEmployeeDetails();

        System.out.println("Calculated Salary: " + e1.calculateSalary());

        System.out.println();

        // Display Manager Details

        e2.displayCompany();

        e2.displayEmployeeDetails();

        System.out.println("Calculated Salary: " + e2.calculateSalary());

    }
}