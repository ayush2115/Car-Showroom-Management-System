import java.util.Scanner;
import java.util.UUID;

public class FullTimeEmployee extends Employee {
    double monthlySalary;

    public FullTimeEmployee() {
        emp_id = generateId();
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    @Override
    public void get_details() {
        super.get_details();
        System.out.println("Monthly Salary: " + monthlySalary);
    }

    @Override
    public void set_details() {
        super.set_details();
        Scanner sc = new Scanner(System.in);
        System.out.print("MONTHLY SALARY: ");
        monthlySalary = sc.nextDouble();
    }

    private String generateId() {
        UUID uuid = UUID.randomUUID();
        return String.valueOf(uuid);
    }
}
