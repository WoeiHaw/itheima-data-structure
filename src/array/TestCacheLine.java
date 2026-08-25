package array;

import org.springframework.util.StopWatch;

public class TestCacheLine {
    public static void ij(int[][]a,int rows, int columns){
        long sum = 0;
        for(int i = 0; i<rows;i++){
            for(int j = 0 ; j<columns;j++){
                sum += a[i][j];
            }
        }
        System.out.println(sum);
    }

    public static void ji(int[][]a,int rows, int columns){
        long sum = 0L;
        for(int j = 0; j<columns;j++){
            for(int i = 0; i<rows;i++){
                sum +=a[i][j];
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int rows = 1_000_000;
        int column = 14;
        int[][] a= new int[rows][column];
        StopWatch sw = new StopWatch();

        sw.start("ij");
        ij(a,rows,column);
        sw.stop();

        sw.start("ji");
        ji(a,rows,column);
        sw.stop();
        System.out.println(sw.prettyPrint());

    }
}
