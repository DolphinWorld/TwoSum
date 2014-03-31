package we.believe;

/**
 * Created by bluedolphin on 3/30/14.
 */
import java.util.*;

public class TwoSum {
    public int[] twoSum(int numbers[], int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i);
        }
        for (int i = 0; i < numbers.length; i++) {
            Integer idx2 = map.get(target - numbers[i]);
            if (idx2 != null && idx2 > i) {
                return new int[]{i + 1, idx2 + 1};
            }
        }
        return null;
    }
}
