package array;

public class Main {

    public static void main1(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.addLast(1);
        dynamicArray.addLast(2);
        dynamicArray.addLast(3);
        dynamicArray.addLast(4);
//        dynamicArray.addLast(5);
        dynamicArray.add(2,5);

        for (int i = 0 ; i<5;i++){
            System.out.println(dynamicArray.get(i));
        }
    }

    public static void main2(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.addLast(1);
        dynamicArray.addLast(2);
        dynamicArray.addLast(3);
        dynamicArray.addLast(4);

        dynamicArray.forEach(System.out::println);
    }

    public static void main3(String[] args) {

        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.addLast(1);
        dynamicArray.addLast(2);
        dynamicArray.addLast(3);
        dynamicArray.addLast(4);

        for(var element: dynamicArray){
            System.out.println(element);
        }

    }

    public static void main4(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.addLast(1);
        dynamicArray.addLast(2);
        dynamicArray.addLast(3);
        dynamicArray.addLast(4);

        dynamicArray.stream().forEach(System.out::println);
    }

    public static void main5(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.addLast(1);
        dynamicArray.addLast(2);
        dynamicArray.addLast(3);
        dynamicArray.addLast(4);
        dynamicArray.addLast(5);

        int remove = dynamicArray.remove(2);
        System.out.println(remove);
        System.out.println("---------------------");
        dynamicArray.stream().forEach(System.out::println);
    }

    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        for(int i = 0; i<9;i++){
            dynamicArray.addLast(i+1);
        }
        dynamicArray.stream().forEach(System.out::println);
    }


}
