package SuperMarketApp;

import SuperMarketApp.Customer.Customer;
import SuperMarketApp.Customer.Karen;
import SuperMarketApp.Department.ProduceDepartment;
import SuperMarketApp.Employee.Bagger;
import SuperMarketApp.Employee.ProduceManager;
import SuperMarketApp.Employee.StoreManager;
import SuperMarketApp.Item.Groceries;

public class SuperMarket {


    public static void main(String[] args) {
        Karen karen = new Karen();
        Customer marge = new Customer();
        Bagger bobby = new Bagger();
        ProduceManager miles = new ProduceManager();
        StoreManager kurt = new StoreManager();
        ShoppingCart karenCart = new ShoppingCart(true);

        ProduceDepartment produceDepartment = new ProduceDepartment();

        Groceries tomatoes = new Groceries("tomatoes", 100, 0.75D, 0.25D);
        Groceries potatoes = new Groceries("potatoes", 100, 0.5D, 0.10D);
        Groceries milk = new Groceries("milk", 100, 3D, 1.5D);

        karenCart.addToCart(tomatoes);
        karenCart.addToCart(potatoes);
        karenCart.addToCart(milk);

        System.out.println("before bagging " + karenCart.toString());

        bobby.bagGroceries(karenCart);

        System.out.println("after bagging " + karenCart.toString());

    }
}
