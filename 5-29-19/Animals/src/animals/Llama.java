package animals;

public class Llama extends Kingdom {
    
    public Llama(String name, String kingdom, String phylum) {
        super(name, kingdom, phylum);
    }

    @Override
    public void eating() {
        System.out.println("The " + name + " eats grass!");
    }

    @Override
    public void kingdomInfo() {
        System.out.println("I am a " + name +"\n" + "I am part of the " + phylum + " phylum."+"\n" + "I am part of the " + kingdom + " kingdom.");    }

    @Override
    public void sleeping() {
        System.out.println("I bet " + name + "s are super cozy when they sleep.");
    }

    @Override
    public void swimming() {
        System.out.println("A swimming " + name + " would look like a shaggy dog that just got a bath.");;
    }
}
