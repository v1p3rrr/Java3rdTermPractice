public class Film implements Nameable
{


    private String name;
    private String producer = "N/A";

    public Film(String name, String producer)
    {
        this.name=name;
        this.producer=producer;
    }

    public Film(String name)
    {
        this.name=name;
    }

    @Override
    public void newName(String name) {
        this.name=name;
    }

    public void outputName()
    {
        System.out.println(this.name + " by " + this.producer);
    }

    public String getName()
    {
        return this.name;
    }


}
