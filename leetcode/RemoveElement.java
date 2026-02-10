package leetcode;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {

        int count=0;
        for(int i=0; i< nums.length ; i++){

            if(nums[i] != val){
                nums[count++]=nums[i];
            }
        }

        return count;

        //todo: another solution
//        int[] filteredNums = Arrays.stream(nums)
//                .filter(num -> num != val)
//                .toArray();
//        System.arraycopy(filteredNums, 0, nums, 0, filteredNums.length);
//        return filteredNums.length;
    }
}
