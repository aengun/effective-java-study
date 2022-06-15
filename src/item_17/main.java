package item_17;

import java.util.List;
import java.util.Set;

public class main {

    public static void main(String[] args) {

        InstrumentedHashSet<String> s = new InstrumentedHashSet<>();
        s.addAll(List.of("틱틱", "탁탁", "펑", "a", "11"));
        System.out.println(s.toString());
        System.out.println(s.size());
        System.out.println(s.getAddCount());

//        Set<String> set = new ForwardingSet<>();
//        MySet<String> mySet = new MySet<>();
//        mySet.addAll(List.of("틱틱", "탁탁", "펑", "a", "11"));

    }

}
