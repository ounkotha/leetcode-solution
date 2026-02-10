package leetcode;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {

        int count = 0;

        for( int i=0;i< nums.length-1 ; i++){

            if(nums[i]!=nums[i+1]){
                nums[count++]=nums[i];
            }
        }
        nums[count++]= nums[nums.length-1];

        return count;

        //todo: another solution
//        int[] filteredNums = Arrays.stream(nums)
//                .distinct()
//                .toArray();
//        System.arraycopy(filteredNums, 0, nums, 0, filteredNums.length);
//        return filteredNums.length;


    }
}
