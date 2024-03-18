import java.util.Scanner;

public class Car extends Showroom implements Utility {
    private String car_name;
    private String car_color;
    private String car_fuel_type;
    private int car_price;
    private String car_type;
    private String car_transmission;
    private boolean isAvailable;
    private boolean isSold = false;

    private  int carId = 1;
    public static final int MAX_CAR = 500;
    public static int totalCars = 0;

    public Car() {
        carId = nextCarId++;
        totalCars++;
    }

    private static int nextCarId = 1;
    public int getCarId() {
        return carId;
    }

    public static int getTotalCars() {
        return totalCars;
    }

    public String getCar_name() {
        return car_name;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public boolean isSold() {
        return isSold;
    }
    public void markAsSold() {
        isSold = true;
    }

    public void rent() {
        isAvailable = false;
    }

    public void returnCar() {
        isAvailable = true;
    }

    @Override
    public void get_details() {
        System.out.println("NAME: " + car_name);
        System.out.println("COLOR: " + car_color);
        System.out.println("FUEL TYPE: " + car_fuel_type);
        System.out.println("PRICE: " + car_price);
        System.out.println("CAR TYPE: " + car_type);
        System.out.println("TRANSMISSION: " + car_transmission);
        System.out.println("AVAILABILITY: " + (isAvailable ? "Available" : "Not Available"));
    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("======================= *** ENTER CAR DETAILS *** =======================");
        System.out.println();
        System.out.print("CAR NAME: ");
        car_name = sc.nextLine();
        System.out.print("CAR COLOR: ");
        car_color = sc.nextLine();
        System.out.print("CAR FUEL TYPE (PETROL/DIESEL): ");
        car_fuel_type = sc.nextLine();
        System.out.print("CAR PRICE: ");
        car_price = sc.nextInt();
        sc.nextLine();
        System.out.print("CAR TYPE (SEDAN/SUV/HATCHBACK): ");
        car_type = sc.nextLine();
        System.out.print("TRANSMISSION TYPE (AUTOMATIC/MANUAL): ");
        car_transmission = sc.nextLine();
    }
}
