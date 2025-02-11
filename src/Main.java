import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        List<Integer> positiveNumber = new ArrayList<>();
        for (Integer number : intList) {
            if (number > 0) {
                positiveNumber.add(number);
            }
        }
        List<Integer> evenNumber = new ArrayList<>();
        for (Integer num : positiveNumber) {
            if (num % 2 == 0) {
                evenNumber.add(num);

            }
        }
        evenNumber.sort(Integer::compareTo);
        for (Integer num : evenNumber) {
            System.out.println(num);
        }

    }
}