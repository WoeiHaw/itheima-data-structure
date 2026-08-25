package binarysearch;

public class BinarySearch {
    public static void main1(String[] args) {
        int[] a= {7,13,21,30,38,44,52,53};
        System.out.println(binarySearch(a,7));
        System.out.println(binarySearch(a,13));
        System.out.println(binarySearch(a,21));
        System.out.println(binarySearch(a,15));

        System.out.println(binarySearch(a,60));

        System.out.println("________________");
        System.out.println(binarySearchAlternative(a,7));
        System.out.println(binarySearchAlternative(a,13));
        System.out.println(binarySearchAlternative(a,21));
        System.out.println(binarySearchAlternative(a,15));

        System.out.println(binarySearchAlternative(a,60));



    }

    public static void main(String[] args) {
        int[] a= {1,2,4,4,4,5,6};
        System.out.println(binarySearchLeftMost1(a,1));
        System.out.println(binarySearchLeftMost1(a,2));
        System.out.println(binarySearchLeftMost1(a,3));
        System.out.println(binarySearchLeftMost1(a,4));
        System.out.println(binarySearchLeftMost1(a,5));
        System.out.println(binarySearchLeftMost1(a,6));
        System.out.println(binarySearchLeftMost1(a,7));

        System.out.println(binarySearchLeftMost1(a,0));
        System.out.println(binarySearchLeftMost1(a,3));
        System.out.println(binarySearchLeftMost1(a,8));







    }


    public static int binarySearch(int[] arr, int target) {
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            int m = i+(j-i) / 2;

            if (target == arr[m]) {
                return m;
            }

            if (target > arr[m]) {
                i = m + 1;
            } else {
                j = m - 1;
            }
        }

        return -1;
    }

    public static int binarySearchAlternative(int[] arr,int target){
        int i = 0;
        int j = arr.length ;
        while (i < j) {
            int m = i+(j-i) / 2;

            if (target == arr[m]) {
                return m;
            }

            if (target > arr[m]) {
                i = m + 1;
            } else {
                j = m;
            }
        }

        return -1;
    }

    public static int binarySearchLeftMost1(int[] a, int target){
        int i = 0, j = a.length-1;
        int candidate = -1;
        while (i <= j){
            int m = (i+j) >>>1;
            if(target<a[m]){
                j = m-1;
            } else if (a[m]<target) {
                i = m+1;
            }else{
                candidate = m;
                j = m -1;
            }
        }
        return  candidate ;
    }

    public static int binarySearchEightMost1(int[] a, int target){
        int i = 0, j = a.length-1;
        int candidate = -1;
        while (i <= j){
            int m = (i+j) >>>1;
            if(target<a[m]){
                j = m-1;
            } else if (a[m]<target) {
                i = m+1;
            }else{
                candidate = m;
                i = m +1;
            }
        }
        return  candidate ;
    }

}

