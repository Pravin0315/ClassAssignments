package animals;

public class SeaTurtle extends Kingdom {

    public SeaTurtle(String name, String kingdom, String phylum) {
        super(name, kingdom, phylum);
    }

    @Override
    public void eating() {
        System.out.println("The " + name + " eats some fish!");
    }

    @Override
    public void kingdomInfo() {
        System.out.println("I am a " + name +"\n" + "I am part of the " + phylum + " phylum."+"\n" + "I am part of the " + kingdom + " kingdom.");    }

    @Override
    public void sleeping() {
        System.out.println("Where does a " + name + " sleep? In the water or does it find an island if that's closer?");
    }

    @Override
    public void swimming() {
        System.out.println("A " + name + " can swim for a long time, I assume.");
    }
}
