package recursion;

public class E03PascalTriangle {

    public static int element1(int i , int j){
        if(j==0 || i==j){
            return 1;
        }
        return element1(i-1,j-1) + element1(i-1,j);
    }

    public static void print1(int n){
        for(int i = 0;i<n ;i++){
            printSpace(n,i);
            for(int j = 0; j<=i;j++){
                System.out.printf("%-4d",element1(i,j));
            }
            System.out.println();
        }
    }

    private static void printSpace(int n,int i){
        int num = (n-1-i)*2;
        for(int j = 0;j<num;j++ ){
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
//        System.out.println(element(4, 2));
        print1(5);
    }
}
