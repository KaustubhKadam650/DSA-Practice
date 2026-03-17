public class RemoveDuplicate {

    public static int removeDuplicate(int nums[]){
        int k=1;
         for(int i=1;i < nums.length;i++){
            if (nums[i]!=nums[i-1]){
                nums [k]=nums[i];
                k++;
            }
        }return k;
    }

    public static void main(String[] args) {
        int nums[]={1,1,2,2,2,3,4,7,8};

       int uniqeCount=removeDuplicate(nums);

       for(int i=0;i<uniqeCount;i++){
                System.out.print(nums[i]+", ");
                }
    }
    
}
