public class User
{
    private long inn;
    private String name;

    public User(String name,int inn)
    {
        this.name = name;
        this.inn = inn;
    }
    public long getInn()
    {
        return inn;
    }
    public String getName()
    {
        return name;
    }

}
