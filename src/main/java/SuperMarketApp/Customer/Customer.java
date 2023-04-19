package SuperMarketApp.Customer;

import SuperMarketApp.ShoppingCart;

public class Customer {
    private boolean askForAssistance;
    private boolean shop;
    private ShoppingCart shoppingCart;
    private double money;

    public Customer(){
        this.askForAssistance = false;
        this.shop = true;
        this.shoppingCart = new ShoppingCart();
        this.money = money;
    }

    public boolean isAskingForAssistance() {
        return askForAssistance;
    }

    public void setAskForAssistance(boolean askForAssistance) {
        this.askForAssistance = askForAssistance;
    }

    public boolean isShopping() {
        return shop;
    }

    public void setShop(boolean shop) {
        this.shop = shop;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
