package animals;

public class Elephant extends Kingdom {

    public Elephant(String name, String kingdom, String phylum) {

        super(name, kingdom, phylum);
    }

    @Override
    public void eating() {
        System.out.println("The "+ name + " shreds a tree bare of leaves!");
    }

    @Override
    public void kingdomInfo() {
        System.out.println("I am a " + name +"\n" + "I am part of the " + phylum + " phylum."+"\n" + "I am part of the " + kingdom + " kingdom.");
    }


    @Override
    public void sleeping() {
        System.out.println("Do " + name + "s sleep standing up or sitting down? I want to know.");
    }

    @Override
    public void swimming() {
        System.out.println(name +"s are adorable when they swim, check it out on YouTube.");
    }
}

