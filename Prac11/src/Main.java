import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        System.out.println("ArrayQueue:\n");
        ArrayQueue arrayQueue = new ArrayQueue();
        fill(arrayQueue);
        dump(arrayQueue);
        fill(arrayQueue);
        clear(arrayQueue);
        fill(arrayQueue);
        getArray(arrayQueue);

        System.out.println("\n\nArrayQueueADT:\n");
        ArrayQueueADT arrayQueueADT = new ArrayQueueADT();
        fill(arrayQueueADT);
        dump(arrayQueueADT);
        fill(arrayQueueADT);
        clear(arrayQueueADT);
        fill(arrayQueueADT);
        getArray(arrayQueueADT);

        System.out.println("\n\nArrayQueueModule:\n");
        fill();
        dump();
        fill();
        clear();
        fill();
        getArray();
    }


    // ArrayQueue
    public static void fill(ArrayQueue queue) {
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }
    }

    public static void dump(ArrayQueue queue) {
        while (!queue.isEmpty()) {
            System.out.println(queue.size() + " " + queue.element() + " " + queue.dequeue());
        }
    }

    public static void getArray(ArrayQueue queue) {
        Object[] arr = queue.toArray();
        for (Object obj : arr) {
            System.out.print(obj + " ");
        }
    }

    public static void clear(ArrayQueue queue) {
        queue.clear();
        System.out.println("Is queue empty? " + queue.isEmpty());
    }

    //ArrayQueueADT

    public static void fill(ArrayQueueADT queue) {
        for (int i = 0; i < 10; i++) {
            ArrayQueueADT.enqueue(queue, i);
        }
    }

    public static void getArray(ArrayQueueADT queue) {
        Object[] arr = ArrayQueueADT.toArray(queue);
        for (Object obj : arr) {
            System.out.print(obj + " ");
        }
    }

    public static void dump(ArrayQueueADT queue) {
        while (!ArrayQueueADT.isEmpty(queue)) {
            System.out.println(
                    ArrayQueueADT.size(queue) + " " + ArrayQueueADT.element(queue) + " " + ArrayQueueADT.dequeue(queue));
        }
    }

    public static void clear(ArrayQueueADT queue) {
        ArrayQueueADT.clear(queue);
        System.out.println("Is queue empty? " + ArrayQueueADT.isEmpty(queue));
    }

    //ArrayQueueModule
    public static void fill() {
        for (int i = 0; i < 10; i++) {
            ArrayQueueModule.enqueue(i);
        }
    }

    public static void getArray() {
        Object[] arr = ArrayQueueModule.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void dump() {
        while (!(ArrayQueueModule.isEmpty())) {
            System.out.println(ArrayQueueModule.size() + " " + ArrayQueueModule.element() + " " + ArrayQueueModule.dequeue());
        }
    }

    public static void clear() {
        ArrayQueueModule.clear();
        System.out.println("Is queue empty? " + ArrayQueueModule.isEmpty());
    }

}

