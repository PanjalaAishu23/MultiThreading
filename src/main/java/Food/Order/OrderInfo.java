package Food.Order;
import Food.Item;
import java.util.*;
public class OrderInfo {
    private int orderId;
    private Item item;
    private CustomerInfo customer;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public CustomerInfo getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerInfo customer) {
        this.customer = customer;
    }
    @Override
    public String toString() {
        return "OrderInfo{" +
                "orderId=" + orderId +
                ", items =" + item +
                ", customer=" + customer +
                '}';
    }

}