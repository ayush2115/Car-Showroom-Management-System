import java.util.Date;

public class PurchaseHistory {
    private final int carId;
    private final String customerName;
    private final Date date;
    private final double purchasePrice;

    public PurchaseHistory(int carId, String customerName, Date date, double purchasePrice) {
        this.carId = carId;
        this.customerName = customerName;
        this.date = date;
        this.purchasePrice = purchasePrice;
    }

    public Date getDate()
    {
        return this.date;
    }
    public int getCarId() {
        return carId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }
}
