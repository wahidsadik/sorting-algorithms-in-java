package com.wahid.algorithms.sort.bubbleSort;

import com.wahid.algorithms.sort.SortForPrimitiveInt;
import com.wahid.algorithms.sort.utils.SortTestingHelper;

public class BubbleSortForPrimitiveInt implements SortForPrimitiveInt {

    private final static BubbleSortForPrimitiveInt INSTANCE = new BubbleSortForPrimitiveInt();

    private BubbleSortForPrimitiveInt() {
    }

    public static BubbleSortForPrimitiveInt instance() {
        return INSTANCE;
    }

    @Override
    public void sort(int[] array) {
        for (int indexOuter = 0; indexOuter < array.length - 1; indexOuter++) {
            for (int indexInner = 0; indexInner < array.length - indexOuter - 1; indexInner++) {
                if (array[indexInner] > array[indexInner + 1]) {
                    SortTestingHelper.swap(array, indexInner, indexInner + 1);
                }
            }
        }
    }
}
