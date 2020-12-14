public class Student implements Comparable<Student>
{
    private int mark;
    private String name;

    public Student(String name, int mark)
    {
        this.name=name;
        this.mark=mark;
    }

    public int getMark() {
        return mark;
    }

    public String getName() {
        return name;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "name=" + name +"; mark=" + mark;
    }

    @Override
    public int compareTo(Student o) {
        if (this.mark > o.mark)
            return 1;
        else if (this.mark < o.mark)
            return -1;
        else return name.compareTo(o.name);
    }
}
