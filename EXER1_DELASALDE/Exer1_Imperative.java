import java.util.Arrays;
import java.util.List;

public class Exer1_Imperative {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sumOfSquares = 0;
        for (int i = 0; i < numbers.size(); i++) {
            int square = numbers.get(i) * numbers.get(i);
            sumOfSquares += square;
        }

        System.out.println("Sum of squares (Imperative): " + sumOfSquares);
    }
}
