package SingleResponsiblePrinciple.Follows;

public class CartInvociePrinter {

    private ShoppingCart cart;


    public CartInvociePrinter() {

    }

    public CartInvociePrinter(ShoppingCart cart) {
        this.cart = cart;
    }

    public void printInvoice(ShoppingCart cart){
        System.out.println("cart invoice...started");
        for(Product product :cart.getProductList()){
            System.out.println(product.getName() + " :-> " + product.getPrice());
        }
        System.out.println(cart.calculateCart());
        System.out.println("-----------------");
    }


    public ShoppingCart getCart() {
        return cart;
    }

    public void setCart(ShoppingCart cart) {
        this.cart = cart;
    }



}
