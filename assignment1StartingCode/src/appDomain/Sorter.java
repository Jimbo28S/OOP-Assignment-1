package appDomain;

import shapes.Shape;

public class Sorter {

	
	public static Shape[] bubbleSort(Shape[] array) 
	{
		for (int i = 0; i < array.length - 1; i++) 
		{
			if (array[i].getHeight() < array[i + 1].getHeight()) 
			{
				Shape holding = array[i];
				array[i] = array[i + 1];
				array[i + 1] = holding;
				i = -1;
			}
		}
		
		return array;
	}
	
	public static Shape[] insertionSort(Shape[] array) 
	{
		for (int i = 0; i < array.length; i++) 
		{
			Shape currentShape = array[i];
			int j = i - 1;
			
			while (j >= 0 && array[j].getHeight() < currentShape.getHeight()) 
			{
				array[j + 1] = array[j];
				j -= 1;
			}
			
			array[j + 1] = currentShape;
		}
		
		return array;
	}
		
	
	public static Shape[] selectionSort(Shape[] array) 
	{
		for (int i = 0; i < array.length; i++) 
		{
			Shape currentShape = array[i];
			int smallestIndex = i;
			
			for (int j = i + 1; j < array.length; j++) 
			{
				if (array[j].getHeight() > array[smallestIndex].getHeight()) 
				{
					smallestIndex = j;
				}
			}
			array[i] = array[smallestIndex];
			array[smallestIndex] = currentShape;
		}
		
		return array;
	}
	
	public static Shape[] mergeSort(Shape[] array) 
	{
		
		
		return array;
	}
	
	public static Shape[] quickSort(Shape[] array) 
	{

		
		return array;
	}
	
	public static Shape[] customSort(Shape[] array) 
	{

		
		return array;
	}
	
}
