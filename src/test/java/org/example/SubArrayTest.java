package org.example;

import org.junit.jupiter.api.Test;
import org.example.SubArray;

import static org.junit.jupiter.api.Assertions.*;

class SubArrayTest {

    @Test
    public void checkSubArraySum0(){
        SubArray sa = new SubArray();

        int arr[] = {4, 2, -3, 1, 6};

        assertTrue(sa.findSubArraySum0(arr));


        arr = new int[]{4, 2, 0, 1, 6};

        assertTrue(sa.findSubArraySum0(arr));

    }

}