package leetcode;

import java.util.*;

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {

        int position = 0;

        if (Arrays.binarySearch(nums, target) < 0) {

            for (int i = 0; i < nums.length; i++) {

                if (nums[i - 1] < target && nums[i] > target) {
                    position = i;
                    break;
                }
            }
        } else {
            position = Arrays.binarySearch(nums, target);
        }
        return position;


    }

    //2nd way
    public int searchInsert2(int[] nums, int target) {

        int res = 0;

        if (target > nums[nums.length - 1]) {

            res = nums.length;
        } else if (target == nums[nums.length - 1]) {

            res = nums.length - 1;
        } else {
            for (int i = 0; i < nums.length - 1; i++) {

                if (i == 0 && target <= nums[i]) {

                    res = 0;
                    break;
                }

                if (nums[i] == target) {
                    res = i;
                    break;
                } else if (nums[i] < target && nums[i + 1] > target) {

                    res = i + 1;
                    break;
                }
            }
        }
        return res;
    }
}
