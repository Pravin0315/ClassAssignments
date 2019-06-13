package animals;

public class Horse extends Kingdom {

    public Horse(String name, String kingdom, String phylum) {

        super(name, kingdom, phylum);
    }

    @Override
    public void eating() {
        System.out.println("The " + name + " eats a carrot!");
    }

    @Override
    public void kingdomInfo() {
        System.out.println("I am a " + name +"\n" + "I am part of the " + phylum + " phylum."+"\n" + "I am part of the " + kingdom + " kingdom.");    }

    @Override
    public void sleeping() {
        System.out.println("The " + name + " sleeps in his stall in the barn.");
    }

    @Override
    public void swimming() {
        System.out.println("I've never seen a " + name + " swim before, this would be interesting to see.");
    }
}
