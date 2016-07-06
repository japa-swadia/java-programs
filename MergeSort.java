import java.util.*;

public class MergeSort {
	
	private int[] numbers;
	private int[] helper;
	
	private int len;
	
	public void sort(int[] values)
	{
		this.numbers = values;
		len = numbers.length;
		this.helper = new int[len];
		mergeSort(0, len-1);
	}
	
	public void mergeSort(int low, int high)
	{
		if(low<high)
		{
			int mid = low + (high-low)/2;
			
			mergeSort(low,mid);
			mergeSort(mid+1,high);
			
			merge(low,mid,high);
		}
		
	}
	
	public void merge(int low, int mid, int high)
	{
		for(int i = low; i<=high; i++)
		{
			helper[i] = numbers[i];
		}
		
		int i = low;
		int j = mid+1;
		int k = low;
		
		while (i <= mid && j <= high) {
		      if (helper[i] <= helper[j]) {
		        numbers[k] = helper[i];
		        i++;
		      } else {
		        numbers[k] = helper[j];
		        j++;
		      }
		      k++;
		    }
		    // Copy the rest of the left side of the array into the target array
		    while (i <= mid) {
		      numbers[k] = helper[i];
		      k++;
		      i++;
		    }

	}
	

}
