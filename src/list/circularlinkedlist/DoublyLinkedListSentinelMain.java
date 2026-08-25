package list.circularlinkedlist;

public class DoublyLinkedListSentinelMain {

    public static void main1(String[] args) {
        DoublyLinkedListSentinel list = new DoublyLinkedListSentinel();

        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);

        list.forEach(System.out::println);

    }

    public static void main2(String[] args) {
        DoublyLinkedListSentinel list = new DoublyLinkedListSentinel();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        list.forEach(System.out::println);
    }

    public static void main3(String[] args) {
        DoublyLinkedListSentinel list = getList();
        list.removeFirst();
        list.forEach(System.out::println);
        System.out.println("------------------------");
        list.removeFirst();
        list.forEach(System.out::println);
        System.out.println("------------------------");
        list.removeFirst();
        System.out.println("------------------------");
        list.forEach(System.out::println);
        list.removeFirst();
        System.out.println("------------------------");
        list.forEach(System.out::println);
        System.out.println("------------------------");
        list.removeFirst();
        list.forEach(System.out::println);
        System.out.println("------------------------");
        list.removeFirst();
        list.forEach(System.out::println);
        System.out.println("------------------------");
        list.removeFirst();
        list.forEach(System.out::println);
    }

    public static void main4(String[] args) {
        DoublyLinkedListSentinel list = getList();
        list.removeLast();
        list.forEach(System.out::println);
        System.out.println("------------------------");
        list.removeLast();
        list.forEach(System.out::println);
        System.out.println("------------------------");
        list.removeLast();
        list.forEach(System.out::println);
        System.out.println("------------------------");
        list.removeLast();
        list.forEach(System.out::println);
        System.out.println("------------------------");
        list.removeLast();
        list.forEach(System.out::println);
        System.out.println("------------------------");
        list.removeLast();
        list.forEach(System.out::println);
        System.out.println("------------------------");

    }

    public static void main(String[] args) {
        DoublyLinkedListSentinel list = getList();
        list.removeByValue(1);
        list.forEach(System.out::println);
        System.out.println("------------------------");
        list.removeByValue(2);
        list.forEach(System.out::println);
        System.out.println("------------------------");
        list.removeByValue(3);
        list.forEach(System.out::println);
        System.out.println("------------------------");
        list.removeByValue(4);
        list.forEach(System.out::println);
        System.out.println("------------------------");
        list.removeByValue(5);
        list.forEach(System.out::println);
        System.out.println("------------------------");



    }
    private static DoublyLinkedListSentinel getList(){
        DoublyLinkedListSentinel list = new DoublyLinkedListSentinel();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        return list;

    }
}
