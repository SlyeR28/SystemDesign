package Entity;


import java.util.ArrayList;
import java.util.List;

public class Resturant {

    private static  int nextResutrantid = 0;
    private int resutrantId;
    private String name;

    private String location;

    private List<Menu> menuList = new ArrayList<>();

    public Resturant(String name, String location) {
        this.name = name;
        this.location = location;
        this.resutrantId = ++nextResutrantid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(Menu menu) {
         menuList.add(menu);
    }
}
