public class BoundedWaitList<E> extends WaitList<E>{

    private int capacity;

    public BoundedWaitList(int capacity){
        super();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(E element) throws IllegalStateException {
        if (content.size()<capacity){
            content.add(element);
        } else throw new IllegalStateException("the wait list is full");
    }

    @Override
    public String toString() {
        return "Capacity: " + this.capacity + "; " + content.toString();
    }
}
