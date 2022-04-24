package Food.Order;

public class CustomerInfo {
    private String customerName;
    public String getCustomerName()
    {
        return customerName;
    }
    public void setCustomerName(String customerName)
    {
        this.customerName=customerName;
    }
    public CustomerInfo(String customerName)
    {
        this.customerName=customerName;
    }

    @Override
    public String toString() {
        return "CustomerInfo{" +
                "customerName='" + customerName + '\'' +
                '}';
    }
}
