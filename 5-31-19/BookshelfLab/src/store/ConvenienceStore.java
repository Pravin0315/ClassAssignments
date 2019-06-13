package store;

import java.io.IOException;
import java.util.ArrayList;

public class ConvenienceStore extends Store {
    boolean hasItems;
    private ArrayList<String> items;
    public ConvenienceStore() {

    }

    public ConvenienceStore(String name, String address, String input) {
        super(name, address);
        // init the array and then load it.
        items = new ArrayList<String>();
        loadItems(input);
    }
    public int numItems(){
        return items.size();
    }

    public boolean hasItems() {
        return hasItems;
    }

    public void setItems(boolean hasItems) {
        this.hasItems = hasItems;
    }

    public boolean itemHasWord(String word) {
        for (String item : items) {
            if (item.contains(word)) return true;
        }
        return false;
    }

    private void loadItems(String input)
    {
        try
        {
            Utils.loadStringsToArray(input, this.items);
        }
        catch (IOException e)
        {
            // for now simply init the array to zero
            System.out.println("Could not initilize the items");
            // make sure it is empty
            this.items = new ArrayList<String>();

        }
    }

    public ArrayList<String> getItems() {
        return items;
    }
}
