import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

// Написать класс, который умеет хранить в себе МАССИВ любых типов данных
public class AnyArray<E>{

    private E[] content;

    public AnyArray(E[] array){
        this.content = array;
    }

    public int size() {
        return content.length;
    }

    // Реализовать метод, который возвращает любой элемент массива по индексу
    public E get(int i){
        return content[i];
    }

    public void replace(E[] e){ // replaces present array with new one
        content = e;
    }

    @Override
    public String toString(){
        return Arrays.toString(content);
    }
}


//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collection;
//
//// Написать класс, который умеет хранить в себе МАССИВ любых типов данных
//public class AnyArray<E>{
//
//    private Object[] content;
//    private Class<?>[] classes;
//
//    public AnyArray(){
//        content = new Object[0];
//        classes = new Class<?>[0];
//    }
//
//    public AnyArray(E[] array){
//        content = array;
//        classes = new Class<?>[array.length];
//        for (int i = 0; i<array.length; i++){
//            classes[i]=array[i].getClass();
//        }
//    }
//
//    public void add(E e){
//        content = Arrays.copyOf(content, content.length + 1);
//        content[content.length-1] = e;
//        classes = Arrays.copyOf(classes, classes.length + 1);
//        classes[classes.length-1] = e.getClass();
//    }
//
//    public int size() {
//        return content.length;
//    }
//
//    // Реализовать метод, который возвращает любой элемент массива по индексу
//    public Object get(int i){
//        return classes[i].cast(content[i]);
//    }
//
//    public void replace(E[] e){ // replaces present array with new one
//        content = e;
//    }
//
//    @Override
//    public String toString(){
//        return Arrays.toString(content);
//    }
//}
