package binarysearch;

import java.util.Arrays;

public class SearchRange {

     public static void main(String[] args) {
         System.out.println(Arrays.toString(searchRange(new int[]{5,7,7,8,8,10},0)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int i=0 ,k= 0 ;
        int j= nums.length,n = nums.length;
        int[] result = {-1,-1};
        while (i<j){
            int m = (i+j) >>>1;
            if(nums[m] <target){
                i = m+1;
            } else if(nums[m] > target){
                j = m;
            }else{
                result[0] =m ;
                j = m;
            }

        }
        while (k<n){
            int m = (k+n) >>>1;
            if(nums[m] <target){
                k = m+1;
            } else if (nums[m]>target){
                n = m;
            }else{
                result[1] = m;
                k = m+1;
            }

        }

        return result;
    }

    public static int[] searchRange2(int[]a,int target){
         int x = left(a,target);
         if(x==-1){
             return new int[]{-1,-1};
         }else{
             return new int[]{x,right(a,target)};
         }
    }

    public static int left (int[]a,int target){
         int i = 0, j = a.length-1;
         int candidate = -1;
         while (i<=j){
             int m = (i+j) >>>1;
             if( target < a[m]){
                 j = m-1;
             }else if(a[m] < target){
                 i = m+1;
             }else{
                 candidate = j;
                 j = m-1;
             }
         }
         return candidate;
    }

    public static int right (int[]a,int target){
        int i = 0, j = a.length-1;
        int candidate = -1;
        while (i<=j){
            int m = (i+j) >>>1;
            if( target < a[m]){
                j = m-1;
            }else if(a[m] < target){
                i = m+1;
            }else{
                candidate = m;
                i = m+1;
            }
        }
        return candidate;
    }
}
