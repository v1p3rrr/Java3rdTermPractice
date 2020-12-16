import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static <E> ArrayList<E> converter(E[] e){
        ArrayList<E> list = new ArrayList<>();
        for (E value : e) list.add(value);
        return list;
    }

    public static void main(String[] args) {
        String[] strings = new String[]{"a", "b", "cde"};
        System.out.println(Arrays.toString(strings) + " " + strings.getClass());
        System.out.println(converter(strings) + " " + converter(strings).getClass());


        AnyContainer<String> stringAnyContainer = new AnyContainer<>();
        stringAnyContainer.add("a");
        stringAnyContainer.add("B");
        stringAnyContainer.add("c");
        stringAnyContainer.add("D");
        System.out.println(stringAnyContainer.size());
        stringAnyContainer.printFirstFive();
        System.out.println(stringAnyContainer);
        stringAnyContainer.add("W");
        stringAnyContainer.add("L");
        stringAnyContainer.printFirstFive();
    }
}
