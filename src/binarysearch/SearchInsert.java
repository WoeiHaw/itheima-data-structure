package binarysearch;

public class SearchInsert {
    public static void main(String[] args) {
        System.out.println(searchInsert2(new int[]{1,3,5,6},5));
    }
    public static int searchInsert(int[] nums, int target){
        int i = 0, j = nums.length;

        while (i<j){
            int m = (i + j) >>>1;
            if(nums[m] > target){
                j = m;
            }else if(nums[m]<target){
                i = m+1;
            }else{
                return m;
            }

        }
        return i ;
    }

    public static int searchInsert2(int[]a, int target){
        int i = 0, j = a.length-1;
        while (i<=j){
            int m = (i+j) >>>1;

            if(target<=a[m]){
                j = m-1;
            }else{
                i = m+1;
            }
        }

        return i;
    }
}
