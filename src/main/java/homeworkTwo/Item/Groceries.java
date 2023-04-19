package homeworkTwo.Item;

import homeworkTwo.Department.Department;
import homeworkTwo.Department.ProduceDepartment;

public  class Groceries extends Item {

    public Groceries(String type, int amountInStock, double price, double cost){
        super(type, new ProduceDepartment(), amountInStock, price, cost);
    }

    @Override
    public String toString() {
        return "*** Item ***\n" +
                "type = " + type + "\n" +
                "department = " + department + "\n" +
                "amountInStock = " + amountInStock + "\n" +
                "price = " + price + "\n" +
                "cost = " + cost + "\n" +
                "*******\n";
    }
}
