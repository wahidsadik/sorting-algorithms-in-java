package com.wahid.algorithms.sort;

import com.wahid.algorithms.sort.selectionSort.SelectionSortForPrimitiveInt;

public class SortForPrimitiveIntFactory {
	
	private static final SortForPrimitiveIntFactory instance = new SortForPrimitiveIntFactory();
	
	private SortForPrimitiveIntFactory() {}
	
	public static SortForPrimitiveIntFactory instance() {
		return instance;
	}

	public SelectionSortForPrimitiveInt selectionSort() {
		return SelectionSortForPrimitiveInt.instance();
	}
}
