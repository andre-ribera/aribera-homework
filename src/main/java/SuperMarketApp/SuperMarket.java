package SuperMarketApp;

import SuperMarketApp.Customer.Customer;
import SuperMarketApp.Customer.Karen;
import SuperMarketApp.Department.ProduceDepartment;
import SuperMarketApp.Employee.Bagger;
import SuperMarketApp.Employee.Cashier;
import SuperMarketApp.Employee.ProduceManager;
import SuperMarketApp.Employee.StoreManager;
import SuperMarketApp.Item.Groceries;
import SuperMarketApp.Item.Item;

import java.util.LinkedList;
import java.util.Queue;

public class SuperMarket {


    public static void main(String[] args) {
        Customer marge = new Customer("Marge");
        Customer frederickson = new Customer("Mr. Frederickson");
        Karen karen = new Karen();
        Bagger bobby = new Bagger();
        Cashier sueAnne = new Cashier("SueAnne");
        ProduceManager miles = new ProduceManager();
        StoreManager kurt = new StoreManager();
        ShoppingCart karenCart = new ShoppingCart(true);
        Queue<Customer> checkoutLine = new LinkedList<>();
        Queue<Item> conveyorBelt = new LinkedList<>();

        ProduceDepartment produceDepartment = new ProduceDepartment();

        Groceries tomatoes = new Groceries("tomatoes", 100, 0.75D, 0.25D);
        Groceries potatoes = new Groceries("potatoes", 100, 0.5D, 0.10D);
        Groceries milk = new Groceries("milk", 100, 3D, 1.5D);
        Groceries butter = new Groceries("butter", 100, 5D, 2D);
        Groceries flour = new Groceries("flour", 100, 5D, 2D);
        Groceries cheese = new Groceries("cheese", 100, 8D, 5D);
        Groceries salad = new Groceries("salad", 100, 3D, 1D);
        Groceries celery = new Groceries("celery", 100, 3D, 0.5D);

        karenCart.addToCart(tomatoes);
        karenCart.addToCart(potatoes);
        karenCart.addToCart(milk);
        karenCart.addToCart(butter);
        karenCart.addToCart(flour);
        karenCart.addToCart(cheese);
        karenCart.addToCart(salad);
        karenCart.addToCart(celery);

        checkoutLine.add(frederickson);
        checkoutLine.add(marge);
        checkoutLine.add(karen);

        conveyorBelt = karen.loadItemsOntoBelt(karenCart);

        System.out.println(sueAnne.getName() + ": Your total today is: " + sueAnne.checkout(conveyorBelt) + "\n");

        for (Item item : bobby.bagGroceries(conveyorBelt)) {
            if(item.isDented()){
                karen.askForManager();
                System.out.println(karen.getComplaint());
            }
        }

//        System.out.println(karenCart.getContents());

    }
}
