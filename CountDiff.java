import java.io.*;
import java.util.*;

//Pair of numbers in a an array, given difference between them.

public class CountDiff {
	
	public static int arrayPairDiff(int[] arr, int k)
	{
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		int count = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(hmap.containsKey(arr[i]))
			{
				hmap.put(arr[i], ++count);
			}
			else
			{
				hmap.put(arr[i], 1);
			}
			
			
		}
		count = 0;
		for(int j=0;j<arr.length;j++)
		{
			if(hmap.containsKey(arr[j]+k))
			{
				count+= hmap.get(arr[j]+k);
			}
		}
	
			
			
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,1,5,6,9,7,90};
		int num = arrayPairDiff(a, 4);
		System.out.println(num);

	}

}
