import Entity.*;
import Factories.NowOrder;
import Factories.OrderFactory;
import Factories.ScheduledOrder;
import Managers.OrderManager;
import Managers.RestaurantManager;
import Services.NotificationService;
import Strategies.PaymentStrategy;

import java.util.List;

public class TomatoApp {

    public TomatoApp() {
        initializeRestaurants();
    }

    public void initializeRestaurants(){
        Resturant restaurant1 = new Resturant("Bikaner", "Delhi");
        restaurant1.setMenuList(new Menu(1L, "Chole Bhature", 120));
        restaurant1.setMenuList(new Menu(2L, "Samosa", 15));

        Resturant restaurant2 = new Resturant("Haldiram", "Kolkata");
        restaurant2.setMenuList(new Menu(1L, "Raj Kachori", 80));
        restaurant2.setMenuList(new Menu(2L, "Pav Bhaji", 100));
        restaurant2.setMenuList(new Menu(3L, "Dhokla", 50));

        Resturant restaurant3 = new Resturant("Saravana Bhavan", "Chennai");
        restaurant3.setMenuList(new Menu(1L, "Masala Dosa", 90));
        restaurant3.setMenuList(new Menu(2L, "Idli Vada", 60));
        restaurant3.setMenuList(new Menu(3L, "Filter Coffee", 30));

        RestaurantManager restaurantManager  = RestaurantManager.getInstance();
        restaurantManager.addResturant(restaurant1);
        restaurantManager.addResturant(restaurant2);
        restaurantManager.addResturant(restaurant3);
    }

    public List<Resturant> searchRestaurants(String loc){
        return RestaurantManager.getInstance().SerachBYLocation(loc);
    }

    public void selectResturant(User user , Resturant resturant){
        Cart cart = user.getCart();
        cart.setResturant(resturant);
    }

    public void addToCart(User user , Long itemId){
        Resturant resturant = user.getCart().getResturant();
        if (resturant == null){
            System.out.println("please select restaurant first....");
           return;
        }
        for(Menu it : resturant.getMenuList()){
            if(it.getId().equals(itemId)){
                user.getCart().addItem(it);
                break;
            }
        }
    }


    public  Order checkOutNow(User user , String orderType , PaymentStrategy paymentStrategy){
        return checkOut(user , orderType , paymentStrategy , new NowOrder());

    }

    public Order checkOutScheduled(User user , String orderType,
                                   PaymentStrategy paymentStrategy ,
                                   String scheduleTime){
     return checkOut(user , orderType , paymentStrategy , new ScheduledOrder(scheduleTime));
    }

    public Order checkOut(User user , String orderType , PaymentStrategy paymentStrategy , OrderFactory orderFactory)
    {
        if(user.getCart().isEmpty())return null;

        Cart userCart = user.getCart();
        Resturant orderderRestaurant = userCart.getResturant();
        List<Menu>itemOrdered = userCart.getMenuList();
        double totalcost = userCart.getTotalCost();

        Order order = orderFactory.createFactory(user , userCart , orderderRestaurant , itemOrdered , paymentStrategy , totalcost,
                orderType);
        OrderManager.getInstance().addOrder(order);
        return order;
    }

    public void payForOrder(User user , Order order){
        boolean isPaymentSucess = order.processPayment();

        if(isPaymentSucess){
            NotificationService.notfify(order);
            user.getCart().clear();
        }

    }
    public void printUserCart(User user) {
        System.out.println("Items in cart:");
        System.out.println("------------------------------------");
        for (Menu item : user.getCart().getMenuList()) {
            System.out.println(item.getId() + " : " + item.getName() + " : ₹" + item.getPrice());
        }
        System.out.println("------------------------------------");
        System.out.println("Grand total : ₹" + user.getCart().getTotalCost());
    }


}
