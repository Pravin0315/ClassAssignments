package store;

import java.io.IOException;
import java.util.ArrayList;

public class SandwichShop extends Store {
    boolean hasMenu;
    private ArrayList<String> menu;
    public SandwichShop() {
    }

    public SandwichShop(String name, String address, String input) {
        super(name, address);
        // init the array and then load it.
        menu = new ArrayList<String>();
        loadMenu(input);
    }
    public int numMenu(){
        return menu.size();
    }

    public boolean hasMenu() {
        return hasMenu;
    }

    public void setMenu(boolean hasCoffee) {
        this.hasMenu = hasCoffee;
    }

    public boolean menuHasWord(String word) {
        for (String item : menu) {
            if (item.contains(word)) return true;
        }
        return false;
    }

    private void loadMenu(String input)
    {
        try
        {
            Utils.loadStringsToArray(input, this.menu);
        }
        catch (IOException e)
        {
            // for now simply init the array to zero
            System.out.println("Could not initilize this menu");
            // make sure it is empty
            this.menu = new ArrayList<String>();

        }
    }

    public ArrayList<String> getMenu() {
        return menu;
    }
}
