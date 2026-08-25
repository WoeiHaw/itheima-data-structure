package list.linkedlist;

import java.util.Iterator;
import java.util.function.Consumer;

public class SinglyLinkedListSentinel implements Iterable<Integer>{

    private Node head = new Node(666,null);

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            Node p = head.next;

            @Override
            public boolean hasNext() {
                return p != null;
            }

            @Override
            public Integer next() {
                int v = p.value;
                p = p.next;
                return v;
            }
        };
    }

    private static class Node {
        int value;
        Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void addFirst(int value) {
//       head = new Node(value,null);

        insert(0,value);
    }

    public void loop1(Consumer<Integer> consumer) {
        Node p = head.next;
        while (p != null) {
            consumer.accept(p.value);
            p = p.next;
        }
    }

    public void loop2(Consumer<Integer> consumer) {
        for (Node p = head.next; p != null; p = p.next) {
            consumer.accept(p.value);
        }
    }

    private Node findLast() {

        Node p = head;

        while (p.next != null) {
            p = p.next;
        }

        return p;
    }

    public void addLast(int value) {
        Node last = findLast();
        last.next = new Node(value, null);
    }

//    public  void test() {
//        int i = 0;
//        for(Node p = head; p != null;p = p.next,i++){
//            System.out.println(p.value+" 索引："+i);
//
//        }
//    }

    private Node findNode(int index) {
        int i = -1;
        for (Node p = head; p != null; p = p.next, i++) {
            if (i == index) {
                return p;
            }

        }
        return null;
    }

    public int get(int index) {
        Node node = findNode(index);
        if (node == null) {
            throw illegalIndex(index);
        }
        return node.value;
    }

    private static IllegalArgumentException illegalIndex(int index) {
        return new IllegalArgumentException(String.format("index[%d] 不合法%n", index));
    }

    public void insert(int index, int value) {

        Node prev = findNode(index - 1);
        if (prev == null) {
            throw illegalIndex(index);
        }
        prev.next = new Node(value, prev.next);
    }

    public void insert1(int index, int value) {
        if (index == 0) {
            addFirst(value);
            return;
        }
        Node prevNode = findNode(index - 1);
        Node newNode = new Node(value, null);
        if (prevNode != null) {
            newNode.next = prevNode.next;
            prevNode.next = newNode;
        } else {
            throw illegalIndex(index);
        }

    }

    public void removeFirst(){
        remove(0);
    }

    public void remove(int index){

        Node prev = findNode(index-1);
        if(prev==null){
            throw illegalIndex(index);
        }
        Node remove = prev.next;
        if(remove == null){
            throw illegalIndex(index);
        }
        prev.next = remove.next;
    }

}
