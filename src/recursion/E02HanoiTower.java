package recursion;

import com.sun.jdi.PathSearchingVirtualMachine;
import org.springframework.aop.support.AopUtils;

import java.time.Period;
import java.util.LinkedList;

public class E02HanoiTower {
    static LinkedList<Integer> a = new LinkedList<>();
    static LinkedList<Integer> b = new LinkedList<>();
    static LinkedList<Integer> c = new LinkedList<>();

    static void init(int n) {
        for (int i = n; i >= 1; i--) {
            a.addLast(i);
        }
    }

    static void move(int n, LinkedList<Integer> a, LinkedList<Integer> b, LinkedList<Integer> c) {
        if(n==0) return;
        move(n - 1, a, c, b);
        c.addLast(a.removeLast());//中间
        print();
        move(n-1,b,a,c);
        print();
    }

    public static void main(String[] args) {
        init(64);
        print();
        move(64,a,b,c);
    }

    private static void print() {
        System.out.println("----------------------");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
