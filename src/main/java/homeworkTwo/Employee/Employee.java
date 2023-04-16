package homeworkTwo.Employee;

import homeworkTwo.Department.Department;

public abstract class Employee {
    private Department department;
    private String name;
    private double wage;
    private boolean onTheClock;
    private boolean beHelpful;

    public boolean isHelpful() {
        return beHelpful;
    }

    public void setIsHelpful(boolean beHelpful) {
        this.beHelpful = beHelpful;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public boolean isOnTheClock() {
        return onTheClock;
    }

    public void setOnTheClock(boolean onTheClock) {
        this.onTheClock = onTheClock;
    }

    public String greetCustomer(){
        return "Hello! How can I help you?";
    }
}
