package animals;

public class Koala extends Kingdom {

    public Koala(String name, String kingdom, String phylum) {

        super(name, kingdom, phylum);
    }

    @Override
    public void eating() {

        System.out.println("The " + name + " munches on a eucalyptus leaf!");
    }

    @Override
    public void kingdomInfo() {
        System.out.println("I am a " + name +"\n" + "I am part of the " + phylum + " phylum."+"\n" + "I am part of the " + kingdom + " kingdom.");
    }


    @Override
    public void sleeping() {
        System.out.println("A " + name + " sleeps a lot, I'm actually pretty jealous of it's ability to sleep that much.");
    }

    @Override
    public void swimming() {
        System.out.println("Anything a " + name + " does is adorable, I'm off to Austrailia to see one swimming.");
    }
}
