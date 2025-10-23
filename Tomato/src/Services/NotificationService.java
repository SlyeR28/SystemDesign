package Services;

import Entity.Menu;
import Entity.Order;

import java.util.List;

public class NotificationService {
    public static void notfify(Order order){
        System.out.println("\nNotification: New " +order.getType() + "order placed!.");
        System.out.println("-------------------------------------");
        System.out.println("Order Id : " + order.getOrderId());
        System.out.println("Customer : " + order.getUser().getName());
        System.out.println("Restaurant : " + order.getResturant().getName());
        System.out.println("Items Ordered : ");

        List<Menu> list = order.getMenuList();
        for(Menu items : list){
            System.out.println(" - " + items.getName() + "(₹ "+  items.getPrice() +" ) ");
        }
        System.out.println("Total : ₹ " + order.getTotal());
        System.out.println("Scheduled for " +order.getScheduled());
        System.out.println("Payment : Done");
        System.out.println("-----------------------------------");

    }
}
