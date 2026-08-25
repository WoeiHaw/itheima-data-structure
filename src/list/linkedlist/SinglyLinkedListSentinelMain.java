package list.linkedlist;

public class SinglyLinkedListSentinelMain {

    public static void main1(String[] args) {
        SinglyLinkedListSentinel list = getLinkedList();
        list.forEach(System.out::println);

    }

    public static void main2(String[] args) {
        SinglyLinkedListSentinel list = getLinkedList();
        System.out.println(list.get(2));
        list.get(10);
    }

    public static void main3(String[] args) {
        SinglyLinkedListSentinel list = getLinkedList();
        list.insert(0,5);
        list.forEach(System.out::println);
        System.out.println("-------------------");
        list = getLinkedList();
        list.insert(2,5);
        list.forEach(System.out::println);
        System.out.println("---------------------");
        list = getLinkedList();
        list.insert(4,5);
        list.forEach(System.out::println);

//        list = getLinkedList();
//        list.insert(5,4);
        System.out.println("---------------------");
        list = getLinkedList();
        list.addFirst(5);
        list.forEach(System.out::println);

        System.out.println("---------------------");
        SinglyLinkedListSentinel list2 = new SinglyLinkedListSentinel();
        list2.addFirst(1);
        list2.forEach(System.out::println);

    }

    public static void main(String[] args) {
        SinglyLinkedListSentinel list1 = getLinkedList();
        list1.remove(2);
        list1.forEach(System.out::println);
        System.out.println("------------------------");
        SinglyLinkedListSentinel list2 = getLinkedList();
        list2.remove(0);
        list2.forEach(System.out::println);
        System.out.println("------------------------");
        SinglyLinkedListSentinel list3 = getLinkedList();

    }

    private static SinglyLinkedListSentinel getLinkedList(){
        SinglyLinkedListSentinel list = new SinglyLinkedListSentinel();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        return list;
    }
}
