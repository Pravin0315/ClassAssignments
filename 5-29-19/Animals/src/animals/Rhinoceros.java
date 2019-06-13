package animals;

public class Rhinoceros extends Kingdom {

    public Rhinoceros(String name, String kingdom, String phylum) {
        super(name, kingdom, phylum);
    }

    @Override
    public void eating() {
        System.out.println(name + " devours food!");
    }

    @Override
    public void kingdomInfo() {
        super.kingdomInfo();
    }

    @Override
    public void sleeping() {
        super.sleeping();
    }

    @Override
    public void swimming() {
        super.swimming();
    }
}
