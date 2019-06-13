package animals;

public class Tiger extends Kingdom{
    String name = "Tiger";
    public Tiger(String name, String kingdom, String phylum) {
        super(name, kingdom, phylum);
    }

    @Override
    public void eating() {
        System.out.println("The " + name + " devours a chicken!");
    }

    @Override
    public void kingdomInfo() {
        System.out.println("I am a " + name +"\n" + "I am part of the " + phylum + " phylum."+"\n" + "I am part of the " + kingdom + " kingdom.");    }


    @Override
    public void sleeping() {
        System.out.println("The " + name + " sleeps in a tree.");
    }

    @Override
    public void swimming() {
        System.out.println(name + "s love swimming!");
    }
}
