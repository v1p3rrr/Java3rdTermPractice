public class Subjects
{
    private String name;
    private int mark;
    public Subjects(String name, int mark)
    {
        this.name = name;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}
