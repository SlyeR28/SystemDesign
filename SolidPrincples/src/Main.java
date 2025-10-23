import SingleResponsiblePrinciple.Follows.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() throws InterruptedException {


    Product product1 = new Product("Laptop", 45000);
    Product product2 = new Product("Mouse", 450);
    Product product3 = new Product("Monitor", 4500);
    Product product4 = new Product("Keyboard", 500);

    List<Product> list = new ArrayList<>();
    list.add(product1);
    list.add(product2);
    list.add(product3);
    list.add(product4);

    ShoppingCart cart = new ShoppingCart(list);
//    CartInvociePrinter invociePrinter = new CartInvociePrinter();
////    CarDbStorage carDbStorage = new CarDbStorage();
//
//    System.out.println( cart.calculateCart());
//    invociePrinter.printInvoice(cart);
//    carDbStorage.savetoDatabase(cart);
//    carDbStorage.savetoDatabaseFile(cart);
//    carDbStorage.savetoDatabaseMongo(cart);

    DbPersistance toSql = new SavetoSql();
    toSql.save(cart);
    DbPersistance toMongo = new SavetoMongiDb();
    toMongo.save(cart);
    DbPersistance tofile = new SavetoFile();
    tofile.save(cart);

}
