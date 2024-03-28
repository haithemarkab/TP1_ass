package org.example;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Array;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertThrows;






public class BinarySearchTest {

    private BinarySearch binarySearch;
    @BeforeEach
    void SetUp() {
        binarySearch = new BinarySearch();
    }



    @Test
    void testArrayIsNULL() {
        Array a = null;
        assertThrows(NullPointerException.class, () -> BinarySearch.binarySearch(null, 1));
    }
    @Test
    void testElementNotInTheArray() {
        int[] array = {10, 20, 30, 40, 50,100};
        int element = 500;
        int index = BinarySearch.binarySearch(array, element);
        Assertions.assertEquals(-1, index);
    }
    @Test
    void testBinarySearch2() {
        int[] array = {10, 20, 30, 40, 50,100};
        int element = 20;
        int index = BinarySearch.binarySearch(array, element);
        Assertions.assertEquals(1, index);
    }
/*
    @Test
    void testMidollfArrayGreaterThanElement() {

        int index = BinarySearch.binarySearch(array, element);
        Assertions.assertEquals(1, index);
    }*/

    @Test
    void testMidollfArrayGreaterThanElement() {
        int[] array = {10, 20, 30, 40, 50,100};
        int element = 20;
        int index = BinarySearch.binarySearch(array, element);
        Assertions.assertEquals(1, index);
    }
}