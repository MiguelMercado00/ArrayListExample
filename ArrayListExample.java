import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        System.out.println("This is an example of an ArrayList with different data types.");
        ArrayList<String> myArrayList = ArrayListString();
        System.out.println(myArrayList.get(0));
        ArrayList<Integer> myArrayList2 = ArrayListInteger();
        System.out.println(myArrayList2.get(0));
        ArrayList<Double> myArrayList3 = ArrayListDouble();
        System.out.println(myArrayList3.get(0));
        ArrayList<Character> myArrayList4 = ArrayListCharacter();
        System.out.println(myArrayList4.get(0));
        ArrayList<Boolean> myArrayList5 = ArrayListBoolean();
        System.out.println(myArrayList5.get(0));
        ArrayList myArrayList6 = list();
        System.out.println(myArrayList6.get(0));
    }

    public static ArrayList<String> ArrayListString() {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Hello");
        list1.add("World");
        list1.add("Java");
        list1.add("Programming");
        return list1;
    }

    public static ArrayList<Integer> ArrayListInteger() {
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        return list2;
    }

    public static ArrayList<Double> ArrayListDouble() {
        ArrayList<Double> list3 = new ArrayList<>();
        list3.add(1.0);
        list3.add(2.0);
        list3.add(3.0);
        list3.add(4.0);
        return list3;
    }

    public static ArrayList<Character> ArrayListCharacter() {
        ArrayList<Character> list4 = new ArrayList<>();
        list4.add('a');
        list4.add('b');
        list4.add('c');
        list4.add('d');
        return list4;
    }

    public static ArrayList<Boolean> ArrayListBoolean() {
        ArrayList<Boolean> list5 = new ArrayList<>();
        list5.add(true);
        list5.add(false);
        list5.add(true);
        list5.add(false);
        return list5;
    }

    public static ArrayList list() {
        ArrayList list = new ArrayList<>();
        list.add("Yeah");
        list.add(1);
        list.add(1.0);
        list.add('a');
        list.add(true);
        return list;
    }

}


