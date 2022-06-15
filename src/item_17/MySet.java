package item_17;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MySet<E> extends ForwardingSet<E> {
    private int addCount = 0;

    public MySet(Set<E> s) {
        super(s);
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }

    public static void main(String[] args) {
        MySet<String> s = new MySet<>(new HashSet<>());
        s.addAll(List.of("틱", "탁탁", "펑"));
        System.out.println(s.getAddCount());
    }
}