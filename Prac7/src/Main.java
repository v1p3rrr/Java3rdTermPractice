import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> player1 = new ConcurrentLinkedQueue<>();
        player1.add(5);
        player1.add(1);
        player1.add(0);
        player1.add(4);
        player1.add(8);

        Queue<Integer> player2 = new ConcurrentLinkedQueue<>();
        player2.add(6);
        player2.add(7);
        player2.add(3);
        player2.add(9);
        player2.add(2);


        int i = 0;
        while (!player1.isEmpty() && !player2.isEmpty() && i<106){
                if ((player1.peek() > player2.peek()) || (player1.peek() == 0 & player2.peek() == 9)) {
                    System.out.println("P1's " + player1.peek() + " beats P2's " + player2.peek());
                    player1.add(player1.poll());
                    player1.add(player2.poll());
                    System.out.println("P1: "+ player1);
                    System.out.println("P2: "+ player2);
                } else if (( player1.element() < player2.element()) || ( player1.element() == 9 & player2.element() == 0)) {
                    System.out.println("P2's " + player2.peek() + " beats P1's " + player1.peek());
                    player2.add(player1.poll());
                    player2.add(player2.poll());
                    System.out.println("P1: "+ player1);
                    System.out.println("P2: "+ player2);
                }
                i++;
            }
        if (player1.isEmpty()){
            System.out.println("Player 2 has won within " + i + " turns.");
        } else if (player2.isEmpty()) {
            System.out.println("Player 1 has won within " + i + " turns.");
        } else {
            System.out.println("botva");
        }
    }
}