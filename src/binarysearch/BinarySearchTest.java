package binarysearch;

import java.util.Arrays;

public class BinarySearchTest {

    public static void main(String[] args) {

        int[] a= {3,5,8};
        int target = 2;

        int i = Arrays.binarySearch(a,target);
        System.out.println(i);

        if(i<0){
            int insertIndex = Math.abs(i+1);
            int[] b = new int[a.length+1];
            System.arraycopy(a,0,b,0,insertIndex);
            b[insertIndex] = target;
            System.arraycopy(a,insertIndex,b,insertIndex+1,a.length-insertIndex);
            System.out.println(Arrays.toString(b));
        }

    }


}
