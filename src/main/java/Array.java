import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Array {

    public int[] pull(int[] input) {
        if (input.length == 0) {
            throw new RuntimeException("Массив не должен быть пустым");
        }

        final int NUMBER_OF_LIMITER = 4;

        boolean hasLimiter = false;

        List<Integer> output = new ArrayList<Integer>();

        for (int i = input.length - 1; i >= 0; i--) {
            if (input[i] == NUMBER_OF_LIMITER) {
                hasLimiter = true;
                break;
            }
            output.add(input[i]);
        }
        if (!hasLimiter) {
            throw new RuntimeException("В массиве нет нужного элемента " + NUMBER_OF_LIMITER);
        }

        Collections.reverse(output);

        return output.stream().mapToInt(Integer::intValue).toArray();
    }

    public boolean check(int[] input) {
        final int VALUE_FIRST = 1;
        final int VALUE_SECOND = 4;

        for(int element : input){
            if(element == VALUE_FIRST && element == VALUE_SECOND){
                return true;
            }
        }
        return false;
    }
}
