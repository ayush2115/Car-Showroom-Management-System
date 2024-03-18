import java.util.Scanner;

public class Showroom implements Utility
{
    private String showroom_name;
    private String showroom_address;
    private int total_employees;
    private int total_cars_in_stock = 0;
    private String manager_name;
    private static int totalShowrooms = 0;

    public static final int MAX_SHOWROOM = 100;

    public Showroom() {
        totalShowrooms++;
    }
    public static int getTotalShowrooms() {
        return totalShowrooms;
    }

    @Override
    public void get_details() {
        System.out.println("Showroom Name: " + getShowroomName());
        System.out.println("Showroom Address: " + getShowroomAddress());
        System.out.println("Manager Name: " + getManagerName());
        System.out.println("Total Employees: " + getTotalEmployees());
        System.out.println("Total Cars In Stock: " + getTotalCarsInStock());
    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("======================= *** ENTER SHOWROOM DETAILS *** =======================");
        System.out.println();
        System.out.print("SHOWROOM NAME: ");
        showroom_name = sc.nextLine();
        System.out.print(("SHOWROOM ADDRESS: "));
        showroom_address = sc.nextLine();
        System.out.print("MANAGER NAME: ");
        manager_name = sc.nextLine();

        System.out.print("TOTAL NO OF EMPLOYEES : ");
        this.total_employees = sc.nextInt();

        System.out.print("TOTAL CARS IN STOCK : ");
        this.total_cars_in_stock = sc.nextInt();
    }

    public String getShowroomName() {
        return showroom_name;
    }

    public void setShowroomName(String showroom_name) {
        this.showroom_name = showroom_name;
    }

    public String getShowroomAddress() {
        return showroom_address;
    }

    public void setShowroomAddress(String showroom_address) {
        this.showroom_address = showroom_address;
    }

    public int getTotalEmployees() {
        return total_employees;
    }

    public void setTotalEmployees(int total_employees) {
        this.total_employees = total_employees;
    }

    public int getTotalCarsInStock() {
        return total_cars_in_stock;
    }

    public void setTotalCarsInStock(int total_cars_in_stock) {
        this.total_cars_in_stock = total_cars_in_stock;
    }

    public String getManagerName() {
        return manager_name;
    }

    public void setManagerName(String manager_name) {
        this.manager_name = manager_name;
    }

}