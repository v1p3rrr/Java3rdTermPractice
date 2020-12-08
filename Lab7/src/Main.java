import java.util.ArrayList;
import java.util.Comparator;
// Протестировать работу коллекции ArrayList

public class Main
{
    public static void main(String[] args)
    {
        Subjects phys = new Subjects("Physics", 4);
        Subjects inf = new Subjects("Informatics", 5);
        Subjects math = new Subjects("Mathematics", 5);
        Subjects rus = new Subjects("Russian Language", 5);
        Subjects bio = new Subjects("Biology", 3);
        Subjects eng = new Subjects("English Language", 4);


        ArrayList<Subjects> SubjList = new ArrayList<Subjects>(2);
        SubjList.add(phys);
        SubjList.add(inf);
        SubjList.add(math);
        SubjList.add(rus);

        for (Subjects subjects : SubjList) System.out.println(subjects.getName());

        SubjList.add(1,bio);
        SubjList.remove(0);
        SubjList.remove(rus);
        SubjList.set(2,eng);
        SubjList.add(eng);

        System.out.println("\n");
        for (Subjects subjects : SubjList) System.out.println(subjects.getName());
        System.out.println(SubjList.indexOf(eng));
        System.out.println(SubjList.lastIndexOf(eng));

        for (int i=0;i<=SubjList.subList(0,1).size();i++)
                System.out.println(SubjList.get(i).getName());
    }
}
