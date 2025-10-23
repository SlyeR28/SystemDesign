package Factories;

import Entity.*;
import Strategies.PaymentStrategy;
import Utils.TimeUtils;

import java.util.List;

public class ScheduledOrder implements OrderFactory {

    private String scheduleTime;


    public ScheduledOrder(String scheduleTime) {
        this.scheduleTime = scheduleTime;
    }

    @Override
    public Order createFactory(User user, Cart cart, Resturant resturant, List<Menu> menuList,
                               PaymentStrategy paymentStrategy, double totalCost, String orderType) {


        Order order = null;

        if(orderType.equals("Delivery")){
            DeliverOrder deliverOrder = new DeliverOrder();
            deliverOrder.setUserAddress(user.getAddress());
            order = deliverOrder;
        }else{
            PickupOrder pickupOrder = new PickupOrder();
            pickupOrder.setResturantAddress(resturant.getLocation());
            order = pickupOrder;
        }

        order.setUser(user);
        order.setResturant(resturant);
        order.setMenuList(menuList);
        order.setPaymentStrategy(paymentStrategy);
        order.setScheduled(TimeUtils.getCurrentTime());
        order.setTotal(totalCost);
        return order;
    }
}
