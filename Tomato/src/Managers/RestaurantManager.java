package Managers;

import Entity.Resturant;

import java.util.ArrayList;
import java.util.List;

public class RestaurantManager {

    private List<Resturant> resturantList= new ArrayList<>();
    private static RestaurantManager instance = null;

    private RestaurantManager() {
    }

    public static RestaurantManager getInstance(){
        if(instance == null){
            instance = new RestaurantManager();
        }
        return instance;
    }


    public void addResturant(Resturant resturant) {
        resturantList.add(resturant);
    }

    public List<Resturant> SerachBYLocation(String location){
        List<Resturant> result = new ArrayList<>();
        location = location.toLowerCase();
        for (Resturant r : result) {
            String rl = r.getLocation().toLowerCase();
            if (rl.equals(location)) {
                result.add(r);
            }
        }
        return result;

    }
}
