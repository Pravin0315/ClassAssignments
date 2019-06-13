package animals;

public class BaldEagle extends Kingdom{

    public BaldEagle(String name, String kingdom, String phylum) {
        super(name, kingdom, phylum);
    }

    @Override
    public void eating() {
        System.out.println("The " + name + " swoops down and snatches a fish out a river!");
    }

    @Override
    public void kingdomInfo() {
        System.out.println("I am a " + name +"\n" + "I am part of the " + phylum + " phylum."+"\n" + "I am part of the " + kingdom + " kingdom.");    }

    @Override
    public void sleeping() {
        System.out.println("The " + name + " sleeps in it's nest.");
    }

    @Override
    public void swimming() {
        System.out.println("The " + name + " swims but is more known for flying, because it's a bird.");
    }
}
