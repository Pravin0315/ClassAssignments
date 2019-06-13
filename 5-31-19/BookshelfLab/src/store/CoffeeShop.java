package store;

import java.io.IOException;
import java.util.ArrayList;

public class CoffeeShop extends Store {
    boolean hasCoffee;
    private ArrayList<String> coffee;
    public CoffeeShop() {
    }

    public CoffeeShop(String name, String address, String input) {
        super(name, address);
        // init the array and then load it.
        coffee = new ArrayList<String>();
        loadCoffee(input);
    }
    public int numCoffee(){
        return coffee.size();
    }

    public boolean hasCoffee() {
        return hasCoffee;
    }

    public void setCoffee(boolean hasCoffee) {
        this.hasCoffee = hasCoffee;
    }

    public boolean coffeeHasWord(String word) {
        for (String item : coffee) {
            if (item.contains(word)) return true;
        }
        return false;
    }

    private void loadCoffee(String input)
    {
        try
        {
            Utils.loadStringsToArray(input, this.coffee);
        }
        catch (IOException e)
        {
            // for now simply init the array to zero
            System.out.println("Could not initilize this menu");
            // make sure it is empty
            this.coffee = new ArrayList<String>();

        }
    }

    public ArrayList<String> getCoffee() {
        return coffee;
    }
}
