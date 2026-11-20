package company;

public class Manager extends Employee {

    // Bonus Variable
    private double bonus;

    // Constructor
    public Manager(int id, String name, double salary) {

        super(id, name, salary);

        this.bonus = 15000;
    }

    // Method Overriding
    @Override
    public double calculateSalary() {

        return salary + bonus;
    }

    // Display Manager Details
    @Override
    public void displayEmployeeDetails() {

        System.out.println("Manager Details");

        super.displayEmployeeDetails();

        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateSalary());
    }
}