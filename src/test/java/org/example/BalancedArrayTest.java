package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedArrayTest {

    @Test
    public void checkBalancedArray(){
        BalancedArray ba = new BalancedArray();

        String exp = "[()]{}{[()()]()}";
        assertTrue(ba.isBalancedArray(exp));

        exp = "[(])";
        assertFalse(ba.isBalancedArray(exp));
    }

}