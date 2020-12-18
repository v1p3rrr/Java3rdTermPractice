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
