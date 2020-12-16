import java.util.ArrayList;
import java.util.Collection;

public class AnyContainer<E>{

    private int size;

    private ArrayList<E> content = new ArrayList<E>();

    public AnyContainer(){
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public void add(E e){
        content.add(e);
        this.size+=1;
    }

    public E get(int i){
        return content.get(i);
    }

    public boolean isEmpty(){
        return size == 0;
    }

    @Override
    public String toString(){
        return content.toString();
    }

    public void printFirstFive(){
        if (size<=5 && !isEmpty()) System.out.println(content.subList(0, size));
        else if (size>5 && !isEmpty()) System.out.println(content.subList(0, 5));
    }
}
