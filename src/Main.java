import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Java Generics!");
        List list1 = new ArrayList();
        list1.add(1);
        list1.add("hello");
        // String s = (String) list1.get(0); ClassCastException
        List<String> list2 = new ArrayList<>();
        list2.add("hello");
        // list2.add(1); not legal
        String s2 = list2.get(0);
        System.out.println(s2);
        System.out.println("--- My Generic demo ---");
        MyGeneric<Integer, String> my_g = new MyGeneric<>(12, "string");
        String s_attr = my_g.getS_attribute();
        Integer t_attr = my_g.getT_attribute();
        System.out.println("S attr: "+s_attr+" T attr: "+t_attr);
        System.out.println("--- Generic function demo---");
        String[] a = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        // List<String> l_a = toList(a); cant use with Strings!
        Integer[] ints = new Integer[]{1, 2, 3, 4, 5, 6, 7};
        List<Integer> l_i = toList(ints);
        l_i.forEach(System.out::println);
        System.out.println("--- Upper Bounded Wildcard ---");
        addNumbers(l_i);
    }

    public static <T extends Number & Comparable> List<T> toList(T[] a) {
        return Arrays.stream(a).collect(Collectors.toList());
    }

    public static void addNumbers(List<? extends Number> list) {
        list.forEach(System.out::println);
    }
}
