package SuperMarketApp.Customer;

import java.util.HashSet;
import java.util.Set;

public final class Karen extends Customer {
    private static boolean askForManager;
    private static String complaint;

    static {
        if (askForManager) {
            complaint = "Do you have any idea who my husband is?!";
        }
    }

    public Karen() {
        askForManager = false;
    }

    public Karen(boolean askForManager) {
        Karen.askForManager = askForManager;
    }

    public Karen(boolean askForManager, String complaint) {
        this(askForManager);
        Karen.complaint = complaint;
    }

    public boolean isAskingForManager() {
        return askForManager;
    }

    public final void askForManager() {
        Karen.askForManager = true;
    }

    public String getComplaint() {
        if(askForManager){
            this.setComplaint("DO YOU HAVE ANY IDEA WHO MY HUSBAND IS?!");
        }

        return complaint;
    }

    public void setComplaint(String complaint) {
        Karen.complaint = complaint;
    }
}
