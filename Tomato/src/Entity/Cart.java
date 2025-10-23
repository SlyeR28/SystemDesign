package Entity;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private Resturant resturant;
    private List<Menu>menuList = new ArrayList<>();

    public Cart() {
        resturant = null;
    }

    public void addItem(Menu item){
        if(resturant == null){
            System.err.println("Cart : Set a restaurant before adding item...");
        }
        menuList.add(item);
    }

    public double getTotalCost(){
        double sum = 0;
        for(Menu it : menuList){
            sum += it.getPrice();
        }
        return sum;
    }

    public boolean isEmpty(){
        return resturant == null || menuList.isEmpty();
    }


    public void clear(){
        menuList.clear();
        resturant = null;
    }


    public List<Menu> getMenuList() {
        return menuList;
    }

    public Resturant getResturant() {
        return resturant;
    }

    public void setResturant(Resturant resturant) {
        this.resturant = resturant;
    }
}
