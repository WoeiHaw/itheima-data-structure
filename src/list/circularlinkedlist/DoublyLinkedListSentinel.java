package list.circularlinkedlist;

import java.util.Iterator;

public class DoublyLinkedListSentinel implements Iterable<Integer> {

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            Node p = sentines.next;

            @Override
            public boolean hasNext() {
                return p != sentines;
            }

            @Override
            public Integer next() {
                int value = p.value;
                p = p.next;
                return value;
            }
        };
    }

    private static class Node {
        Node prev;
        int value;
        Node next;

        public Node(Node prev, int value, Node next) {
            this.prev = prev;
            this.value = value;
            this.next = next;
        }
    }

    private Node sentines = new Node(null, -1, null);

    public DoublyLinkedListSentinel() {
        sentines.prev = sentines;
        sentines.next = sentines;
    }

    public void addFirst(int value) {

        Node a = sentines;
        Node b = sentines.next;

        Node added = new Node(a, value, b);

        a.next = added;
        b.prev = added;

    }

    public void addLast(int value) {
        Node a = sentines.prev;
        Node b = sentines;
        Node added = new Node(a, value, b);
        a.next = added;
        b.prev = added;
    }

    public void removeFirst() {
        Node removed = sentines.next;
        if (removed == sentines) {
            throw new IllegalArgumentException("非法");
        }
        Node a = sentines;
        Node b = removed.next;

        a.next = b;
        b.prev = a;
    }

    public void removeLast() {
        Node removed = sentines.prev;
        if (removed == sentines) {
            throw new IllegalArgumentException("非法");
        }
        Node a = removed.prev;
        Node b = sentines;

        a.next = b;
        b.prev = a;
    }

    public void removeByValue(int value) {
        Node removed = finByValue(value);

        if(removed != null){
            Node a = removed.prev;
            Node b = removed.next;

            a.next = b;
            b.prev = a;
        }


    }

    private Node finByValue(int value) {
        for (Node p = sentines.next; p != null; p = p.next) {
            if (p.value == value) {
                return p;
            }
        }
        return null;
    }
}
