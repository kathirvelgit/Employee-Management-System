package company;

public class Developer extends Employee {

    // Bonus Variable
    private double bonus;

    // Constructor
    public Developer(int id, String name, double salary) {

        super(id, name, salary);

        this.bonus = 10000;
    }

    // Method Overriding
    @Override
    public double calculateSalary() {

        return salary + bonus;
    }

    // Display Developer Details
    @Override
    public void displayEmployeeDetails() {

        System.out.println("Developer Details");

        super.displayEmployeeDetails();

        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateSalary());
    }
}