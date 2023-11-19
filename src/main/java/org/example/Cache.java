package org.example;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Cache {
    private final Integer capacity;
    private final Deque<String> list = new LinkedList<>();
    private final Map<String, Integer> ValueAndPosition = new HashMap<>();

    public Cache(int capacity) {
        this.capacity = capacity;
    }

    public void push(String s) {

        if (ValueAndPosition.get(s) != null) { // if cache contains already the string
            list.remove(s); // o(n)
        } else {
            if (this.list.size() > capacity) {
                this.list.removeLast();
            }
        }

        this.list.addFirst(s);

        ValueAndPosition.put(s, this.list.size() - 1);

    }

    public String obtain(String s) {
        return this.list.getFirst();
    }
}
