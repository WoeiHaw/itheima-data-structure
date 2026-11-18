package stack;

import com.sun.source.tree.WhileLoopTree;
import queue.LinkedListQueue;

import java.util.LinkedList;

public class E03InflixToSuffix {

    public static void main(String[] args) {

    }

    static int priority(char c){
        return switch (c){
            case '*','/'->2;
            case '+','-'->1;
            default -> throw new IllegalArgumentException("不合法的运算符"+c);
        };
    }

    static String infixToSuffix(String exp){
        LinkedList<Character> stack = new LinkedList<>();
        StringBuilder stringBuilder = new StringBuilder(exp.length());
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            switch (c){
                case '*','/','+','-' ->{
                    if(stack.isEmpty()){
                        stack.push(c);
                    }else{
                        if(priority(c)> priority(stack.peek())){
                            stack.push(c);
                        }else{
                            while (!stack.isEmpty() && priority(stack.peek())>= priority(c)){
                               stringBuilder.append( stack.pop());
                            }
                            stack.push(c);
                        }
                    }
                }
                default ->{
                    stringBuilder.append(c);
                }
            }
        }
        while (!stack.isEmpty()){
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.toString();

    }
}
