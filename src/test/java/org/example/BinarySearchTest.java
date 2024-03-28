package org.example;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.lang.reflect.Array;
import org.junit.jupiter.api.BeforeEach;






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
    void testBinarySearch() {
        int[] array = {10, 20, 30, 40, 50,100};
        int element = 5;
        int index = BinarySearch.binarySearch(array, element);
        Assertions.assertEquals(2, index);
    }

    @Test
    void testElementNotInTheArray() {
        int[] array = {10, 20, 30, 40, 50,100};
        int element = 5;
        int index = BinarySearch.binarySearch(array, element);
        Assertions.assertEquals(-1, index);
    }

    @Test
    void testMidofArrayGreaterThanElement() {
        // To Rename later
        int[] array = {10, 20, 30, 40, 50,100};
        int element = 3;
        int index = BinarySearch.binarySearch(array, element);
        Assertions.assertEquals(1, index);
    }
}