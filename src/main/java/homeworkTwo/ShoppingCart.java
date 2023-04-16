package homeworkTwo;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private ArrayList<Item> contents;
    private boolean escape;
    private boolean hasWobblyWheel;

    public ShoppingCart(){
        this.contents = new ArrayList<>(15);
        this.escape = false;
        this.hasWobblyWheel = true;
    }

    public ShoppingCart(boolean hasWobblyWheel){
        this();
        this.hasWobblyWheel = hasWobblyWheel;
    }

    public ArrayList<Item> getContents() {
        return contents;
    }

    public void setContents(ArrayList<Item> contents) {
        this.contents = contents;
    }
    public boolean isEscaping() {
        return escape;
    }

    public void setEscape(boolean escape) {
        this.escape = escape;
    }

    public boolean hasWobblyWheel() {
        return hasWobblyWheel;
    }

    public void setHasWobblyWheel(boolean hasWobblyWheel) {
        this.hasWobblyWheel = hasWobblyWheel;
    }

}
