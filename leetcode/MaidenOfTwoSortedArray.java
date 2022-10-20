package leetcode;

import java.util.Arrays;

public class MaidenOfTwoSortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] ar= new int[nums1.length+nums2.length];
        int k=0;

        for( int i=0 ; i< nums1.length ; i++){

            ar[k]=nums1[i];
            k++;
        }
        for( int j=0 ; j< nums2.length ; j++){

            ar[k]=nums2[j];
            k++;
        }

        Arrays.sort(ar);

        int len = ar.length;

        if(len%2==0 ){
            return (ar[len/2]+ar[(len/2)-1])/2.0;
        }else{
            return ((double)ar[len/2]);
        }
    }
}
