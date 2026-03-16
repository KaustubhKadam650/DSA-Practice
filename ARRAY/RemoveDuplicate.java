public class RemoveDuplicate {

    public static int removeDuplicate(int nums[]){
         for(int i=0;i < nums.length-1;i++){
            for (int j = i+1; j<nums.length;j++){
                if (nums[i]==nums[j]) {
                    System.out.print(nums[i]);
                }else{
                    System.out.print(nums[j]);
                }
            }
        }return 1;
    }
    
}
