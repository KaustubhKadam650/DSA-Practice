public class Question {
    public static int binarySearch(int nums[],int key){
        int start=0,end = nums.length-1;

        while (start <=end) {
            int mid = (start + end)/2;

            if (nums[mid]== key){
                return 0;
            }
            if (nums[start] <=nums[mid]) {

                if (key >=nums[start] && key < nums[mid]) {
                     end= mid-1;
                    
                }else{
                    start= mid+1;
                }
                
            }else{
                 if (key > nums[mid] && key<= nums [end]) {
                    start= mid+1;
                    
                 }else{
                     end= mid-1;
                 }
            }
        }
        return -1;

    }
    public static void main(String args[]){
        int nums[]={4,5,6,7,0,1,2,3};
        int key=10;

       System.out.println( binarySearch(nums, key));
    }
}
