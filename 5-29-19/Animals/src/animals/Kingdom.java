package animals;
public class Kingdom {
    String name;
    String kingdom;
    String phylum;

    public Kingdom(String name, String kingdom, String phylum) {
        this.name = name;
        this.kingdom = kingdom;
        this.phylum = phylum;
    }

    //methods
    public void kingdomInfo() {
        System.out.println("Welcome to the Jungle!");
    }

    public void swimming() {
        System.out.println("Just keep swimming");
    }

    public void eating() {
        System.out.println("Time to eat");
    }

    public void sleeping() {
        System.out.println("Shhh, the animal is sleeping" );
    }


}
