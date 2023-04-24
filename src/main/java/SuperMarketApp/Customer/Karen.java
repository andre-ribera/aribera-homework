package SuperMarketApp.Customer;

public final class Karen extends Customer {
    private static boolean askForManager;
    private static String complaint;

    static {
        if (askForManager) {
            complaint = "Do you have any idea who my husband is?!";
        }
    }

    public Karen() {
        this.askForManager = false;
    }

    public Karen(boolean askForManager) {
        this.askForManager = askForManager;
    }

    public Karen(boolean askForManager, String complaint) {
        this(askForManager);
        this.complaint = complaint;
    }

    public boolean isAskingForManager() {
        return askForManager;
    }

    public final void askForManager(boolean askForManager) {
        this.askForManager = askForManager;
    }

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }
}
