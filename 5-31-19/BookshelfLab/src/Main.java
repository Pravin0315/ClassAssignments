import store.Bookstore;
import store.CoffeeShop;
import store.ConvenienceStore;
import store.SandwichShop;

public class Main {

    public static void main(String[] args) {

        Bookstore thatBB = new Bookstore("Bruice's Bookstore", "2025 Bruicey Lane", "Booktitles.txt");

        thatBB.setOpenAt(10, 0);

        thatBB.setClosedAt(22, 30);

        thatBB.setHasUsedBooks(true);

        thatBB.hasUsedBooks();

        thatBB.isOpen();

        System.out.println("The book store has " + thatBB.numBooks() + " books.");
        System.out.println("The books we have in store are: " + thatBB.getTitles());

        ConvenienceStore thatKKS = new ConvenienceStore("Kyle's Konvenience Store", "4416 Kyle Kourt", "ConvenienceStoreItems.txt");

        thatKKS.setOpenAt(10, 0);

        thatKKS.setClosedAt(22, 30);

        thatKKS.setItems(true);

        thatKKS.hasItems();

        thatKKS.isOpen();

        System.out.println("The convenience store has " + thatKKS.numItems() + " items.");
        System.out.println("The convenience store has " + thatKKS.getItems());

        CoffeeShop thatCCC = new CoffeeShop("Candace's Cupcake & Coffee Corporation", "3531 Candance Causeway", "CoffeeShopMenu.txt");

        thatCCC.setOpenAt(10, 0);

        thatCCC.setClosedAt(22, 30);

        thatCCC.setCoffee(true);

        thatCCC.hasCoffee();

        thatCCC.isOpen();

        System.out.println("The coffee shop has " + thatCCC.numCoffee() + " items.");
        System.out.println("The coffee shop has " + thatCCC.getCoffee());

        SandwichShop thatSSS = new SandwichShop("Steven's Sandwich Shop", "5607 Stevens Street", "SandwichShopMenu.txt");

        thatSSS.setOpenAt(10, 0);

        thatSSS.setClosedAt(22, 30);

        thatSSS.setMenu(true);

        thatSSS.hasMenu();

        thatSSS.isOpen();

        System.out.println("The sandwich shop has " + thatSSS.numMenu() + " items.");
        System.out.println("The menu for the sandwich shop consists of: " + thatSSS.getMenu());

    }
}
