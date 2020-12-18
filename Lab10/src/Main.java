import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    // метод для конвертации массива строк/чисел в список
    public static <E> List<E> converter(E[] e){
        List<E> list = new ArrayList<>();
        for (E value : e) list.add(value);
        return list;
    }

    public static void main(String[] args) {
        String[] strings = new String[]{"a", "b", "cde", "xd", "vbcfdgvdd", "123-=+_f"};
        System.out.println(Arrays.toString(strings) + " " + strings.getClass() + " -- Array of strings");
        System.out.println(converter(strings) + " " + converter(strings).getClass() + " -- List of string");

        System.out.println("===== array class =====");
        AnyArray<String> stringArray = new AnyArray<>(strings);
        System.out.println(stringArray.get(2));
        System.out.println(stringArray.size());
        System.out.println(stringArray);

        System.out.println("===== files =====");
        try {
            FilesList files = new FilesList("C:\\");
            System.out.println(files);
            System.out.println(files.firstFive());
        }
        catch (IOException e){
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
}
