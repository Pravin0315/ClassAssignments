package animals;

public class Alligator extends Kingdom{

    public Alligator(String name, String kingdom, String phylum) {
        super(name, kingdom, phylum);
    }

    @Override
    public void eating() {
        System.out.println("The " + name + " eats meat!");
    }

    @Override
    public void kingdomInfo() {
        System.out.println("I am a " + name +"\n" + "I am part of the " + phylum + " phylum."+"\n" + "I am part of the " + kingdom + " kingdom.");    }

    @Override
    public void sleeping() {
        System.out.println("An " + name + " sleeps with it's nose out the water so it can breathe");
    }

    @Override
    public void swimming() {
        System.out.println(name + " spend most of their lives in the water but do go on land, watch out if you are on a golf course in Florida.");
    }
}
