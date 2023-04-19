package homeworkTwo;

import homeworkTwo.Customer.Customer;
import homeworkTwo.Customer.Karen;
import homeworkTwo.Department.ProduceDepartment;
import homeworkTwo.Employee.Bagger;
import homeworkTwo.Item.Groceries;

public class SuperMarket {

    
    public static void main(String[] args) {
        Karen karen = new Karen();
        Customer marge = new Customer();
        Bagger bobby = new Bagger();
        ShoppingCart karenCart = new ShoppingCart(true);

        ProduceDepartment produceDepartment = new ProduceDepartment();

        Groceries tomatoes = new Groceries("tomatoes", 100, 0.75D, 0.25D);
        Groceries potatoes  = new Groceries("potatoes", 100, 0.5D, 0.10D);
        Groceries milk = new Groceries("milk", 100, 3D, 1.5D);

        karenCart.addToCart(tomatoes);
        karenCart.addToCart(potatoes);
        karenCart.addToCart(milk);

        System.out.println(karenCart.toString());

    }
}
