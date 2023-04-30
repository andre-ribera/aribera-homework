package SuperMarketApp.Employee;

import SuperMarketApp.Item.Item;
import SuperMarketApp.ShoppingCart;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Cashier extends Employee{
    Bagger bagger = new Bagger();

    public Cashier(){
        super();
    }

    public Cashier(String name){
        super(name);
    }

    public double checkout(Queue<Item> conveyorbelt){
        double sum = 0d;

        for(Item item : conveyorbelt){
            sum += item.getCost();
        }

        return sum;

    }
}
