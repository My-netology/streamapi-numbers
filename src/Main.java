import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        intList.sort(Comparator.naturalOrder());
        //System.out.println(intList.toString());
        for (Integer integer : intList) {
            if (integer > 0 && integer % 2 == 0) {
                System.out.println(integer);
            }
        }
    }
}