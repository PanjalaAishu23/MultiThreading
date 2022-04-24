package Food.Threads;
import Food.*;
import Food.Order.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ThreadMain {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        runRunnableInterface();

    }

    public static void runRunnableInterface() throws ExecutionException, InterruptedException {
        long startTime = System.currentTimeMillis();
        List<CustomerInfo> customers = getCustomers();
        List<Item> pizzaItems = getPizzaItems();
        List<CustomerInfo> customerQueue1 = customers.subList(0, 2);
        List<CustomerInfo> customerQueue2 = customers.subList(2, 4);
        List<CustomerInfo> customerQueue3 = customers.subList(4, 6);
        MultiThread process1 = new MultiThread(customerQueue1, pizzaItems);
        MultiThread process2 = new MultiThread(customerQueue2, pizzaItems);
        MultiThread process3 = new MultiThread(customerQueue3, pizzaItems);

        Thread t1 = new Thread(process1);
        Thread t2 = new Thread(process2);
        Thread t3 = new Thread(process3);
        t1.setName("1");
        t2.setName("2");
        t3.setName("3");
        t1.start();
        t2.start();
        t3.start();
        System.out.println("Total time taken - " + (System.currentTimeMillis() - startTime));
    }

    public static List<Item> getPizzaItems() {
        List<Item> items = new ArrayList<>();
        items.add(new CheeseBurstPizza());
        items.add(new ChickenTikkaPizza());
        items.add(new PannerPizza());
        items.add(new CreamyMeltPizza());
        return items;
    }

    public static List<CustomerInfo> getCustomers() {
        List<CustomerInfo> customers = new ArrayList<>();
        customers.add(new CustomerInfo("Ajay"));
        customers.add(new CustomerInfo("Anand"));
        customers.add(new CustomerInfo("Mahira"));
        customers.add(new CustomerInfo("Shreya"));
        customers.add(new CustomerInfo("Bhoomi"));
        customers.add(new CustomerInfo("Nazriya"));
        return customers;
    }

}

