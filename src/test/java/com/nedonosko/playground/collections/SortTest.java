package com.nedonosko.playground.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * Unit test for "How would you write a generic function in Java 17 that can
 * sort arbitrary number of objects in DESC order?".
 */
public class SortTest {

    @Test
    public void testGenericObjectsDescSort() {
        // Given: mix of objects
        List<Object> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new String("string #" + i));
        }
        for (int i = 0; i < 10; i++) {
            list.add(new TestObject("object #" + i));
        }
        for (int i = 0; i < 10; i++) {
            list.add(Long.valueOf(i));
        }
        System.out.println("Original order: ");
        list.stream().forEach(o -> System.out.println(o));

        // When sort them in reverse order
        Collections.sort(list, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return o2.toString().compareTo(o1.toString());
            }
        });

        // Then the list is DESC sorted (lexicographically)
        System.out.println("Sorted order: ");
        list.stream().forEach(o -> System.out.println(o));
    }
}
