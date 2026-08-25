package list.linkedlist;

import com.sun.jdi.Value;

public class Main {

    public static void main1(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);

        list.loop2(System.out::println);
    }

    public static void main2(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);

        for(Integer value:list){
            System.out.println(value);
        }
    }

    public static void main3(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        for(Integer value:list){
            System.out.println(value);
        }
//        list.test();
        int i = list.get(10);
        System.out.println(i);
    }

    public static void main4(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        list.insert(0,5);
        for(Integer value:list){
            System.out.println(value);
        }
    }

    public static void main5(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.removeFirst();
        list.forEach(System.out::println);
        System.out.println("---------------------");
        list.removeFirst();
        list.forEach(System.out::println);

        System.out.println("---------------------");
        list.removeFirst();
        list.forEach(System.out::println);
        System.out.println("---------------------");
        list.removeFirst();
        list.forEach(System.out::println);
    }

    public static void main6(String[] args) {
//        SinglyLinkedList list = new SinglyLinkedList();
//        list.addLast(1);
//        list.addLast(2);
//        list.addLast(3);
//        list.addLast(4);
//        list.remove(2);
//        list.forEach(System.out::println);

//        SinglyLinkedList list2 = new SinglyLinkedList();
//        list2.addLast(1);
//        list2.addLast(2);
//        list2.addLast(3);
//        list2.addLast(4);
//        list2.remove(0);
//        list2.forEach(System.out::println);

//        SinglyLinkedList list3 = new SinglyLinkedList();
//        list3.addLast(1);
//        list3.addLast(2);
//        list3.addLast(3);
//        list3.addLast(4);
//        list3.remove(5);
//        list3.forEach(System.out::println);

        SinglyLinkedList list4 = new SinglyLinkedList();
        list4.addLast(1);
        list4.addLast(2);
        list4.addLast(3);
        list4.addLast(4);
        list4.remove(4);
        list4.forEach(System.out::println);

    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.loop3(value->{
            System.out.println("before:"+value);
        }, value->{
            System.out.println("after:"+value);
        });
    }


}
