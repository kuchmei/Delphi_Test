import java.util.ArrayList;
import java.util.List;


public class ArrayPairSum {
    static int [] array = {10,-10,3,5,3,2,5,6,7,8,12,13,4,15,9,45,74,52};

    public static void main(String[] args) {
   findAndPrintPairs(array, 25);
    }

    static List<Integer> findAndPrintPairs(int[]input, int sum) {
        List<Integer> pairs  = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if (input[i] + input[j] == sum) {
                pairs.add(input[i]);
                pairs.add(input[j]);
                System.out.print(input[i] +" " + input[j] + ", " );
                }
            }
        }
       return pairs;
    }
}