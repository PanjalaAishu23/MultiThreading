package Food.Pizza;

import Food.Order.CustomerInfo;
import Food.Order.OrderInfo;
public class Orders {
    public static int getOrder(CustomerInfo customer)
    {
        String name = customer.getCustomerName();
        int i = 0;
        switch (name)
        {
            case "Ajay":
            case "Anand":
                i = 1;
                break;
            case "Mahira":
            case "Shreya":
                i = 2;
                break;
            case "Bhoomi":
                i = 3;
                break;
            case "Nazriya":
                i = 0;
                break;
        }
        return i;
    }
}