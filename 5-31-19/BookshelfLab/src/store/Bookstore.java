package store;

import java.io.IOException;
import java.util.ArrayList;

public class Bookstore extends Store {
    boolean hasUsedBooks;
    private ArrayList<String> titles;

    public Bookstore() {
    }

    public Bookstore(String name, String address, String input) {
        super(name, address);
        // init the array and then load it.
        titles = new ArrayList<String>();
        loadTitles(input);
    }

    public int numBooks(){
        return titles.size();
    }

    public boolean hasUsedBooks() {
        return hasUsedBooks;
    }

    public void setHasUsedBooks(boolean hasUsedBooks) {
        this.hasUsedBooks = hasUsedBooks;
    }

    public boolean titleHasWord(String word) {
        for (String item : titles) {
            if (item.contains(word)) return true;
        }
                return false;
    }

    private void loadTitles(String input)
    {
        try
        {
            Utils.loadStringsToArray(input, this.titles);
        }
        catch (IOException e)
        {
            // for now simply init the array to zero
            System.out.println("Could not initilize the titles");
            // make sure it is empty
            this.titles = new ArrayList<String>();

        }
    }

    public ArrayList<String> getTitles() {
        return titles;
    }
}
