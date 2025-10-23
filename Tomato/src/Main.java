import Entity.Order;
import Entity.Resturant;
import Entity.User;
import Strategies.UpiPayment;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TomatoApp tomatoApp = new TomatoApp();

        User user = new User("Delhi", "Aditya", 101L);
        System.out.println("User: " + user.getName() + " is active.");

        List<Resturant> resturants = tomatoApp.searchRestaurants("Delhi");

        if(resturants.isEmpty()){
            System.out.println("No restaurants found!");
           return;
         }

        System.out.println("Found Restaurants:");
        for (Resturant restaurant : resturants) {
            System.out.println(" - " + restaurant.getName());
        }

        tomatoApp.selectResturant(user , resturants.get(0));
        System.out.println("Selected Restaurant " +resturants.get(0).getName());

        //
        tomatoApp.addToCart(user , 1L);
        tomatoApp.addToCart(user , 2L);

        tomatoApp.printUserCart(user);

        Order order = tomatoApp.checkOutNow(user , "Delivery" , new UpiPayment("123457854"));

        tomatoApp.payForOrder(user , order);

    }
}
