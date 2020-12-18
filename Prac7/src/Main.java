import java.util.ArrayDeque;
public class Main {
    public static String work(int[] word){
        StringBuilder res = new StringBuilder();
        ArrayDeque<Integer> wordArray = new ArrayDeque<Integer>();
        for (int j : word) {
            if (j > 0) {
                wordArray.add(j);
                res.append(",0");
            } else if (j == 0) {
                if (wordArray.isEmpty()) {
                    res.append(",-1");
                } else {
                    res.append(",").append((int) wordArray.pop());
                }
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        int[] word = new int[]{0,25,99,4,0,3,0,8,8,3,7} ;
        System.out.println(work(word));
    }
}