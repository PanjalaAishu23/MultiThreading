package Food.Threads;

import Food.Item;
import Food.Order.CustomerInfo;
import Food.Order.OrderInfo;

import java.util.List;

public class MultiThread implements Runnable {
    List<CustomerInfo> customerList;
    List<Item> pizzaItems;
    static int orderNumber = 0;

    public MultiThread(List<CustomerInfo> customerList, List<Item> pizzaItems) {
        this.customerList = customerList;
        this.pizzaItems = pizzaItems;
    }

    synchronized int IncreaseOrderNumber() {
        orderNumber++;
        return orderNumber;
    }

    @Override
    public void run() {
        for(CustomerInfo customer : customerList) {
            System.out.println("------------------------Next Order-----------------------------");
            System.out.println("Taking order for customer - " + customer.getCustomerName() + " at Counter - " + Thread.currentThread().getName());
            OrderInfo order = OrderOperation.takeOrder(customer,pizzaItems,IncreaseOrderNumber());
            OrderOperation.prepareOrder(customer,order);
            OrderOperation.deliverOrder(customer,order);
            System.out.println("----------------------------Completed Order-------------------------");
        }
    }

}
