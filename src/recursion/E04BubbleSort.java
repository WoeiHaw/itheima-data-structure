package recursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class E04BubbleSort {

    public static void sort(int[] a) {

        bubble(a,a.length-1);

    }

    //    j代表未排序区域左边界
    private static void bubble(int[] a, int j) {
        if(j==0) return;
        int x = 0;
        for (int i = 0; i < j; i++) {
            if (a[i] > a[i + 1]) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
                x = i;

            }
        }

        bubble(a,x);

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
