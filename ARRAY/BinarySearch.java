//Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

//You must write an algorithm with O(log n) runtime complexity.


public class BinarySearch {
    public static int biSearch(int[] nums, int target) {
        int start =0,end= nums.length-1;

        while(start<=end){
            int mid=(start+end)/2;

            if(target == nums[mid]){
                return mid;
            }
            if (nums[mid] < target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }return -1;
        
    }
    public static void main(String[] args) {
        int nums[]={-1,1,2,3,4,5,7,8,9};
        int target = 4;

        System.out.println( biSearch(nums,target));
    }
}
