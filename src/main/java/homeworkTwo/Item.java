package homeworkTwo;

import homeworkTwo.Department.Department;

public abstract class Item {
    private String type;
    private Department department;
    private int amountInStock;
    private double price;
    private double cost;
    private boolean isDented;

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

    public boolean isDented() {
        return isDented;
    }

    public void setDented(boolean dented) {
        isDented = dented;
    }
}
