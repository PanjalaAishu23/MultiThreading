package Food.Threads;


import Food.Pizza.Orders;
import Food.Order.CustomerInfo;
import Food.Order.OrderInfo;
import Food.Item;
import java.util.List;

public class OrderOperation {

    public static OrderInfo takeOrder(CustomerInfo customer, List<Item> pizzaItem, int order) {
        OrderInfo info = new OrderInfo();
        info.setOrderId(order);
        info.setItem(pizzaItem.get(Orders.getOrder(customer)));
        info.setCustomer(customer);
        return info;
    }

    public static void prepareOrder(CustomerInfo customer, OrderInfo order) {

        System.out.println ("Order for customer - " + customer.getCustomerName() + " " + order);
    }

    public static void deliverOrder(CustomerInfo customer, OrderInfo order) {

        System.out.println("Order Id - " + order.getOrderId());
        System.out.println("Order preparation time - " + order.getItem().getPreparationTime());
        System.out.println("Order ready for - " + customer.getCustomerName());
        System.out.println("Delivering for customer - " + customer.getCustomerName() + ". Enjoy Delicious " + order.getItem().getItemName());
    }
}
