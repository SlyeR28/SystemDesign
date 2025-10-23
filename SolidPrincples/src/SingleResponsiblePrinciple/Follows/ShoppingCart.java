package SingleResponsiblePrinciple.Follows;

import java.util.List;

public class ShoppingCart {

   private List<Product> productList;

   public double calculateCart(){
       double total = 0;

       for(Product product : productList){
           total += product.getPrice();
       }
       return total;
   }


    public ShoppingCart() {
    }

    public ShoppingCart(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
