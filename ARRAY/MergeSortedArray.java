import java.util.Arrays;

class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int j =0, i=m;j<n;j++){
            nums1[i]=nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int nums1[]={1,2,3,5};
        int m=4;
        int nums2[]={2,4,6};
        int n=3;

        System.out.println(Arrays.toString(nums1));
    }
}