public class Series implements Nameable
{
    private String name;
    private String producer = "N/A";
    private int episodes;

    public Series(String name, String producer, int episodes)
    {
        this.name=name;
        this.producer=producer;
        this.episodes=episodes;
    }

    public Series(String name, int episodes)
    {
        this.name=name;
        this.episodes = episodes;
    }

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
