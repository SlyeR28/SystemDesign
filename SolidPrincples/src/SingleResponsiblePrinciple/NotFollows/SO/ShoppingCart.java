package SingleResponsiblePrinciple.NotFollows.SO;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Product> productList;

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

   public double CalculateTotalPrice(){
        double total = 0;
        for(Product product : productList){
             total += product.getPrice();
        }
        return total;
    }

    public void invoice(){
        for(Product product : productList){
            System.out.println(product.getName());
        }
    }
    void savetodatabase(){
        System.out.println("Saving to database");
    }

     static void main(String[] args) {

         ShoppingCart cart = new ShoppingCart();

        Product product1 = new Product("laptop" , 45000);
        Product product2 = new Product("mouse" , 450);
        Product product3 = new Product("monitor" , 4500);
        Product product4 = new Product("keyboard" , 500);

        List<Product>lsit = new ArrayList<>();
        lsit.add(product1);
        lsit.add(product2);
        lsit.add(product3);
        lsit.add(product4);

         cart.setProductList(lsit);


         System.out.println(cart.CalculateTotalPrice());
        cart.invoice();
        cart.savetodatabase();

        // this is not following  the single responsibility principle of solid b/c we have add all method to once class
        // in future if we want to make changes in any method we change the class logic also
    }

}
