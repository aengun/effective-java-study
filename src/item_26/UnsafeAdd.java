package item_26;

import java.util.ArrayList;
import java.util.List;

public class UnsafeAdd {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

//        unsafeAdd(strings, Integer.valueOf(42));
//        unsafeAdd2(strings, Integer.valueOf(42));
        String s = strings.get(0);
    }

    // 로 타입
    private static void unsafeAdd(List list, Object o) {
        list.add(o);
    }

    // List<Object>
    private static void unsafeAdd2(List<Object> list, Object o) {
        list.add(o);
    }

}