//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

import java.util.*;

public class ContainsDuplicate {
    // public static boolean containsDuplicate (int [] nums){
    // for(int i=0;i < nums.length-1;i++){
    // for (int j = i+1; j<nums.length;j++){
    // if (nums[i]==nums[j]) {
    // return true ;
    // }
    // }
    // }
    // return false;

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1])
                return true;
        }
        return false;
    }

    //in this above solution takes less time as we have use sorting ,so it can arrange duplicate element 1 after 1,bcs of this it takes less time

    public static void main(String[] args) {
        int nums[] = { 1, 2, 1, 3, 4 };
        System.out.println(containsDuplicate(nums));
    }
}