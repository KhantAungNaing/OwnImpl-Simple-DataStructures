package com.kan.datastructures;

import java.util.Arrays;

public class ArrayStructure {

	int[] arr = new int[0];
	int size = 0;

	public void add(int data) {
		arr = Arrays.copyOf(arr, arr.length + 1);
		arr[arr.length - 1] = data;
		size++;
	}

	public int remove() {

		if (isEmpty()) {
			return -1;
		}
		int output = arr[arr.length - 1];
		arr = Arrays.copyOf(arr, arr.length - 1);
		size--;
		return output;
	}

	public int remove(int index) {
		if (isEmpty()) {
			return -1;
		}

		int temp;
		temp = arr[index];
		for (int i = index; i < arr.length; i++) {
			if (i == arr.length - 1) {
				arr = Arrays.copyOf(arr, arr.length - 1);
				break;
			}
			arr[i] = arr[i + 1];
		}
		size--;
		return temp;
	}

	public void showLinkedListStructure() {
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

	public int[] sort() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	public boolean isEmpty() {
		return arr == null || arr.length == 0;
	}

}
