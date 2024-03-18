import java.util.Scanner;

public abstract class Employee implements Utility {
    protected String emp_id;
    protected String emp_name;
    protected int emp_age;
    protected String emp_department;
    protected String showroom_name;

    public static int totalEmployee = 0;

    public Employee() {
        totalEmployee++;
    }

    public static int getTotalEmployee() {
        return totalEmployee;
    }

    @Override
    public void get_details() {
        System.out.println("ID: " + emp_id);
        System.out.println("Name: " + emp_name);
        System.out.println("Age: " + emp_age);
        System.out.println("Department: " + emp_department);
        System.out.println("Showroom Name: " + showroom_name);
    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("======================= *** ENTER EMPLOYEE DETAILS *** =======================");
        System.out.println();
        System.out.print("EMPLOYEE NAME: ");
        emp_name = sc.next();
        while(Integer.parseInt(emp_name)==0)
        {
            System.out.println("Enter Valid Name");
            System.out.print("EMPLOYEE NAME: ");
            emp_name = sc.next();
        }
        sc.nextLine();

        System.out.print("EMPLOYEE AGE: ");
        emp_age = sc.nextInt();
        sc.nextLine();
        System.out.print("EMPLOYEE DEPARTMENT: ");
        emp_department = sc.nextLine();
        System.out.print("SHOWROOM NAME: ");
        showroom_name = sc.next();
        sc.nextLine();
    }

    public abstract double calculateSalary();
}
