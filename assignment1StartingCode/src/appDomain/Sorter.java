package appDomain;

import shapes.Shape;

public class Sorter {

    public static Shape[] bubbleSort(Shape[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].getHeight() < array[i + 1].getHeight()) {
                swap(array, i, i + 1);
                i = -1; // Restart loop to ensure complete sorting
            }
        }
        return array;
    }

    public static Shape[] insertionSort(Shape[] array) {
        for (int i = 1; i < array.length; i++) {
            Shape currentShape = array[i];
            int j = i - 1;

            while (j >= 0 && array[j].getHeight() < currentShape.getHeight()) {
                array[j + 1] = array[j]; // Shift elements to the right
                j--;
            }
            array[j + 1] = currentShape;
        }
        return array;
    }

    public static Shape[] selectionSort(Shape[] array) {
        for (int i = 0; i < array.length; i++) {
            int largestIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].getHeight() > array[largestIndex].getHeight()) {
                    largestIndex = j;
                }
            }
            swap(array, i, largestIndex);
        }
        return array;
    }

    public static Shape[] mergeSort(Shape[] array) {
        if (array.length < 2) return array;

        int mid = array.length / 2;
        Shape[] left = new Shape[mid];
        Shape[] right = new Shape[array.length - mid];

        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, array.length - mid);

        mergeSort(left);
        mergeSort(right);

        return merge(array, left, right);
    }

    private static Shape[] merge(Shape[] array, Shape[] left, Shape[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i].getHeight() >= right[j].getHeight()) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }
        while (i < left.length) array[k++] = left[i++];
        while (j < right.length) array[k++] = right[j++];
        
        return array;
    }

    public static Shape[] quickSort(Shape[] array) {
        quickSort(array, 0, array.length - 1);
        return array;
    }

    private static void quickSort(Shape[] array, int low, int high) {
        if (low >= high) return;

        int pivotIndex = partition(array, low, high);
        quickSort(array, low, pivotIndex - 1);
        quickSort(array, pivotIndex + 1, high);
    }

    private static int partition(Shape[] array, int low, int high) {
        Shape pivot = array[high];
        int i = low;

        for (int j = low; j < high; j++) {
            if (array[j].getHeight() >= pivot.getHeight()) {
                swap(array, i, j);
                i++;
            }
        }
        swap(array, i, high);
        return i;
    }

    private static void swap(Shape[] array, int i, int j) {
        Shape temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

	
	public static Shape[] customSort(Shape[] array) 
	{

		
		return array;
	}
	
}
