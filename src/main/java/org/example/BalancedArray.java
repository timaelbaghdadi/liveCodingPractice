package org.example;

import java.util.ArrayDeque;

public class BalancedArray {

    public BalancedArray(){};

    public boolean isBalancedArray(String s1) {
        ArrayDeque<Character> deque = new ArrayDeque();


        if (s1.isEmpty()) {
            return true;
        } else {
            for(int i = 0; i < s1.length(); ++i) {
                if (s1.charAt(i) == '{' || s1.charAt(i) == '(' || s1.charAt(i) == '[') {
                    deque.addFirst(s1.charAt(i));
                }

                if (!deque.isEmpty() && ((Character)deque.peekFirst() == '{' && s1.charAt(i) == '}' ||
                        (Character)deque.peekFirst() == '(' && s1.charAt(i) == ')' ||
                        (Character)deque.peekFirst() == '[' && s1.charAt(i) == ']')) {
                    deque.removeFirst();
                }
            }

            System.out.println();
            return deque.isEmpty();
        }
    }
}
