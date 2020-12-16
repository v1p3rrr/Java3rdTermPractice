import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // ============ TEST FOR WaitList ============
        WaitList<String> waitList = new WaitList<>();
        System.out.println(waitList.isEmpty() + " waitList.isEmpty()");
        waitList.add("1");
        waitList.add("2");
        waitList.add("3");
        waitList.add("4");
        // waitList.add(2); uncompilable

        System.out.println(waitList + " waitList");
        System.out.println(waitList.isEmpty() + " waitList.isEmpty()");

        waitList.remove();
        System.out.println(waitList + " waitList");
        waitList.add("new 1");
        waitList.add("new 2");
        waitList.remove();
        waitList.remove();
        System.out.println(waitList + " waitList");
        System.out.println(waitList.contains("1") + " waitList.contains(\"1\")");
        System.out.println(waitList.contains("4") + " waitList.contains(\"4\")");


        ArrayList<String> a = new ArrayList<>();
        a.add("zzz");
        a.add("ggg");

        WaitList<String> newWL = new WaitList<String>(a);
        newWL.add("hhh");
        System.out.println(newWL + " newWL");
        System.out.println(newWL.containsAll(a) + " newWL.containsAll(a)");
        newWL.remove();
        System.out.println(newWL.containsAll(a) + " newWL.containsAll(a)");

        // ============ TEST FOR BoundedWaitList ============

        BoundedWaitList<String> boundedWaitList = new BoundedWaitList<>(3);
        System.out.println(boundedWaitList.getCapacity() + " boundedWaitList.getCapacity()");
        System.out.println(boundedWaitList.isEmpty() + " boundedWaitList.isEmpty()");
        System.out.println(boundedWaitList + " boundedWaitList");
        boundedWaitList.add("1");
        boundedWaitList.add("2");
        boundedWaitList.add("3");
        System.out.println(boundedWaitList + " boundedWaitList");
        try {
            boundedWaitList.add("4");
            System.out.println(boundedWaitList + " boundedWaitList");
        } catch (IllegalStateException e){
            System.out.println("EXCEPTION CAUGHT: " + e.getMessage());
        }
        System.out.println(boundedWaitList + " boundedWaitList");
        boundedWaitList.remove();
        boundedWaitList.add("4");
        System.out.println(boundedWaitList + " boundedWaitList");

        // ============ TEST FOR UnfairWaitList ============
        UnfairWaitList<String> unfairWaitList = new UnfairWaitList<>();
        System.out.println(unfairWaitList.isEmpty() + " unfairWaitList.isEmpty()");
        unfairWaitList.add("1");
        unfairWaitList.add("2");
        unfairWaitList.add("3");
        unfairWaitList.add("4");
        unfairWaitList.add("5");
        System.out.println(unfairWaitList + " unfairWaitList");
        unfairWaitList.moveToBack("3");
        unfairWaitList.moveToBack("75");
        System.out.println(unfairWaitList + " unfairWaitList");
        unfairWaitList.remove();
        System.out.println(unfairWaitList + " unfairWaitList");
        unfairWaitList.remove("4");
        unfairWaitList.remove("33");
        System.out.println(unfairWaitList + " unfairWaitList");
    }
}
