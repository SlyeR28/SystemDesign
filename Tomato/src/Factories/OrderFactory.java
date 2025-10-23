package Factories;

import Entity.*;
import Strategies.PaymentStrategy;

import java.util.List;

public interface OrderFactory {

    Order createFactory(User user , Cart cart , Resturant resturant , List<Menu>menuList,
                        PaymentStrategy paymentStrategy , double totalCost , String orderType);
}
