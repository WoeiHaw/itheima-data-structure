package deque;

import java.util.Iterator;

public class ArrayDeque1<E> implements Deque<E>, Iterable<E> {

    static int inc(int i, int length){
        if(i + 1>= length){return 0;}
        return i+1;
    }

    static int dec(int i, int length){
        if(i -1 <0){
            return length-1;
        }
        return i -1;

    }
    E[] array;
    int head;
    int tail;

    public ArrayDeque1(int capacity){
        array = (E[])new Object[capacity+1];
    }

    @Override
    public boolean offerFirst(E e) {
        return false;
    }

    @Override
    public boolean offerLast(E e) {
        return false;
    }

    @Override
    public E pollFirst() {
        return null;
    }

    @Override
    public E pollLast() {
        return null;
    }

    @Override
    public E peekFirst() {
        return null;
    }

    @Override
    public E peekLast() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
