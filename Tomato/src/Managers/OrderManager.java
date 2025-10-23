package Managers;

import Entity.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    private List<Order> orderList = new ArrayList<>();
    private static OrderManager instance = null;

    private OrderManager() {
    }

    public static OrderManager getInstance(){
        if(instance == null){
            instance = new OrderManager();
        }
        return instance;
    }


    public void addOrder(Order order) {
        orderList.add(order);
    }

    public void listOrders() {
        System.out.println("\n--- All Orders ---");
        for (Order order : orderList) {
            System.out.println(order.getType() + " order for " + order.getUser().getName()
                    + " | Total: ₹" + order.getTotal()
                    + " | At: " + order.getScheduled());
        }
    }
}
