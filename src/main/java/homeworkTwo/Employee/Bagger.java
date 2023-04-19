package homeworkTwo.Employee;

import homeworkTwo.Item.Item;
import homeworkTwo.ShoppingCart;

import java.util.ArrayList;
import java.util.Random;

public class Bagger extends Employee {
    private boolean collectCarts;

    public ArrayList<Item> bagGroceries(ShoppingCart groceries){
        Random random = new Random();
        byte dent = (byte) random.nextInt(99);
        ArrayList<Item> bags = new ArrayList<>(groceries.getContents().size());

        for(Item item : groceries.getContents()){
            item.isDented(dent);
            bags.add(item);
        }
        return bags;
    }

    public boolean isCollectCarts() {
        return collectCarts;
    }

    public void setCollectCarts(boolean collectCarts) {
        this.collectCarts = collectCarts;
    }
}
