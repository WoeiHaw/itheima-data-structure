package recursion;

public class E03BinarySearch {

    public static void main(String[] args) {
        int[] a = {7,13,21,30,38,44,52,53};
        System.out.println(search(a,7));
        System.out.println(search(a,13));
        System.out.println(search(a,21));
        System.out.println(search(a,30));
        System.out.println(search(a,38));
        System.out.println(search(a,44));
        System.out.println(search(a,52));
        System.out.println(search(a,53));

        System.out.println(search(a,0));
        System.out.println(search(a,15));
        System.out.println(search(a,60));


    }

    public static int search(int[]a,int target){
        return f(a,target,0,a.length-1);
    }

    private static int f(int[]a,int target,int i , int j){
        if(i >j){
            return -1;
        }
        int m = (i+j) >>>1;
        if(target<a[m]){
           return f(a,target,i,m-1);
        }else if(a[m] < target){
           return f(a,target,i+1,j);
        }else{
            return m;
        }
    }
}
