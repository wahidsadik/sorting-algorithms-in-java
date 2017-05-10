package com.wahid.algorithms.sort.selectionSort;

import com.wahid.algorithms.sort.SortForPrimitiveInt;
import com.wahid.algorithms.sort.utils.SortTestingHelper;

public class SelectionSortForPrimitiveInt implements SortForPrimitiveInt {

    private final static SelectionSortForPrimitiveInt INSTANCE = new SelectionSortForPrimitiveInt();

    private SelectionSortForPrimitiveInt() {
    }

    public static SelectionSortForPrimitiveInt instance() {
        return INSTANCE;
    }

    @Override
    public void sort(int[] array) {
        for (int indexOuter = 0; indexOuter < array.length; indexOuter++) {
            int indexSmallestInIteration = indexOuter;
            for (int indexInner = indexOuter + 1; indexInner < array.length; indexInner++) {
                if (array[indexInner] < array[indexSmallestInIteration]) {
                    indexSmallestInIteration = indexInner;
                }
            }
            SortTestingHelper.swap(array, indexOuter, indexSmallestInIteration);
        }
    }

}
