package Entity;

public class User {

    private Long  userId;
    private String name;
    private String address;
    private Cart cart;

    public User(String address, String name, Long userId) {
        this.address = address;
        this.name = name;
        this.userId = userId;
        this.cart = new Cart();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
