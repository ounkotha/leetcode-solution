package leetcode;

public class HowManyNumbersAreSmallerThantheCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] res=new int[nums.length];
        int count=0;
        int k=0;
        for( int i=0;i< nums.length;i++){

            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    count++;
                }
            }
            res[k]=count;
            count=0;
            k++;
        }

        return res;
    }

}
