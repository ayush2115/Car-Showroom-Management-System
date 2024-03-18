import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

interface Utility
{
    void get_details();
    void set_details();
}

public class Main {
    static ArrayList<PurchaseHistory> purchaseHistoryList = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Showroom> showrooms = new ArrayList<>();
        ArrayList<Employee> employees = new ArrayList<>();
        ArrayList<Car> cars = new ArrayList<>();

        int choice = 100;
        while (choice != 0)
        {
            main_menu();
            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid choice.");
                sc.nextLine();
                continue;
            }

            while (choice != 10 && choice != 0) {
                switch (choice) {
                    case 1:
                        if(Showroom.getTotalShowrooms()<Showroom.MAX_SHOWROOM)
                        {
                            Showroom showroom = new Showroom();
                            showroom.set_details();
                            showrooms.add(showroom);
                        }
                        else
                        {
                            System.out.println("Cannot Add More Showroom");
                            continue;
                        }
                        System.out.println();
                        System.out.println("1].ADD NEW SHOWROOM");
                        System.out.println("10].GO BACK TO MAIN MENU");
                        try {
                            choice = sc.nextInt();
                        } catch (Exception e) {
                            System.out.println("Invalid input. Please enter a valid choice.");
                            sc.nextLine();
                            continue;
                        }
                        break;
                    case 2:
                        System.out.println("Select Employee Type:");
                        System.out.println("1. Full-Time Employee");
                        System.out.println("2. Part-Time Employee");
                        int employeeType = sc.nextInt();
                        if (employeeType == 1) {
                            FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
                            fullTimeEmployee.set_details();
                            employees.add(fullTimeEmployee);
                        } else if (employeeType == 2) {
                            PartTimeEmployee partTimeEmployee = new PartTimeEmployee();
                            partTimeEmployee.set_details();
                            employees.add(partTimeEmployee);
                        } else {
                            System.out.println("Invalid employee type. Please enter a valid choice.");
                        }
                        System.out.println();
                        System.out.println("2].ADD NEW EMPLOYEE");
                        System.out.println("10].GO BACK TO MAIN MENU");
                        try
                        {
                            choice = sc.nextInt();
                        } catch (Exception e)
                        {
                            System.out.println("Invalid input. Please enter a valid choice.");
                            sc.nextLine();
                            continue;
                        }
                        break;
                    case 3:
                        if(Car.getTotalCars()<Car.MAX_CAR)
                        {
                            Car car = new Car();
                            car.set_details();
                            cars.add(car);
                        }
                        else
                        {
                            System.out.println("Cannot Add More Cars");
                            continue;
                        }
                        System.out.println();
                        System.out.println("3].ADD NEW CAR");
                        System.out.println("10].GO BACK TO MAIN MENU");
                        try {
                            choice = sc.nextInt();
                        } catch (Exception e) {
                            System.out.println("Invalid input. Please enter a valid choice.");
                            sc.nextLine();
                            continue;
                        }
                        break;
                    case 4:
                        if(Showroom.getTotalShowrooms()==0)
                        {
                            System.out.println("No Showrooms Available");
                            choice = 10;
                            continue;
                        }
                        System.out.println("TOTAL SHOWROOMS : "+Showroom.getTotalShowrooms());
                        System.out.println();
                        for (Showroom s : showrooms) {
                            s.get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("10].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        try {
                            choice = sc.nextInt();
                        } catch (Exception e) {
                            System.out.println("Invalid input. Please enter a valid choice.");
                            sc.nextLine();
                            continue;
                        }
                        break;
                    case 5:
                        if(Employee.getTotalEmployee()==0)
                        {
                            System.out.println("No Employee Available");
                            choice = 10;
                            continue;
                        }
                        for (Employee e : employees) {
                            e.get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("10].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        try {
                            choice = sc.nextInt();
                        } catch (Exception e) {
                            System.out.println("Invalid input. Please enter a valid choice.");
                            sc.nextLine();
                            continue;
                        }
                        break;
                    case 6:
                        if(Car.totalCars ==0)
                        {
                            System.out.println("No Cars Available");
                            choice = 10;
                            continue;
                        }
                        for (Car c : cars) {
                            c.get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("10].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        try {
                            choice = sc.nextInt();
                        } catch (Exception e) {
                            System.out.println("Invalid input. Please enter a valid choice.");
                            sc.nextLine();
                            continue;
                        }
                        break;
                    case 7:
                        if(Employee.getTotalEmployee()==0)
                        {
                            System.out.println("No Employee Available");
                            choice = 10;
                            continue;
                        }
                        for (Employee e : employees) {
                            e.get_details();
                            System.out.println("TOTAL PAYROLL : " + e.calculateSalary());
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("10].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        try {
                            choice = sc.nextInt();
                        } catch (Exception e) {
                            System.out.println("Invalid input. Please enter a valid choice.");
                            sc.nextLine();
                            continue;
                        }
                        break;
                    case 8:
                        carSelling(cars);
                        choice = 10;
                        break;
                    case 9:
                        displayPurchaseHistory();
                        choice = 10;
                        break;
                    default:
                        System.out.println("ENTER VALID CHOICE: ");
                        break;
                }
            }
        }
    }

    public static void main_menu() {
        System.out.println();
        System.out.println("======================= *** WELCOME TO SHOWROOM MANAGEMENT SYSTEM *** =======================");
        System.out.println();
        System.out.println("=============================== *** ENTER YOUR CHOICE *** ===============================");
        System.out.println();
        System.out.println("1].ADD SHOWROOMS \t\t\t 2].ADD EMPLOYEES \t\t\t 3].ADD CARS");
        System.out.println();
        System.out.println("4].GET SHOWROOMS \t\t\t 5].GET EMPLOYEES \t\t\t 6].GET CARS");
        System.out.println();
        System.out.println("7].EMPLOYEES PAYROLL \t\t 8].CAR SELL \t\t\t\t 9].CAR PURCHASE HISTORY");
        System.out.println();
        System.out.println("=============================== *** ENTER 0 TO EXIT *** ===============================");
    }

    public static void carSelling(ArrayList<Car> cars) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the car ID to sell: ");
        int carId = sc.nextInt();
        boolean flag = false;

        for (Car car : cars) {
            if (car.getCarId() == carId) {
                sc.nextLine(); // Consume newline
                System.out.print("Enter the customer name: ");
                String customerName = sc.nextLine();
                System.out.print("Enter the purchase price: ");
                double purchasePrice = sc.nextDouble();
                System.out.println("Car with ID " + carId + " has been sold to " + customerName + ".");
                PurchaseHistory purchase = new PurchaseHistory(carId, customerName, new Date(), purchasePrice);
                purchaseHistoryList.add(purchase);
                flag = true;
            }
        }
        if (!flag)
        {
            System.out.println("Car with ID " + carId + " not found. Returning to the main menu.");
        }
    }
    public static void displayPurchaseHistory() {
        System.out.println("======================= *** CAR PURCHASE HISTORY *** =======================");
        for (PurchaseHistory purchase : purchaseHistoryList) {
            System.out.println("Car ID: " + purchase.getCarId());
            System.out.println("Customer Name: " + purchase.getCustomerName());
            System.out.println("Purchase Date: " + purchase.getDate());
            System.out.println("Purchase Price: " + purchase.getPurchasePrice());
            System.out.println();
        }
        System.out.println();
    }
}
