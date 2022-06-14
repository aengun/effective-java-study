package item_17;

import java.util.List;

public class main {

    public static void main(String[] args) {

        InstrumentedHashSet<String> s = new InstrumentedHashSet<>();
        s.addAll(List.of("틱틱", "탁탁", "펑"));
        System.out.println(s.toString());
        System.out.println(s.size());
        System.out.println(s.getAddCount());

    }

}
