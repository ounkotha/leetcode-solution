package leetcode;

import java.util.*;

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {

        int position= 0;

        if(Arrays.binarySearch (nums,target) < 0){

            for(int i=0;i< nums.length ; i++){

                if( nums[i-1]<target && nums[i] > target){
                    position = i;
                    break;
                }
            }
        }else{
            position = Arrays.binarySearch (nums,target);
        }
        return position;


    }
}
