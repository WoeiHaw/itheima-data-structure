package stack;

import java.util.LinkedList;

public class E02Leetcode150 {

    public int evalRPN(String[] tokens) {
        LinkedList<Integer> stack = new LinkedList<>();
        for(String token : tokens){
            switch (token){
                case "+" ->{
                   Integer b=  stack.pop();
                   Integer a=  stack.pop();
                   stack.push(a+b);
                }
                case "-" ->{
                    Integer b=  stack.pop();
                    Integer a=  stack.pop();
                    stack.push(a-b);
                }
                case "/" ->{
                    Integer b=  stack.pop();
                    Integer a=  stack.pop();
                    stack.push(a*b);
                }
                case "*" ->{
                    Integer b=  stack.pop();
                    Integer a=  stack.pop();
                    stack.push(a/b);
                }
                default ->{
                    stack.push(Integer.parseInt(token));
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(new E02Leetcode150().evalRPN(tokens));
        tokens = new String[]{"2","1","+","3","*"};
        System.out.println(new E02Leetcode150().evalRPN(tokens));
    }
}
