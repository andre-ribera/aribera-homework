package SuperMarketApp.Employee;

public abstract class Manager extends Employee{

    private boolean respondToKaren;
    private int orderStock;

    public boolean didRespondToKaren() {
        return respondToKaren;
    }

    public void setRespondToKaren(boolean respondToKaren) {
        this.respondToKaren = respondToKaren;
    }

    public int getOrderStock() {
        return orderStock;
    }

    public void setOrderStock(int orderStock) {
        this.orderStock = orderStock;
    }

    public abstract String morningMeeting();

    public String doTheBooks() {
        return "doing the books";
    }

}
