package com.kan.datastructures;

import java.util.Arrays;

public class Queue {

	int[] arr = new int[0];
	int size = 0;

	public void add(int data) {
		arr = Arrays.copyOf(arr, arr.length + 1);
		arr[arr.length - 1] = data;
		size++;
	}

	public int remove() {

		if (isEmpty(arr)) {
			return -1;
		}

		int output;
		output = arr[0];
		size--;

		for (int i = 0; i < arr.length; i++) {
			if (i + 1 == arr.length) {
				break;
			}

			arr[i] = arr[i + 1];
		}

		arr = Arrays.copyOf(arr, arr.length - 1);
		return output;
	}

	public int peek() {
		if (isEmpty(arr)) {
			return -1;
		}

		return arr[0];
	}

	public void showQueueStructure() {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (arr.length - 1 == i) {
				System.out.print(arr[i]);
			} else {
				System.out.print(arr[i] + ",");
			}

		}
		System.out.println("]");
	}

	public int size() {
		return size;
	}

	public boolean isEmpty(int[] array) {
		return array == null || array.length == 0;
	}

}
