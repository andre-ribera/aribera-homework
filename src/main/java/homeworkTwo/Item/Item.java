package homeworkTwo.Item;

import homeworkTwo.Department.Department;

import java.util.Objects;

public abstract class Item {
    protected String type;
    protected Department department;
    protected int amountInStock;
    protected double price;
    protected double cost;
    protected boolean isDented;

    public Item(String type, int amountInStock, double price, double cost){
        this.type = type;
        this.amountInStock = amountInStock;
        this.price = price;
        this.cost = cost;
        this.isDented = false;
    }

    public Item(String type, Department department, int amountInStock, double price, double cost){
        this.type = type;
        this.department = department;
        this.amountInStock = amountInStock;
        this.price = price;
        this.cost = cost;
        this.isDented = false;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getAmountInStock() {
        return amountInStock;
    }

    public void setAmountInStock(int amountInStock) {
        this.amountInStock = amountInStock;
    }

    public boolean isDented(byte num) {
        if(num == 6 || num == 66){
            return true;
        }
        return false;
    }

    public void setDented(boolean dented) {
        isDented = dented;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return type.equals(item.type) && department.equals(item.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, department);
    }
}
