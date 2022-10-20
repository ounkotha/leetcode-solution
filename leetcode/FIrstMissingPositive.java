package leetcode;

import java.util.HashSet;
import java.util.Set;

public class FIrstMissingPositive {
    public int firstMissingPositive(int[] nums) {

        Set<Integer> set = new HashSet<>();

        int first = 1;

        for (int num : nums) {
            if (num > 0) {
                set.add(num);
            }

            if (num == first) {
                first++;

                while (set.contains(first)) {
                    first++;
                }
            }
        }

        return first;
    }
}
