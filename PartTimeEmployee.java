import java.util.Scanner;
import java.util.UUID;

public class PartTimeEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    public PartTimeEmployee() {
        emp_id = generateId();
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public void get_details() {
        super.get_details();
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
    }

    @Override
    public void set_details() {
        super.set_details();
        Scanner sc = new Scanner(System.in);
        System.out.print("HOURS WORKED: ");
        hoursWorked = sc.nextInt();
        System.out.print("HOURLY RATE: ");
        hourlyRate = sc.nextDouble();
    }

    private String generateId() {
        UUID uuid = UUID.randomUUID();
        return String.valueOf(uuid);
    }
}
