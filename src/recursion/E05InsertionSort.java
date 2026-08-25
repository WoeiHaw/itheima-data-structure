package recursion;

import java.util.Arrays;

public class E05InsertionSort {

    public static void sort(int[]a){

        insertion(a,1);
//insertion2(a,0,3);
    }

    private static void insertion2(int[]a,int low, int height){
        if(low == height) return;
        int nextLow = low+1;
        int temp = a[nextLow];
        int i = nextLow -1;
        while (i >= 0 && temp<a[i]){
            a[i+1] = a[i];//空出插入位置
            i--;
        }
        a[i+1] = temp;
        insertion2(a,++low,height);
    }

    private static void insertion(int[]a, int low){
        if(low == a.length) return;

        int temp = a[low];
        int i =low-1 ;//已排序区指针

        while (i>= 0  && temp < a[i]){
            a[i+1] = a[i];//空出插入位置
            i--;
        }

        //找到插入位置
        if(i+1 != low) {
            a[i+1] = temp;
        }
        insertion(a,++low);
    }

    public static void main(String[] args) {
        int[] a = {6, 5, 4, 3, 2, 1};
        sort(a);
        System.out.println(Arrays.toString(a));

        int[] b = {4, 5, 3, 2, 1 };
        sort(b);
        System.out.println(Arrays.toString(b));

        int[] c = {5, 4, 3, 2, 1 };
        sort(c);
        System.out.println(Arrays.toString(c));

        int[] d= {3,1,4,2,5};
        sort(d);
        System.out.println(Arrays.toString(d));

        int[] e = {1, 2, 3, 4, 5 };
        sort(e);
        System.out.println(Arrays.toString(e));
    }
}
