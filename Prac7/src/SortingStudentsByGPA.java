import java.util.ArrayList;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student>
{
    public SortingStudentsByGPA(ArrayList<Student> arr)
    {
        quickSort(arr, 0, arr.size()-1);
    }

    public void quickSort(ArrayList<Student> arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }
    private int partition(ArrayList<Student> arr, int begin, int end) {
        Student pivot = arr.get(end);
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (compare(arr.get(j), pivot)>-1) { // arr[j]=>pivot
                i++;

                Student swapTemp = arr.get(i);
                arr.set(i,arr.get(j));
                arr.set(j,swapTemp);
            }
        }

        Student swapTemp = arr.get(i+1);
        arr.set(i+1,arr.get(end));
        arr.set(end,swapTemp);

        return i+1;
    }

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getMark() > o2.getMark())
            return 1;
        else if (o1.getMark() < o2.getMark())
            return -1;
        else return o1.getName().compareTo(o2.getName());
    }
}
