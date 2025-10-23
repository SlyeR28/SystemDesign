package Entity;

import Strategies.PaymentStrategy;

import java.util.ArrayList;
import java.util.List;

public abstract class Order {
    private static int nextOrder = 0;

    protected int  orderId;
    protected User user;
    protected Resturant resturant;
    protected List<Menu> menuList = new ArrayList<>();
    protected PaymentStrategy paymentStrategy;
    protected double total;
    protected String scheduled;

    public Order() {
        this.user = null;
        this.resturant = null;
        this.paymentStrategy = null;
        this.orderId = ++nextOrder;
        this.scheduled = "";
        this.total = 0.0;
    }

    public boolean processPayment(){
        if(paymentStrategy != null){
            paymentStrategy.Pay(total);
            return true;
        }else {
            System.out.println("Please choose a payment mode first");
            return false;
        }
    }

    public abstract String getType();


    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> its) {
        menuList = its;
        total = 0;
        for(Menu it : its){
            total += it.getPrice();
        }
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public Resturant getResturant() {
        return resturant;
    }

    public void setResturant(Resturant resturant) {
        this.resturant = resturant;
    }

    public String getScheduled() {
        return scheduled;
    }

    public void setScheduled(String scheduled) {
        this.scheduled = scheduled;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
