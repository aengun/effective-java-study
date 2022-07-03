package item_26;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        printList(list);
        System.out.println("==============================");
        List<String> listString = List.of("a", "b", "c");
        printList(listString);
        System.out.println("==============================");
        List<?> wildCardList1 = List.of("1", "2", "3");
        printList(wildCardList1);
        System.out.println("==============================");
        List<?> wildCardList2 = new ArrayList<>();
        wildCardList2.add(null);
//        wildCardList2.add(1); // 오류 남
        printList(wildCardList2);
    }

    public static void printList(List<?> list) {
        for (Object o : list) {
            System.out.println(o + " ");
        }
    }
}