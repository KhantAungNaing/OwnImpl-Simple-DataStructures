package com.kan.datastructures;

import java.util.Arrays;

public class Stack {

	private int[] arr = new int[0];
	private int index = 0;
	private int size = 0;

	public void push(int data) {
		arr = Arrays.copyOf(arr, arr.length + 1);
		arr[index] = data;
		size++;
		index++;
	}

	public int pop() {

		if (isEmpty(arr)) {
			return -1;
		}

		int output;
		index--;
		output = arr[index];
		arr = Arrays.copyOf(arr, arr.length - 1);
		size--;
		return output;
	}

	public void showStackStructure() {
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
		return array.length == 0 || array == null;
	}

}
