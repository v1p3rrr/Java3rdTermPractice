import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class Main
{
    public static void main(String[] args)
    {
        Student st1 = new Student("Bob", 3);
        Student st2 = new Student("Bill", 5);
        Student st3 = new Student("Ethan", 4);
        Student st4 = new Student("John", 3);
        Student st5 = new Student("Touma", 2);

        ArrayList<Student> groupJournal = new ArrayList<>();
        groupJournal.add(st1);
        groupJournal.add(st2);
        groupJournal.add(st3);
        groupJournal.add(st4);
        groupJournal.add(st5);

        for (Student student : groupJournal) System.out.println(student);
        System.out.println("\nsorted:\n");
        new SortingStudentsByGPA(groupJournal);
        for (Student student : groupJournal) System.out.println(student);
    }
}
