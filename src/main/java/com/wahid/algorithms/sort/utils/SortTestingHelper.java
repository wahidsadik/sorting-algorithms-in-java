package com.wahid.algorithms.sort.utils;

import java.util.Random;

public class SortTestingHelper {
	private SortTestingHelper() {
		throw new RuntimeException("SortTestingHelper should not be instanciated.");
	}

	public static int[] createPrimitiveIntArrayWithRanmodData(int size) {
		int[] array = createPrimitiveIntArray(size);
		populateRandomData(array);
		
		return array;
	}

	private static int[] createPrimitiveIntArray(int size) {
		int[] array = new int[size];
		
		
		return array;
	}
	
	private static void populateRandomData(int[] array) {
		Random random = new Random(System.currentTimeMillis());
		final int length = array.length;
		for(int i = 0; i<length; i++) {
			array[i] = random.nextInt();
		}
	}
	
	public static boolean isSorted(int[] array) {
		final int length = array.length;
		for(int i = 0; i<length - 1; i++) {
			if(array[i] > array[i+1]) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
