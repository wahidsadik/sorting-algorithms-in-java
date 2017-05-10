package com.wahid.algorithms.sort;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.wahid.algorithms.sort.utils.SortTestingHelper;

public class TestPrimitiveIntSortAlgorithms {

    private int[] array;

    @Before
    public void setup() {
        array = SortTestingHelper.createPrimitiveIntArrayWithRanmodData(1000);
    }

    @Test
    public void testBuiltinSort() {
        assertFalse("BEFORE: array is sorted initially", SortTestingHelper.isSorted(array));
        Arrays.sort(array);
        assertTrue("AFTER: array is not sorted", SortTestingHelper.isSorted(array));
    }

    @Test
    public void testSelectionSort() {
        assertFalse("BEFORE: array is sorted initially", SortTestingHelper.isSorted(array));
        SortForPrimitiveIntFactory.instance().selectionSort().sort(array);
        assertTrue("AFTER: array is not sorted", SortTestingHelper.isSorted(array));
    }

    @Test
    public void testBubbleSort() {
        assertFalse("BEFORE: array is sorted initially", SortTestingHelper.isSorted(array));
        SortForPrimitiveIntFactory.instance().bubbleSort().sort(array);
        assertTrue("AFTER: array is not sorted", SortTestingHelper.isSorted(array));
    }
}
