package company;

public class Employee {

    // Private Variables
    private int id;
    private String name;

    // Protected Variable
    protected double salary;

    // Static Final Variable
    public static final String COMPANY_NAME = "Bala Labs";

    // Constructor
    public Employee(int id, String name, double salary) {

        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getter Methods
    public int getId() {

        return id;
    }

    public String getName() {

        return name;
    }

    // Calculate Salary
    public double calculateSalary() {

        return salary;
    }

    // Final Method
    public final void displayCompany() {

        System.out.println("Company: " + COMPANY_NAME);
    }

    // Display Employee Details
    public void displayEmployeeDetails() {

        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + salary);
    }
}